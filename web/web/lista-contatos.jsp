<%@ page import="dao.ContatoDAO" %>
<%@ page import="domain.Contato" %><%--
  Created by IntelliJ IDEA.
  User: matheus
  Date: 7/24/18
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <%
            ContatoDAO contatoDAO = new ContatoDAO();
            for (Contato x: contatoDAO.getAllContatos()) { %>
                <tr>
                    <td><%=x.getNome()%></td>
                    <td><%=x.getEmail()%></td>
                    <td><%=x.getEndereco()%></td>
                    <td><%=x.getDataNascimento().getTime()%></td>
                </tr>
        <%
            }
        %>
    </table>
</body>
</html>
