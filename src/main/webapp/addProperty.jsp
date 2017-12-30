<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
        <h1 class="text-gray-dark">Добавить вид недвижимости</h1>
        <form name="loginForm" method="POST" action="WorkTaskController">
            <input type = "hidden" name="action" value="save_property"/>
            <input type = "hidden" name="mode" value="<c:out value="${mode}"/>"/>
            <input type = "hidden" name="id"  value="<c:out value="${id}"/>"/>
        <div class="form-group"> <label>Наименование</label>
        <input type="text" name="property" class="form-control" placeholder="Введите наименование"  value="<c:out value="${property}"/>"/>
        </div>
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