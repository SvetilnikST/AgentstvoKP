<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Show All Streets</title>
</head>

<body>
<%--<jsp:include page="master.jsp"></jsp:include>--%>
<br>
    <table border=1>
    	<thead>
    		<tr>
    			<th>Id param property </th>
    			<th>param property area</th>
				<th>param property location</th>
				<th>param property floor</th>
				<th>param property descreption</th>
    			<th>Action</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${paramproperty}" var = "parampropert">
    			<tr>
    				<td><c:out value="${parampropert.idParamProperty}"/></td>
					<td><c:out value="${parampropert.paramPropertyArea}"/></td>
    				<td><c:out value="${parampropert.paramPropertyLocation}"/></td>
					<td><c:out value="${parampropert.paramPropertyFloor}"/></td>
					<td><c:out value="${parampropert.paramPropertyDescription}"/></td>
    				<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${locationn.idLocation}"/>">Delete</a></td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>

    <%--<jsp:include page="pagesWorkTask.jsp"></jsp:include>--%>
    <p><a href = "WorkTaskController?action=insert_worktask">Add workTask</a></p>

    <form name="frmImportWorkNote" method="POST" action="WorkTaskController" enctype="multipart/form-data">
    <input type = "hidden" name="action" value="import"/>
    <input type="file" name="excelFile"/>
    <input type = "submit" value = "Import from excel" name = "button"/>
    </form>

</body>
</html>