<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
response.setHeader("Expires","0");%>
<form action="logen" method=post>
<center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text"name="username"/></br></td>
                         </tr>
                    <tr>
                     <td>Password</td>
                     
                        <td><input type="password" name="password"/></br></td>
                    </tr>
                    <tr>

                     <td><input type="submit" value="login"/></td>
                     </tr>
</form>

<form action="register.jsp">
<tr>
       <td> <input type="submit" value="signup"/><td>
       </td>
       </tr>
</form>
</tbody>
            </table>
            </center>
</body>
</html>