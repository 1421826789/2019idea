<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
     
      <form id="user-addorupdate-form">
           <input name="id" type="hidden" value="${user.id}">
           <table border="1" cellspacing="0">
                 <tr><td>真实姓名：</td><td><input class="easyui-textbox" name="realname" value="${user.realname}"></td></tr>
                 <tr><td>登录名称：</td><td><input class="easyui-textbox" name="loginname" value="${user.loginname}"></td></tr>
                 <tr><td>登录密码：</td><td><input class="easyui-passwordbox" name="password" value="${user.password}"></td></tr>
                 <tr><td>邮箱：</td><td><input class="easyui-textbox" name="mail" value="${user.mail}"></td></tr>
                 <tr><td>电话：</td><td><input class="easyui-textbox" name="tel" value="${user.tel}"></td></tr>
                 <tr><td>性别：</td><td><input type="radio" name="sex" value="男" ${user.sex=='男'?'checked':'' }>男
                                       <input type="radio" name="sex" value="女" ${user.sex=='女'?'checked':'' }>女</td></tr>
                 <tr><td>注册时间：</td><td><input class="easyui-datebox" name="addate" value='<fmt:formatDate value="${user.addate}" pattern="yyyy-MM-dd"/>'></td></tr>
                 <tr><td>所需部门</td><td><input class="easyui-combobox" name="deptid" id="dept-list-combobox" value="${user.deptid}"></td></tr>
           </table>
      </form>
      
      <script type="text/javascript">
            $("#dept-list-combobox").combobox({
            	url:'${pageContext.request.contextPath}/dept/list.do',
            	valueField:'id',
            	textField:'name'
            });
            
            $("#user-addorupdate-form").form({
            	url:'${pageContext.request.contextPath}/user/addorupdate.do',
            	dataType:'json',
            	onSubmit:function(){
            		return $("#user-addorupdate-form").form("validate")
            	},
            	success:function(data){
            		if(typeof data=='string'){
            			data=JSON.parse(data);
            		}
            		var msg="操作失败"
            		if(data.status==200){
            			msg="操作成功",
            			$("#user-list-dialog").dialog("close"),
            			$("#user-list-datagrid").datagrid("reload")
            		}
            		$.messager.show({
            			title:'提示信息',
            			msg:msg,
            			timeout:2000,
            			showType:'slide'
            		})
            	}
            })
      </script>
</body>
</html>