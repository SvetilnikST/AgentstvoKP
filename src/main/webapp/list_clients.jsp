<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>

<br>
	<table  class="table table-striped">
    	<thead>
    		<tr>
    			<th>ID</th>
    			<th>Фамилия Имя Отчество</th>
				<th>Пол</th>
				<th>Паспортные данные</th>
				<th>Телефон</th>
    			</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${clients}" var = "client">
    			<tr>
    				<td><c:out value="${client.idClients}"/></td>
    				<td><c:out value="${client.snmClients}"/></td>
					<td><c:out value="${client.floor}"/></td>
					<td><c:out value="${client.passportClients}"/></td>
					<td><c:out value="${client.phoneClients}"/></td>

    				<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${client.idClients}"/>">Редактировать</a></td>
					<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${client.idClients}"/>">Удалить</a></td>

    			</tr>
    		</c:forEach>

			<form action ="/webapp/new_clients.jsp">
				<br></br>
				<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
			</form>
    	</tbody>
    </table>

<%--  <p><a href = "WorkTaskController?action=insert_worktask">Add workTask</a></p> --%>

<%--   <form name="frmImportWorkNote" method="POST" action="WorkTaskController" enctype="multipart/form-data">
  <input type = "hidden" name="action" value="import"/>
  <input type="file" name="excelFile"/>
  <input type = "submit" value = "Import from excel" name = "button"/>
  </form>
--%>
<jsp:include page="includ/footer.jsp"></jsp:include>
