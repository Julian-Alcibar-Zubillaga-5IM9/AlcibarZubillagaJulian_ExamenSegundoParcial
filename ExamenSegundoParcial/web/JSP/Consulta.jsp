<%-- 
    Document   : Consulta
    Created on : 18/10/2018, 07:27:36 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="mx.edu.ipn.cecyt9.edusite.model.Info" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<%
    Info in = new Info();
    ArrayList<Info> inf = new ArrayList();
    if (request.getAttribute("in") != null) {
        inf = (ArrayList<Info>) request.getAttribute("regs");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesi&oacute;n</title>
    </head>
    <body>
        <center>
        <h1>Iniciar Sesi&oacute;n</h1>
        
            <table border="1">
                <tr>
                    <th>Nombre</th>
                    <th>A. Paterno</th>
                    <th>A. Materno</th>
                    <th>Materia</th>
                    <th>Escuela</th>
                    <th>Deporte</th>
                </tr>
            <%
                for (int i = 0; i < inf.size(); i++){
                Info regi = inf.get(i);
            %>
            <tr>
                <td>
                    <p>Nombre: <%=regi.getNombre()%></p>
                </td>    
                <td>    
                    <p>Paterno:<%=regi.getApePater()%></p>
                </td>
                <td>
                    <p>Materno<%=regi.getApeMater()%></p>
                </td>
                <td>
                    <p>Materia:<%=regi.getMatFav()%></p>
                </td>
                <td>
                    <p>escuela:<%=regi.getEscuela()%></p>
                </td>
                <td>
                    <p>Deporte:<%=regi.getDepFav()%></p>
                </td>
            </tr>
            <%  }
            %>
            </table>
        </center>
    </body>
</html>