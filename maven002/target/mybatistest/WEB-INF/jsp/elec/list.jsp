<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/27
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/easyuiBase/easyuiBase.jsp" %>
<html>
<head>
    <title>电动车列表</title>
    <%-- <jsp:include page="${pageContext.request.contextPath}/easyuiBase/easyuiBase.jsp" ></jsp:include> --%>
</head>
<body class="easyui-layout">
<div data-options="region:'center',title:'电动车列表'" style="padding:5px;background:#eee;">
    <div id="elec-mohu">
        申请人：<input id="userId" name="userId"><%--下拉框--%><br>
        地区：<input id="areaId" name="areaId"><%--下拉框--%><br>
        <input type="submit" value="查询" id="cx">


        <%--添加--%>
        <input type="button" value="添加" id="add-but">
        <%--修改--%>
        <input type="button" value="修改" id="update-but">
        <%--批量删除--%>
        <a id="delBatch-btn" href="#">删除</a>
    </div>
    <%--电动车列表--%>
    <table id="elec-datagrid"></table>
    <%--电动车添加修改对话框--%>
    <div id="elec-dialog"></div>

</div>

<script>

    //批量删除
    $('#delBatch-btn').linkbutton({
        iconCls: 'icon-Remove'
    });
    $('#delBatch-btn').click(function () {
        var rows = $("#elec-datagrid").datagrid("getSelections");
        console.log(rows);
        if (rows.length == 0){
            $.messager.alert('提示','请选择需要删除的数据');
            return;
        }
        var arr = [];
        for (var i = 0 ; i < rows.length ; i ++){
            arr.push(rows[i].id);
        }
        $.post("${pageContext.request.contextPath}/elec/delBatch",{"ids":arr.join()},function (data) {
            if(data == 0){
                $.messager.alert('提示','删除失败');
            } else{
                $.messager.alert('提示','删除成功');
                //刷新datagrid
                $("#elec-datagrid").datagrid("reload");
            }
        })
    })


    //修改商品
    $('#update-btn').linkbutton({
        iconCls: 'icon-search'
    });
    $('#update-but').click(function () {
        var rows = $("#elec-datagrid").datagrid("getSelections");
        console.log(rows[0].id);
        if (rows.length != 1){
            $.messager.alert('提示','请选择一行需要修改的数据');
            return;
        }
        $('#elec-dialog').dialog({
            title: '电动车修改',
            width: 400,
            height: 400,
            href: '${pageContext.request.contextPath}/elec/toUpdate?id='+rows[0].id,
            modal: true,
            buttons:[{
                text:'修改',
                handler:function(){
                    var formData = $("#addOrUpdate-proform").serialize();
                    $.post("${pageContext.request.contextPath}/elec/update",formData,function (data) {
                        if(data == 0){
                            $.messager.alert('DD','修改失败');
                        }else{
                            $.messager.alert('DD','修改成功');
                            //关闭dialog
                            $("#elec-dialog").dialog("close");
                            //刷新datagrid
                            $("#elec-datagrid").datagrid("reload");
                        }
                    })
                }
            },{
                text:'关闭',
                handler:function(){
                    //关闭dialog
                    $("#elec-dialog").dialog("close");
                }
            }]

        });


    })

    //添加商品
    $("#add-but").click(function () {
        $("#elec-dialog").dialog({
            title: '添加电动车',//对话框标题
            width: 400,
            height: 400,
            modal: true,//遮罩层
            href:'${pageContext.request.contextPath}/elec/toAdd',//去controller
            buttons:[{
                text:'保存',
                handler:function(){//点击事件
                    var formData = $("#addOrUpdate-proform").serialize();//form表单的所有数据

                    $.post("${pageContext.request.contextPath}/elec/add",formData,function (data) {
                        if (data == 1){//添加成功
                            alert("添加成功")
                            //关闭dialog
                            $("#elec-dialog").dialog("close");
                            //刷新datagrid
                            $("#elec-datagrid").datagrid("reload");
                        }else {
                            alert("添加失败")
                        }
                    })
                }
            },{
                text:'关闭',
                handler:function(){
                    //关闭dialog
                    $("#proAdd-dialog").dialog("close");
                }
            }]
        });
    })

    //模糊查询
    $("#cx").click(function () {
        // 做查询
        $("#elec-datagrid").datagrid("load",{
            userId:$("input[name='userId']").val(),
            areaId:$("#areaId").val(),
        });
    })


    //商品列表
    $('#elec-datagrid').datagrid({
        url:'${pageContext.request.contextPath}/elec/list',//发送一个ajax请求
        fit:true,
        fitColumns:true,
        rownumbers:true,
        pagination:true,
        toolbar:"#elec-mohu",
        columns:[[
            {field:'id',title:'电动车编号',width:100,checkbox:true},
            {field:'frameNumber',title:'车架号',width:100},//排序
            {field:'buyTime',title:'购买时间',width:100},
            {field:'cardNo',title:'身份证号',width:100},
            {field:'areaName',title:'审领地区',width:100},
            {field:'brandName',title:'品牌名称',width:100},
            {field:'telephone',title:'电话',width:100},
            {field:'address',title:'地址',width:100},
            {field:'applicant',title:'申请人',width:100}
        ]]

    });
    //申请人
    $('#userId').combobox({
        url:'${pageContext.request.contextPath}/user/list',
        valueField:'id',
        textField:'name'
    });
    //区域
    $('#areaId').combobox({
        url:'${pageContext.request.contextPath}/area/list',
        valueField:'areaId',
        textField:'areaName'
    });

</script>

</body>
</html>
