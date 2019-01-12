<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
			form {
				margin: 0;
			}
			textarea {
				display: block;
			}
		</style>

</head>
<body>
 
      <form id="product-add-form">
           <input type="hidden" name="id" value="${product.id}">
           <input type="hidden" name="proUser" value="${product.proUser}">
           <input type="hidden" name="testUser" value="${product.testUser}">
           <input type="hidden" name="pubUser" value="${product.pubUser}">
           <table >
                 <tr><td>产品名称：</td><td><input class="easyui-textbox" name="name" value="${product.name}"></td></tr>
                 <tr><td>产品代号：</td><td><input class="easyui-textbox" name="version" value="${product.version}"></td></tr>
                
                 <tr><td>产品负责人：</td><td><input class="easyui-textbox" id="chanpin-textbox" 
                 data-options="icons:[{iconCls:'icon-large-chart',handler:showTree}]" value="${product.user1.realname}"></td></tr>
                 <tr><td>测试负责人</td><td><input class="easyui-textbox" id="ceshi-textbox" 
                 data-options="icons:[{iconCls:'icon-large-chart',handler:showTree}]" value="${product.user2.realname}"></td></tr>
                 <tr><td>发布负责人：</td><td><input class="easyui-textbox" id="fabu-textbox" 
                 data-options="icons:[{iconCls:'icon-large-chart',handler:showTree}]" value="${product.user3.realname}"></td></tr>
                 <tr><td>产品类型：</td><td><select name="proType" >
                        <option value="家用" ${product.proType=='家用'?'selected':''}>家用</option>
                        <option value="双人用" ${product.proType=='双人用'?'selected':''}>双人用</option>
                        <option value="单人用" ${product.proType=='单人用'?'selected':''}>单人用</option>                   
                        <option value="商务用" ${product.proType=='商务用'?'selected':''}>商务用</option>                   
                 </select></td></tr>
                 <tr><td>产品描述：</td><td><textarea name="proDesc" style="width:400px;height:200px;visibility:hidden">${product.proDesc}</textarea></td></tr>
                 <tr><td colspan="2" align="center"><button type="button" onclick="baocun()">保存</button></td></tr>
           </table>
      </form>     
      <div id="win" class="easyui-window" title="My Window" style="width:200px;height:400px"
      data-options="iconCls:'icon-save',modal:true,closed:true">
            <iframe  id="tcl" src="" width="99%" height="99%"></iframe>
      </div>
      <script type="text/javascript">
            $("#tcl").contents().find('vgvgvg').val(1);
            var arrb=0;     
            function showTree(e){            	            	
            	if(e.data.target.id=='chanpin-textbox'){
            		arrb=1;
            	}
            	if(e.data.target.id=='ceshi-textbox'){
            		arrb=2;
            	}
            	if(e.data.target.id=='fabu-textbox'){
            		arrb=3;
            	}
    			$("#win").window({
    				width:200,
    				height:400,
    				modal:true
    			}).window('open');
    			$("#tcl").attr('src','${pageContext.request.contextPath}/product/fuzeren.do')
    		}
            
            function setVal(id,name){
            	if(arrb==1){
            		$("input[name=proUser]").val(id);
                	$("#chanpin-textbox").textbox("setValue",name);
            	}
            	if(arrb==2){
            		$("input[name=testUser]").val(id);
                	$("#ceshi-textbox").textbox("setValue",name);
            	}
            	if(arrb==3){
            		$("input[name=pubUser]").val(id);
                	$("#fabu-textbox").textbox("setValue",name);
            	}           	
            	$("#win").window('close');
            }     
                  
      function baocun(){
    	  $("#product-add-form").submit() 
      }
      $("#product-add-form").form({
    	 url:'${pageContext.request.contextPath}/product/add.do',
    	 dataType:'json',
    	 onSubmit:function(){
    		 return $("#product-add-form").form("validate");
    	 },
         success:function(data){
        	 if(typeof data=='string'){
        		 data=JSON.parse(data)
        	 }
        	 var msg='操作失败'
        	 if(data.status==200){
        		 msg='操作成功'
        		 $("#func_tab").tabs("close",arrr);
        		 $("#func_tab").tabs("close",brrr);
        		 $("#product-list-datagrid").datagrid("reload");
        		
        	 }
        	 $.messager.show({
        		title:'提示信息',
        		msg:msg,
        		timeout:2000,
        		showType:'slide'
        	 });
         }
      });
      
       var editor;
		$(function(){
			editor = KindEditor.create('textarea[name="proDesc"]', {								
				allowFileManager : true,
				afterBlur: function(){this.sync();}
			});
		});
																					
       </script>
      
</body>
</html>