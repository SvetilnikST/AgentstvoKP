<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_deal">Добавить</a>
<br>
	<table  class="table table-striped">
    	<thead>
    		<tr>
    			<th>Id </th>
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
    		<c:forEach items="${deal}" var = "deal">
    			<tr>
    				<td><c:out value="${deal.idDeal}"/></td>
					<td><c:out value="${deal.dateDeal}"/></td>
					<td><c:out value="${deal.clientsEntity1.snmClients}"/></td>
					<td><c:out value="${deal.clientsEntity2.snmClients}"/></td>

					<td><c:out value="${deal.viewdealEntity.viewDeal}"/></td>
					<td><c:out value="${deal.propertyEntity.property}"/></td>
					<td><c:out value="${deal.parampropertyEntity.paramPropertyArea}"/></td>
					<td><c:out value="${deal.employeesEntity.employeesSnm}"/></td>
					<td><c:out value="${deal.dealSum}"/></td>
					<td><c:out value="${deal.dealPercent}"/></td>

					<td><a href = "WorkTaskController?action=edit_deal&id=<c:out value = "${deal.idDeal}"/>">Редактировать</a></td>
				<td><a href = "WorkTaskController?action=delete_deal&id=<c:out value = "${deal.idDeal}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>


    	</tbody>
    </table>

<jsp:include page="includ/footer.jsp"></jsp:include>
