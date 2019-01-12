/*
 * The MIT License
 *
 * Copyright 2013 jdmr.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.youzhong.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.imgscalr.Scalr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.youzhong.entity.Image;
import com.youzhong.entity.Reqimg;
import com.youzhong.service.IImageService;
import com.youzhong.service.IReqingService;

/**
 *
 * @author jdmr
 */
@Controller
//@RequestMapping("/file")
public class ImageController {
	 private String fileUploadDirectory = "D:\\eclipse\\workspace\\maven002\\src\\main\\webapp\\upload";
	 @Autowired
	 private IImageService imageservice;
	 @Autowired
	 private IReqingService reqimgService;
    //private static final Logger log = LoggerFactory.getLogger(ImageController.class);
   /* @RequestMapping
    public String index() {
        log.debug("ImageController home");
        return "image/index";
    }*/
    
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public @ResponseBody Map list() {
        //log.debug("uploadGet called");
       // List<Image> list = imageDao.list();
        //for(Image image : list) {
            //image.setUrl("/picture/"+image.getId());
           // image.setThumbnailUrl("/thumbnail/"+image.getId());
          //  image.setDeleteUrl("/delete/"+image.getId());
          //  image.setDeleteType("DELETE");
        //}
    	 List<Image> list = new ArrayList<>();
        Map<String, Object> files = new HashMap<>();
       files.put("files", list);
       // log.debug("Returning: {}", files);
        return files;
    }
    
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody Map upload(MultipartHttpServletRequest request, HttpServletResponse response,Long ids) {
        //log.debug("uploadPost called");
        Iterator<String> itr = request.getFileNames();
        MultipartFile mpf;
        List<Image> list = new LinkedList<>();
        
        while (itr.hasNext()) {
            mpf = request.getFile(itr.next());
            //log.debug("Uploading {}", mpf.getOriginalFilename());
            
            String newFilenameBase = UUID.randomUUID().toString();
            String originalFileExtension = mpf.getOriginalFilename().substring(mpf.getOriginalFilename().lastIndexOf("."));
            String newFilename = newFilenameBase + originalFileExtension;
            String storageDirectory = fileUploadDirectory;
            String contentType = mpf.getContentType();
            
            File newFile = new File(storageDirectory + "/" + newFilename);
            try {
                mpf.transferTo(newFile);
                InputStream is = mpf.getInputStream();
                byte[] bytes = FileCopyUtils.copyToByteArray(is);
                
                BufferedImage thumbnail = Scalr.resize(ImageIO.read(newFile), 150);
                String thumbnailFilename = newFilenameBase + "-thumbnail.png";
                File thumbnailFile = new File(storageDirectory + "/" + thumbnailFilename);
                ImageIO.write(thumbnail, "png", thumbnailFile);
                
                Image image = new Image();
               
                image.setName(mpf.getOriginalFilename());
                image.setThumbnailFilename(thumbnailFilename);
                image.setNewFilename(newFilename);
                image.setContentType(contentType);
                image.setSize(mpf.getSize());
                image.setThumbnailSize(thumbnailFile.length());
                                
                image.setUrl("/picture/"+image.getNewFilename()+".do");
                image.setThumbnailUrl("/thumbnail/"+image.getThumbnailFilename()+".do");
                image.setDeleteUrl("/delete/" + image.getNewFilename()+ "&"+image.getThumbnailFilename()+".do");
                image.setDeleteType("DELETE");
                
                Reqimg reqimg = new Reqimg();
                reqimg.setName(thumbnailFilename);
                reqimg.setUrl(storageDirectory + "/" + thumbnailFilename);
                reqimg.setReqid(ids);
                reqimg.setImg(bytes);
                reqimgService.insert(reqimg);
                list.add(image);
                
            } catch(IOException e) {
                //log.error("Could not upload file "+mpf.getOriginalFilename(), e);
            }
            
        }
        
        Map<String, Object> files = new HashMap<>();
        files.put("files", list);
       
        return files;
    }
    
    @RequestMapping(value = "/picture/{name}", method = RequestMethod.GET)
   public void picture(HttpServletResponse response, @PathVariable String  name) throws IOException {
        //Image image = imageDao.get(id);
        File imageFile = new File(fileUploadDirectory+"/"+name);
        response.setContentType(name);
       // response.setContentLength(image.getSize().intValue());
        InputStream is=null;
        try {
             is = new FileInputStream(imageFile);
            IOUtils.copy(is, response.getOutputStream());
           
       } catch(IOException e) {
           //log.error("Could not show picture "+id, e);
        }finally{
        	 is.close();
        }
    }
    
    @RequestMapping(value = "/thumbnail/{name}/{ContentType}", method = RequestMethod.GET)
    public void thumbnail(HttpServletResponse response, @PathVariable String name) throws IOException {
        //Image image = imageDao.get(id);
    	String[] split = name.split("&");
        File imageFile = new File(fileUploadDirectory+"/"+split[0]);
        response.setContentType("image/png");
        //response.setContentLength(image.getThumbnailSize().intValue());
        InputStream is=null;
        try {
             is = new FileInputStream(imageFile);
            IOUtils.copy(is, response.getOutputStream());
           
        } catch(IOException e) {
         //   log.error("Could not show thumbnail "+id, e);
        }finally{
       	 is.close();
       }
    }
    
    @RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
    public @ResponseBody List delete(@PathVariable String name) {
        //Image image = imageDao.get(id);
        String[] split = name.split("&");
        File imageFile = new File(fileUploadDirectory + "/" + split[0]);
        imageFile.delete();
        File thumbnailFile = new File(fileUploadDirectory + "/" + split[1]);
        thumbnailFile.delete();
        //imageDao.delete(image);
        List<Map<String, Object>> results = new ArrayList<>();
        Map<String, Object> success = new HashMap<>();
        success.put("success", true);
        results.add(success);
        return results;
    }
   
}
