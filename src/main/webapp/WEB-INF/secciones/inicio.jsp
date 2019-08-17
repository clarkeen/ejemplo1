<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial</title>
    </head>
    <body>
        <h1>Secciones disponibles</h1>
        <ul>
            <li><a href="<c:url value="/v1/tabla"/>">Catálogo de productos</a></li>
            <li><a href="<c:url value="/v1/ventas"/>">Ventas</a></li>
            <li><a href="<c:url value="/v1/contacto"/>">Contacto</a></li>
        </ul>
    </body>
</html>
