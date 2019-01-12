package com.youzhong.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.aspectj.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Require;
import com.youzhong.service.IRequireService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.RequireUserVo;
import com.youzhong.utils.ResponseStatus;

@Controller
@RequestMapping("/require")
public class RequireController {
	@Autowired
	private IRequireService requireService;
	  @RequestMapping("/list")
	  @ResponseBody
	  public Datagrid<RequireUserVo> list(Integer page,Integer rows){
		 PageUtils pageUtils = new  PageUtils(page,rows);
		 Datagrid<RequireUserVo> datagrid = requireService.findByPage(pageUtils);
		 List<RequireUserVo> list = datagrid.getRows();
		 System.out.println(list);
		 return datagrid;
	  }
	  @RequestMapping("/toadd")
	  public String toadd(){
		  return "require/toadd";
	  }
	  @RequestMapping("/add")
	  @ResponseBody
	  public Long add(Require require){
		  return requireService.add(require);
	  }
	  @RequestMapping(value="exportExcel")
	  public void exportExcel(HttpServletRequest request,HttpServletResponse response){
		  FileOutputStream outputStream=null;
		  try {
			//创建excel工作目录
			  HSSFWorkbook workbook = new HSSFWorkbook();
			  //创建sheet
			  HSSFSheet sheet = workbook.createSheet("需求管理");
			  //创建标题行
			  HSSFRow row = sheet.createRow(0);
			  
			  List<Map> cols = requireService.getColComments();
			  //中英文转换集合
			  Map cn_enMap=new HashMap();
			  List cnList=new ArrayList();
			  for(int i=0;i<cols.size();i++){
				  Map data=cols.get(i);
				  HSSFCell cell = row.createCell(i);
				  cell.setCellValue( data.get("COMMENTS").toString());
				  cn_enMap.put(data.get("COMMENTS").toString(), data.get("COLUMN_NAME").toString());
			      cnList.add(data.get("COMMENTS").toString());
			  }
			 
			  //创建数据行
			  List<Map> datas = requireService.getDatas();
			  for (int i = 0; i < datas.size(); i++) {
				Map data=datas.get(i);
				HSSFRow dataRow=sheet.createRow(i+1);
				for (int j = 0; j < cnList.size(); j++) {
					 HSSFCell cell = dataRow.createCell(j);
					 //中文字段
					 String cnClo=cnList.get(j).toString();
					 //英文字段
					 String enCol=cn_enMap.get(cnClo).toString();
					 //数据
					 String val=data.get(enCol)==null?"":data.get(enCol).toString();
					  cell.setCellValue(val);
				}
			}
			  
			  
			  
			 outputStream= new FileOutputStream("D:\\1.xls");			 
				workbook.write(outputStream);
			  //文件下载
				//FileUtil.downloadFile(response,"D:\\1.xls","1.xls");
				com.youzhong.utils.FileUtil.downloadFile(response, "D:\\1.xls", "1.xls");
					
				
				
		   } catch (Exception e) {			
			e.printStackTrace();
		   }finally{
			   try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	  }

}
