<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      
       <form id="require-add-form">
           <input type="hidden" id="requireId">
             <table align="center">
                   <tr ><th  >所属产品：<input class="easyui-combobox" name="proid" id="proid-combobox"></th>
                       <th >所属模块：<input class="easyui-combobox" name="modelid" id="modelid-combobox"
                       data-options="valueField:'id',textField:'name'"></th>
                   </tr>
                   
                    <tr ><th >所属计划：<input class="easyui-combobox" name="planid" id="planid-combobox"
                    data-options="valueField:'id',textField:'name'"></th>
                       <th>所属来源:<input class="easyui-combobox" name="fromid" id="fromid-combobox"></th>
                   </tr>
                   
                    <tr >
                       <th colspan="2" align="center">由谁评审：<input class="easyui-combobox" name="examuser" id="examuser-combobox"></th>
                   </tr>
                   
                   <tr ><th>需求名称：<input class="easyui-textbox" name="name" id=""></th>
                       <th>优先级：<select name="rLevel" id="rLevel-youxian"></select></th>
                   </tr>
                   
                    <tr >
                       <th colspan="2" align="center">需求描述：</th>
                   </tr>
                   
                   <tr >
                       <th colspan="2"><textarea style="width:200px;height:100px;visibility:hidden" name="content"></textarea></th>
                   </tr>
                   
                   <tr >
                       <th colspan="2" align="center">抄送给：<input class="easyui-combobox" name="senduser" id="senduser-combobox"></th>
                   </tr>
                   
                   <tr >
                       
                       <th colspan="2" align="center"><button type="button" onClick="bbbcccaaa()">保存</button></th>
                   </tr>
             </table>
       </form>
         <div id="sp">
        <div style="color:#99BBE8;background:#fafafa;padding:5px;">Select a language</div>
        <div>
            <img src="${pageContext.request.contextPath}/static/images/001.png" value="1" text="1" height="30"></img>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/static/images/002.png" value="2" text="2" height="30"></img>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/static/images/003.png" value="3" text="3" height="30"></img>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/static/images/004.png" value="4" text="4" height="30"></img>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/static/images/005.png" value="5" text="5" height="30"></img>
        </div>                                
    </div>
    
   
    <iframe name="myFrame" src="${pageContext.request.contextPath}/zongyemian/shangchuan2.jsp" width="1000" height="300"></iframe>
       <script type="text/javascript">
       function bbbcccaaa(){    	      	  
    	   $("#require-add-form").submit();    	      	      	  
       }
       $("#require-add-form").form({
      	 url:'${pageContext.request.contextPath}/require/add.do',
      	 dataType:'json',
      	 onSubmit:function(){
      		 return $("#require-add-form").form("validate");
      	 },
           success:function(data){
          	 if(typeof data=='Long'){
          		 data=JSON.parse(data)
          	 }
          	 var msg='操作失败'
          	 if(data!=null){
          		 $("#requireId").val(data);          		          		
          		 myFrame.window.bbbuuuttt();
          		 msg='操作成功';
          		 $("#func_tab").tabs("close",crrr);          		
      	        $("#require-list-datagrid").datagrid("reload");
          			
          	 }
          	 $.messager.show({
          		title:'提示信息',
          		msg:msg,
          		timeout:2000,
          		showType:'slide'
          	 });
           }
        });
       
       
       
       $(function(){
           $('#rLevel-youxian').combo({
               required:true,
               editable:false ,
               width:255 ,
               panelHeight:200 
           });
           $('#sp').appendTo($('#rLevel-youxian').combo('panel'));
           $('#sp img').click(function(){
               var v = $(this).attr('value');
               var s = $(this).attr('text');
               $('#rLevel-youxian').combo('setValue', v).combo('setText', s).combo('hidePanel');
           });
       });
       
       
       
       
       
       var editor;
		$(function(){
			editor = KindEditor.create('textarea[name="content"]', {								
				allowFileManager : true,
				afterBlur: function(){this.sync();}
			});
		});
       
             $("#proid-combobox").combobox({
            	 url:'${pageContext.request.contextPath}/product/list2.do',
            	 valueField:'id',
            	 textField:'name',
            	 onSelect: function(rec){    
                     var url = '${pageContext.request.contextPath}/promodel/list.do?id='+rec.id;    
                     $('#modelid-combobox').combobox('reload', url);
                     
                     var url2 = '${pageContext.request.contextPath}/plan/list.do?id='+rec.id;    
                     $('#planid-combobox').combobox('reload', url2);
                 } 
             });
             
             $("#fromid-combobox").combobox({           	 
                 url:'${pageContext.request.contextPath}/from/list.do',
            	 valueField:'id',
            	 textField:'name',
            	
             });
             
             $("#examuser-combobox").combobox({
            	 url:'${pageContext.request.contextPath}/user/list2.do',
            	 valueField:'id',
            	 textField:'realname',
            	 multiple:true 
             });
             
             $("#senduser-combobox").combobox({
            	 url:'${pageContext.request.contextPath}/user/list2.do',
            	 valueField:'id',
            	 textField:'realname',
            	 multiple:true
             });
       </script>
</body>
</html>