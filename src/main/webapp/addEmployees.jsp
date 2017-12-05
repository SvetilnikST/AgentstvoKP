<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<head>
    <title>Добавление расположения</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>
</head>

<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
        <h1 class="text-gray-dark">Добавить расположение</h1>
        <form name="loginForm" method="POST" action="WorkTaskController">
            <input type = "hidden" name="action" value="save_employees"/>
            <input type = "hidden" name="mode" value="<c:out value="${mode}"/>"/>
            <input type = "hidden" name="idEmployees"  value="<c:out value="${employeesEntity.idEmployees}"/>"/>
        <div class="form-group"> <label>Сотрудники</label>

            <div class="form-group"> <label>Фамилия имя отчество</label>
                <input type="text" name="employeesSNM" class="form-control" placeholder="Введите фимилия, имя, отчество"  value="<c:out value="${employeesEntity.employeesSnm}"/>"/> </div>

            <div class="form-group"> <label>Пол</label>
                <input type="text" name="employeesFloor" class="form-control" placeholder="Введите пол"  value="<c:out value="${employeesEntity.employeesFloor}"/>"/> </div>

            <div class="form-group"> <label>Граждантство</label>
                <input type="text" name="employeesCitiziship" class="form-control" placeholder="Введите граждантство"  value="<c:out value="${employeesEntity.employeesCitizinship}"/>"/> </div>

            <div class="form-group"> <label>Дата рождения</label>
                <input type="text" name="employeesDoB" class="form-control" placeholder="Введите дату рождения"  value="<c:out value="${employeesEntity.employeesDoB}"/>"/> </div>

            <div class="form-group"> <label>Паспортные данные</label>
                <input type="text" name="employeesPassport" class="form-control" placeholder="Введите паспортные данные"  value="<c:out value="${employeesEntity.employeesPassport}"/>"/> </div>

            <div class="form-group"> <label>Должность</label>
            <select name="position" class="form-control">
                <c:forEach items="${positionsEntities}" var = "positions">
                    <option value="<c:out value="${positions.idPositions}"/>"
                            <c:if test = "${positions.idPositions eq curPosition}">
                                selected
                            </c:if>
                    ><c:out value="${positions.positions}"/></option>
                </c:forEach>

            </select>

            <div class="form-group"> <label>Телефон</label>
                <input type="text" name="employeesPhone" class="form-control" placeholder="Введите номер телефона"  value="<c:out value="${employeesEntity.employeesPhone}"/>"/> </div>

                <div class="form-group"> <label>Почтовый адрес</label>
                    <input type="text" name="employeesMail" class="form-control" placeholder="Введите адрес почты"  value="<c:out value="${employeesEntity.employeesMail}"/>"/> </div>

                <div class="form-group"> <label>Пароль</label>
                    <input type="password" name="password" class="form-control" placeholder="Введите пароль"  value="<c:out value="${employeesEntity.password}"/>"/> </div>

                <div class="form-group"> <label>solt</label>
                    <input type="password" name="solt" class="form-control" placeholder=""  value="<c:out value="${employeesEntity.solt}"/>"/> </div>

                <div class="form-group"> <label>Status</label>
                    <input type="text" name="status" class="form-control" placeholder=""  value="<c:out value="${employeesEntity.status}"/>"/> </div>

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