<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
    <head>

        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-1.9.1.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>

        <title>
            <c:out value="${title}"/>
        </title>
    </head>
    <body>

    <nav class="navbar navbar-expand-md bg-secondary navbar-dark">
        <div class="container">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">

                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="WorkTaskController?action=add_deal" text-white >Добавить сделку</a>
                    </li>
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link
                            <c:if test="${marklocation eq 1}">
                                active
                            </c:if>
" href="WorkTaskController?action=location" text-white >Расположение</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link
                            <c:if test="${markparamproperty eq 1}">
                                active
                            </c:if>
                        " href="WorkTaskController?action=paramProperty">Параметры</a>
                    </li>
                </ul>

            </div>
        </div>
    </nav>
    </body>
</html>