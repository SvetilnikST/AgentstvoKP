<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Вход</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
        <h1 class="text-gray-dark">Добавить вид сделки</h1>
        <form name="loginForm" method="POST" action="WorkTaskController">
        <input type = "hidden" name="action" value="add_viewdeal"/>
        <div class="form-group"> <label>Номер сделки&nbsp;</label>
        <input type="text" name="idViewDeal" class="form-control" placeholder="Введите номер"> </div>
        <div class="form-group"> <label>Наименование</label>
        <input type="text" name="viewdeal" class="form-control" placeholder="Наименование" /> </div>
     <button type="submit" class="btn btn-primary">Создать</button>
        </form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>