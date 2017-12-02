<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
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
    		<c:forEach items="${deal}" var = "deall">
    			<tr>
    				<td><c:out value="${deall.idDeal}"/></td>
					<td><c:out value="${deall.dateDeal}"/></td>
					<td><c:out value="${deall.clientsEntity1.snmClients}"/></td>
					<td><c:out value="${deall.clientsEntity2.snmClients}"/></td>

					<td><c:out value="${deall.viewdealEntity.viewDeal}"/></td>
					<td><c:out value="${deall.propertyEntity.property}"/></td>
					<td><c:out value="${deall.parampropertyEntity.paramPropertyArea}"/></td>
					<td><c:out value="${deall.employeesEntity.employeesSnm}"/></td>
					<td><c:out value="${deall.dealSum}"/></td>
					<td><c:out value="${deall.dealPercent}"/></td>

					<td><a href = "WorkTaskController?action=add_viewdeal&id=<c:out value = "${deall.idDeal}"/>">Редактировать</a></td>
				<td><a href = "WorkTaskController?action=delete_deal&id=<c:out value = "${deall.idDeal}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>

			<form action ="/webapp/new_deal.jsp">
				<br></br>
				<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
			</form>
    	</tbody>
    </table>

<jsp:include page="includ/footer.jsp"></jsp:include>
