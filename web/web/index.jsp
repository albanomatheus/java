<%--
  Created by IntelliJ IDEA.
  User: matheus
  Date: 7/24/18
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="adicionaContato" method="post">
    Nome: <input type="text" name="nome"/><br/>
    E-mail: <input type="text" name="email"/><br/>
    Endereço: <input type="text" name="endereco"/><br/>
    Data Nascimento: <input type="text" name="dataNascimento"/><br/>
    <input type="submit" value="Gravar"/>
</form>

<form action="mostra-parametros.jsp" method="post">
    Testando parametros: <input type="text" name="parametro">
    <input type="submit">
</form>



<% System.out.println("Tudo foi executado");%>
</body>
</html>
