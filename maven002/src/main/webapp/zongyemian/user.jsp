<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
   <div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'west',title:'部门树'" style="width: 200px">

		<div class="ztree" id="user-list-ztree"></div>

	</div>


	<div data-options="region:'center',title:''">

		<div id="user-list-tb">
			用户名：<input class="easyui-textbox" name="name" id="name"> 
			<a id="user-chaxun-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
    
    <a id="user-add-btn" href="#"  class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
    <a id="user-delete-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
    <a id="user-update-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
    <a id="user-chexiao-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'">撤销</a>
    <a id="user-shuaxin-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-2012080412111'">刷新</a>
    <a id="user-bengzhu-btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-help'">帮助</a>
		</div>
		<div id="user-list-datagrid"></div>
		<div id="user-list-dialog"></div>
	</div>
	</div>
	<script type="text/javascript" >
	    $("#user-delete-btn").click(function(){
	    	var rows=$("#user-list-datagrid").datagrid("getSelections");
	    	if(rows.length==0){
	    		$.messager.alert("提示信息","请选择要删除的数据");
	    		return;
	    	}
	    	var arr=[];
	    	for(var i=0;i<rows.length;i++){
	    		arr.push(rows[i].id);
	    	}
	    	$.post("${pageContext.request.contextPath}/user/batchdelete.do",{"ids":arr.join()},function(data){
	    		if(data>0){
	    			alert("删除成功")
	    			$("#user-list-datagrid").datagrid("reload")
	    		}else{
	    			alert("删除失败")
	    		}
	    	});
	    });
	    $("#user-add-btn").click(function(){
	    	
	    	$("#user-list-dialog").dialog({
	    		title:'用户添加',
	    		width:500,
	    		height:500,
	    		closed:false,
	    		cache:false,
	    		href:'${pageContext.request.contextPath}/user/toaddorupdate.do',
	    		modal:true,
	    		buttons:[{
	    			text:'保存',
	    			handler:function(){
	    				$("#user-addorupdate-form").submit();
	    			}
	    		},{
	    			text:'关闭',
	    			handler:function(){
	    		$("#user-list-dialog").dialog("close")
	    			}
	    			
	    		}]
	    	});
	    });
	    
	    $("#user-update-btn").click(function(){
	    	var rows=$("#user-list-datagrid").datagrid("getSelections");
	    	if(rows.length!=1){
	    		$.messager.alert("提示信息","请选择一行要修改的数据")
	    		return;
	    	}
	    	var id=rows[0].id;
	    	$("#user-list-dialog").dialog({
	    		title:'用户修改',
	    		width:500,
	    		height:500,
	    		closed:false,
	    		cache:false,
	    		href:'${pageContext.request.contextPath}/user/toaddorupdate.do?id='+id,
	    		modal:true,
	    		buttons:[{
	    			text:'保存',
	    			handler:function(){
	    				$("#user-addorupdate-form").submit();
	    			}
	    		},{
	    			text:'关闭',
	    			handler:function(){
	    		$("#user-list-dialog").dialog("close")
	    			}
	    			
	    		}]
	    	})
	    	
	    });
	    
	    var arr=0;
		$("#user-list-datagrid").datagrid({
			url : '${pageContext.request.contextPath}/user/list.do',
			fit : true,
			fitColumns : true,
			rownumbers:true,
			pagination:true,
			toolbar : '#user-list-tb',
			columns:[[ 				
				{title : '编号',field : 'id',width : 100,hidden:true,checkbox:true},
				{title : '真实姓名',field : 'realname',width : 100},				
			    {title : '登录名称',field : 'loginname',width : 100},				
			    {title : '登录密码',field : 'password',width : 100},				
			    {title : '邮箱',field : 'mail',width : 100},				
			    {title : '电话',field : 'tel',width : 100},				
			    {title : '性别',field : 'sex',width : 100},				
			    {title : '注册时间',field : 'addate',width : 100},				
			    {title : '所属部门',field : 'dept',width : 100,				
				formatter:function(value,row,index){
					return value.name
				}
			}]]
		});
		
		var setting = {
				callback : {
					onClick : function(event, treeId, treeNode) {
						if (!treeNode.isParent) {
							
							$("#user-list-datagrid").datagrid("load",{
								deptid:treeNode.id,
								name:$("#name").textbox("getValue")
							}),
							arr=treeNode.id
						}else{
							alert("请点击部门")
						}
						
						   
					}
				},
				

				data : {
					simpleData : {
						enable : true,
						idKey : "id",
						pIdKey : "pid",
					}
				},
				async : {
					enable : true,
					url : "${pageContext.request.contextPath}/dept/list.do",
				},
				view : {
					showLine : true,

				},

			}
			var zTreeObj = $.fn.zTree.init($("#user-list-ztree"), setting);
		    zTreeObj.expandAll(true);
	        setTimeout("zTreeObj.expandAll(true)",200);
		$("#user-chaxun-btn").click(function(){
	    	$("#user-list-datagrid").datagrid("load",{
	    		name:$("#name").textbox("getValue"),
	    		deptid:arr
	    	});
	    })
	</script>
</body>
</html>