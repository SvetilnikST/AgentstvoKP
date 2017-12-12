<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directory.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_positions">Добавить</a>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Должности</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${positions}" var = "position">
		<tr>
			<td><c:out value="${position.positions}"/></td>

			<td><a href = "WorkTaskController?action=edit_positions&id=<c:out value = "${position.idPositions}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_positions&id=<c:out value = "${position.idPositions}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>