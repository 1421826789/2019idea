<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/common/base.jsp"></jsp:include>
</head>
<body class="easyui-layout">

	<div data-options="region:'north',title:''" style="height: 90px">
		<h1 align="center" style="color: #1a7bc9; font-family: 宋体">
			<font size="20">项目管理系统</font>
		</h1>

	</div>
	<div data-options="region:'west',title:'导航菜单'" style="width: 200px">

		<div class="ztree" id="menu-list-ztree"></div>

	</div>
	<div data-options="region:'east',title:'用户信息'" style="width: 200px">


	</div>
	<div data-options="region:'south',title:''" style="height: 80px">
		后台</div>
	<div data-options="region:'center',title:'列表展示'">

		<div id="func_tab" class="easyui-tabs" data-options="fit:true,tools:'#tab-tools'">
			<%-- 每一个div就是一个选项卡 --%>
			<div title="欢迎页面" style="padding: 20px; display: none;">
				<h1>欢迎页面</h1>
			</div>

		</div>
		<div id="tab-tools" style="visibility:hidden;">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'" onclick="addPanel()" id="chanadd">产品添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" onclick="updatePanel()" id="chanupdate">产品修改</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'" onclick="tixuxiuPanel()" id="tixuxiu">提需求</a>
	</div>
		
	</div>

	<script type="text/javascript">
	
	var arrr='产品添加';
	var brrr='产品修改';
	var crrr='提需求';
	function updatePanel(){
		var rows=$("#product-list-datagrid").datagrid("getSelections");
		if(rows.length!=1){
			alert("请选择一条要修改的数据");
			return;
		}
		if ($("#func_tab").tabs("exists", brrr)) {
			$("#func_tab").tabs("select", brrr);
		}else{
			$("#func_tab")
			.tabs(
					"add",
					{
						title : brrr,
						href : '${pageContext.request.contextPath}/product/toadd.do?id='+rows[0].id,							
						closable : true,
						tools : [ {
							iconCls : 'icon-mini-refresh',
							handler : function() {
								alert('refresh');
							}
						} ]
					});
		}				
	}
	function addPanel(){
		
		if ($("#func_tab").tabs("exists", arrr)) {
			$("#func_tab").tabs("select", arrr);
		}else{
			$("#func_tab")
			.tabs(
					"add",
					{
						title : arrr,
						href : '${pageContext.request.contextPath}/product/toadd.do',							
						closable : true,
						tools : [ {
							iconCls : 'icon-mini-refresh',
							handler : function() {
								alert('refresh');
							}
						} ]
					});
		}				
    }
	
	function tixuxiuPanel(){
		if ($("#func_tab").tabs("exists", crrr)) {
			$("#func_tab").tabs("select", crrr);
		}else{
			$("#func_tab")
			.tabs(
					"add",
					{
						title : crrr,
						href : '${pageContext.request.contextPath}/require/toadd.do',							
						closable : true,
						tools : [ {
							iconCls : 'icon-mini-refresh',
							handler : function() {
								alert('refresh');
							}
						} ]
					});
		}				
	}
		var setting = {
			callback : {
				onClick : function(event, treeId, treeNode) {
					if(treeNode.name=='产品'){
						document.getElementById("tab-tools").style.visibility="visible";
						$("#tixuqiu").hide(1000);
					}else{
						document.getElementById("tab-tools").style.visibility="hidden";
					}
					if(treeNode.name=='需求'){
						document.getElementById("tab-tools").style.visibility="visible";
						$("#chanadd").hide(1000);
						$("#chanupdate").hide(1000);
					}else{
						document.getElementById("tab-tools").style.visibility="hidden";
					}
					if (!treeNode.isParent) {
						if ($("#func_tab").tabs("exists", treeNode.name)) {
							$("#func_tab").tabs("select", treeNode.name);
						} else {
							var tab=$("#func_tab").tabs('getSelected');
							if(tab==null){
								$("#func_tab")
								.tabs(
										"add",
										{
											title : treeNode.name,
											href : '${pageContext.request.contextPath}/zongyemian'
													+ treeNode.url,
											closable : true,
											tools : [ {
												iconCls : 'icon-mini-refresh',
												handler : function() {
													alert('refresh');
												}
											} ]
										});
							}else{
								
								
                                if(treeNode.name=='产品'){
                                	document.getElementById("tab-tools").style.visibility="visible";
                                	$("#tixuxiu").hide(1000);
                                	$("#chanadd").show(1000);
            						$("#chanupdate").show(1000);
                                	
                                }
                                if(treeNode.name=='需求'){
                                	document.getElementById("tab-tools").style.visibility="visible";
                                	$("#chanadd").hide(1000);
            						$("#chanupdate").hide(1000);
            						$("#tixuxiu").show(1000);
                                }
								 $('#func_tab').tabs('update', {
					                    tab: tab,
					                    options: {
					                        fit:true,
					                        closable: true,
					                        title: treeNode.name,
					                        href: '${pageContext.request.contextPath}/zongyemian' + treeNode.url,
					                    }
					                });
								 tab.panel('refresh', '${pageContext.request.contextPath}/zongyemian' + treeNode.url);
 

							}
							
						}

					} else {
						alert("请选择具体功能")
					}
				}
			},
			edit : {
				enable : true,
				showRemoveBtn : false,
				showRenameBtn : false,
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
				url : "${pageContext.request.contextPath}/menu/list.do",
			},
			view : {
				showLine : true,

			},

		}
		var zTreeObj = $.fn.zTree.init($("#menu-list-ztree"), setting);
		   zTreeObj.expandAll(true);
	       setTimeout("zTreeObj.expandAll(true)",200);
	       
	</script>
</body>
</html>