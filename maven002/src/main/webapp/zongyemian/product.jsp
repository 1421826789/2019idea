<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <div id="product-list-datagrid" class="dddiiivvv"></div>
     <script type="text/javascript">
     
            $("#product-list-datagrid").datagrid({
            	url:'${pageContext.request.contextPath}/product/list.do',
            	fit:true,
            	fitColumns:true,
            	pagination:true,
            	columns:[[
            		   {title:'产品序号',field:'id',width:100},
            		   {title:'产品名称',field:'name',width:100},
            		   {title:'产品代号',field:'version',width:100},
            		   {title:'产品负责人',field:'user1',width:100,
            			formatter:function(value,row,index){
            			 return value.realname;	
            			}   
            		   },
            		   
            		   {title:'测试负责人',field:'user2',width:100,
            			   formatter:function(value,row,index){
                  			 return value.realname;	
                  			}    
            		   },
            		   
            		   {title:'发布负责人',field:'user3',width:100,
            			   formatter:function(value,row,index){
                  			 return value.realname;	
                  			}   
            		   },
            		   
            		   {title:'产品类型',field:'proType',width:100},
            		   {title:'产品描述',field:'proDesc',width:100},
            	]]
            });
            
     </script>
</body>
</html>