<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directoryparam.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_location">Добавить</a>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Улица</th>
		<th>Номер дома</th>
		<th>Корпус</th>
		<th>Квартира</th>
		<th>События</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${location}" var = "locatio">
		<tr>
			<td><c:out value="${locatio.streetsEntity.streetsName}"/></td>
			<td><c:out value="${locatio.locationHouse}"/></td>
			<td><c:out value="${locatio.locationCorps}"/></td>
			<td><c:out value="${locatio.locationFlat}"/></td>
			<td><a href = "WorkTaskController?action=edit_location&id=<c:out value = "${locatio.idLocation}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_location&id=<c:out value = "${locatio.idLocation}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>