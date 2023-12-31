<%-- 
    Document   : CourseList
    Created on : Jan 22, 2022, 7:49:17 PM
    Author     : ductd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Add Class List | Online Learn</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/courselist_main.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head><!--/head-->
    <body>
        <jsp:include page="header.jsp" />
        <div class="container">
            <c:if test = "${requestScope.mess!=null}">
                <div class="alert alert-warning" style="text-align: center;" role="alert">
                    Add Failed Because Class Name Is Duplicated
                </div>                    </c:if>
                <h2>Add Class List</h2>
                <form action="AddClassController" method="post">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Teacher</th>
                                <th>Status</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" name="name"  style="width: 70px" required="" aria-label="default input example">
                                </td>
                                <td><input class="form-control" type="text" name="teacher" style="width: 90px" required="" aria-label="default input example">
                                </td>
                                <td><input class="form-control" type="text" name="status" style="width: 90px" required="" aria-label="default input example">
                                </td>
                                <td><button style="color: red;background-color: #ffffff;font-style: oblique;font-weight: bold;border-radius: 10px" type="submit">Add New Class Information</button></td>
                            
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        <jsp:include page="footer.jsp" />

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
