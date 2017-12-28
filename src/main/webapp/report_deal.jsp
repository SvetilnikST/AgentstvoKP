<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directoryparam.jsp"></jsp:include>

<form name="loginForm" method="POST" action="WorkTaskController">
    <input type="hidden" name="action" value="report_deal"/>
    <div>
        <div class="form-group" style="float:left; width: 25%">
            <label>Дата начала отчета</label>
            <input type="date" name="firstDate" class="form-control" placeholder="Введите дату">
        </div>
        <div class="form-group" style="float:left; width: 25%">
            <label>Дата окончания</label>
            <input type="date" name="lastDate" class="form-control" placeholder="Введите дату">
        </div>
        <div/>
        <div  class="form-group" style="float:left; width: 25% ">
            <button type="submit" class="btn btn-primary">Ок</button>
        </div>

    </div>
    <%--<div style="float:left; width:25%">--%>
    <%--</div>--%>
</form>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Дата</th>
        <th>Поставщик</th>
        <th>Заказчик</th>
        <th>Вид сделки</th>
        <th>Недвижимость</th>
        <th>Параметры недвижимости (S)</th>
        <th>Сотрудник</th>
        <th>Сумма сделки</th>
        <th>%</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${deal}" var="deal">
        <tr>
            <td><c:out value="${deal.dateDeal}"/></td>
            <td><c:out value="${deal.clientsEntity1.snmClients}"/></td>
            <td><c:out value="${deal.clientsEntity2.snmClients}"/></td>

            <td><c:out value="${deal.viewdealEntity.viewDeal}"/></td>
            <td><c:out value="${deal.propertyEntity.property}"/></td>
            <td><c:out value="${deal.parampropertyEntity.paramPropertyArea}"/></td>
            <td><c:out value="${deal.employeesEntity.employeesSnm}"/></td>
            <td><c:out value="${deal.dealSum}"/></td>
            <td><c:out value="${deal.dealPercent}"/></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="includ/footer.jsp"></jsp:include>
