<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Id </th>
		<th>Недвижимость</th>
		<th>Площадь</th>

		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${property}" var = "propert">
		<tr>
			<td><c:out value="${propert.idProperty}"/></td>
			<td><c:out value="${propert.property}"/></td>

			<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${propert.idProperty}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${propert.idProperty}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	<form action ="/webapp/new_location.jsp">
		<br></br>
		<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
	</form>
	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>
