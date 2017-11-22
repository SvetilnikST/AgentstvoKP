<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
	<table  class="table table-striped">
    	<thead>
    		<tr>
    			<th>Id </th>
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
    				<td><c:out value="${locatio.idLocation}"/></td>
    				<td><c:out value="${locatio.streetsEntity.streetsName}"/></td>
					<td><c:out value="${locatio.locationHouse}"/></td>
					<td><c:out value="${locatio.locationCorps}"/></td>
					<td><c:out value="${locatio.locationFlat}"/></td>
					<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${locatio.idLocation}"/>">Редактировать</a></td>
				<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${locatio.idLocation}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>

    <p><a href = "WorkTaskController?action=insert_worktask">Add workTask</a></p>

    <form name="frmImportWorkNote" method="POST" action="WorkTaskController" enctype="multipart/form-data">
    <input type = "hidden" name="action" value="import"/>
    <input type="file" name="excelFile"/>
    <input type = "submit" value = "Import from excel" name = "button"/>
    </form>

<jsp:include page="includ/footer.jsp"></jsp:include>
