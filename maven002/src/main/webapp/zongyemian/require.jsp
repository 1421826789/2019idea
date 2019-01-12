<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <div id="require-list-tb">
      <a id="daochu-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">导出</a>      
      </div>
      <div id="require-list-datagrid"></div>
      <div></div>
      <script type="text/javascript">
             $("#require-list-datagrid").datagrid({
            	url:'${pageContext.request.contextPath}/require/list.do',
            	fit:true,
            	fitColumns:true,
            	pagination:true,
            	toolbar:'#require-list-tb',
            	columns:[[
            		{title:'编号',field:'id',width:100},
            		{title:'需求名称',field:'name',width:100},
            		{title:'产品',field:'product',width:100,
            		 formatter:function(value,row,index){
            			 return value.name
            		 }	
            		},
            		
            		{title:'模块',field:'promodel',width:100,
            			formatter:function(value,row,index){
               			 return value.name
               		 }
            		},
            		
            		{title:'计划',field:'plan',width:100,
            			formatter:function(value,row,index){
               			 return value.name
               		 }
            		},
            		
            		{title:'需求来源',field:'from',width:100,
            			formatter:function(value,row,index){
               			 return value.name
               		 }
            		},
            		
            		{title:'评审者',field:'userName',width:100},
            		{title:'优先级',field:'rLevel',width:100},
            		{title:'需求描述',field:'content',width:100},
            		
            		{title:'发送给',field:'userName2',width:100},
            		{title:'图片描述',field:'reqimgUrl',width:100,
            		  formatter:function(value,row,index){
            			   
       return  "<img width='30' height='30'  src='${pageContext.request.contextPath}/upload/8656eaf6-b3cb-4b47-aee2-f9a7c8e98db9.png'>"
            			   //var urls=value.split(',');
            			    //return urls;
            			 
            		   }, 

            		}
            	]]
             });
      </script>
</body>
</html>