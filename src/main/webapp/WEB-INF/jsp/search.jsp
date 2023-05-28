<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.lang.*" import="javax.sql.*"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>

<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/interview";
        Connection connection = DriverManager.getConnection(url, "root", "");

        String message = request.getParameter("message");

        PreparedStatement st = connection.prepareStatement("SELECT * FROM MESSAGES");

        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

    } catch (Exception e) {
        System.out.println("Error");
    }
%>