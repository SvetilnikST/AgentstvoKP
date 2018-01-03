<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<jsp:include page="includ/header.jsp"></jsp:include>

<c:if test ="${not empty ERROR}">
    <br/>AHTUNGGGGG!!!!!!<br/>
</c:if>
<table class="table table-striped">
    <thead>
    <tr><th><a href="WorkTaskController?action=add_clients">Добавить</a></th>
    <th>Клиенты</th>
    </tr>
    <tr>
        <th/>
        <th>Фамилия Имя Отчество</th>
        <th>Пол</th>
        <th>Паспортные данные</th>
        <th>Контактный телефон</th>
        <th/>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td/>
            <td><c:out value="${client.snmClients}"/></td>
            <td><c:out value="${client.floor}"/></td>
            <td><c:out value="${client.passportClients}"/></td>
            <td><c:out value="${client.phoneClients}"/></td>
            <td/>

            <td>
                <a href="WorkTaskController?action=edit_clients&id=<c:out value = "${client.idClients}"/>">Редактировать</a>
            </td>
            <td><a href="WorkTaskController?action=delete_clients&id=<c:out value = "${client.idClients}"/>">Удалить</a>
            </td>
        </tr>

    </c:forEach>

    </tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>