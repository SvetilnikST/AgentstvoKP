<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<jsp:include page="includ/header.jsp"></jsp:include>
<head>
    <title>Добавление клиента</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
          type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
</head>

<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
            <h1 class="text-gray-dark">Добавить клиента</h1>
            <form name="loginForm" method="POST" action="WorkTaskController">
                <input type="hidden" name="action" value="save_clients"/>
                <input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
                <input type="hidden" name="id" value="<c:out value="${id}"/>"/>
                <div class="form-group"><label>Фамилия Имя Отчество</label>
                    <input type="text" name="snmClients" class="form-control" placeholder="Введите ФИО"
                           value="<c:out value="${snmClients}"/>"/></div>

                <div class="form-group"><label>Пол</label>
                    <input type="text" name="floor" class="form-control" placeholder="Введите пол"
                           value="<c:out value="${floor}"/>"/></div>

                <div class="form-group"><label>Паспортные данные</label>
                    <input type="text" name="passportClients" class="form-control"
                           placeholder="Введите серию, номер паспорта" value="<c:out value="${passportClients}"/>"/>
                </div>

                <div class="form-group"><label>Контатный телефон</label>
                    <input type="text" name="phoneClients" class="form-control" placeholder="Введите ФИО"
                           value="<c:out value="${phoneClients}"/>"/></div>

                <button type="submit" class="btn btn-primary">Сохранить</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
</div>

<jsp:include page="includ/footer.jsp"></jsp:include>