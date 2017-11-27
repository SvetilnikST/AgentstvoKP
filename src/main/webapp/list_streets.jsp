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
    			<th>Id </th>
    			<th>Streets</th>

    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${streets}" var = "street">
    			<tr>
    				<td><c:out value="${street.idStreets}"/></td>
    				<td><c:out value="${street.streetsName}"/></td>
    				<td><a href = "WorkTaskController?action=delete_worktask&id=<c:out value = "${street.idStreets}"/>">Delete</a></td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>

    </form>

</body>
</html>