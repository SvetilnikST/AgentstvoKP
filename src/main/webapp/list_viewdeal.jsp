<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directory.jsp"></jsp:include>

<table class="table table-striped">
    <thead>
    <tr>
        <th/>
        <th><a href="WorkTaskController?action=add_viewDeal">Добавить</a></th>
        <th>Вид сделки</th>
        <th/>
        <th/>
    </tr>
    </thead>
    <tbody align="left">
    <c:forEach items="${viewdeal}" var="viewdeall">
        <tr>
            <td/>
            <td/>
            <td><c:out value="${viewdeall.viewDeal}"/></td>

            <td><a href="WorkTaskController?action=edit_viewDeal&id=<c:out value = "${viewdeall.idViewDeal}"/>">Редактировать</a>
            </td>
            <td><a href="WorkTaskController?action=delete_viewDeal&id=<c:out value = "${viewdeall.idViewDeal}"/>">Удалить</a>
            </td>
            <td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/><td/>
        </tr>
    </c:forEach>

    </tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>