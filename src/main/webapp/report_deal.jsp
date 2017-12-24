<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directoryparam.jsp"></jsp:include>


<div class="form-group"><label>Поставщик</label>
	<select name="dealClient1" class="form-control">
		<c:forEach items="${clientsEntities}" var="clients">
			<option value="<c:out value="${clients.idClients}"/>"
					<c:if test="${clients.idClients eq curClients1}">
						selected
					</c:if>
			><c:out value="${clients.snmClients}"/></option>
		</c:forEach>
	</select>
</div>


<table  class="table table-striped">
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
    		<c:forEach items="${deal}" var = "deal">
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
