<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<form id="addOrUpdate-proform">
    <input type="hidden" name="id" value="${elec.id}" ><br>
    车架号：<input type="text" name="frameNumber" value="${elec.frameNumber}"><br>
    品牌：<input type="text" name="brandName" value="${elec.brandName}"><br>
    身份证号：<input type="text" name="cardNo" value="${elec.cardNo}"><br>
    申领地区：<input id="cc" name="dept" value="${elc.areaId}">   <br>
    购买时间：<input type="text" name="buyTime" value="<fmt:formatDate value='${elec.buyTime}' pattern='yyyy-MM-dd'/>" ><br>
    电话：<input type="text" name="telephone" value="${elec.telephone}"><br>
    地址：<input type="text" name="address" value="${elec.address}"><br>
    申请人：<input type="text" name="applicant" value="${elec.applicant}"><br>
</form>
<script>

    $('#cc').combobox({
        url:'${pageContext.request.contextPath}/area/list',
        valueField:'areaId',
        textField:'areaName'
    });
</script>