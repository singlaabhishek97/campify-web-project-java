<%@ page import="com.web.project.java.campify.campifywebprojectjava.camp.Campground" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">YelpCamp</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/">Login</a></li>
                <li><a href="/">SignUp</a></li>
                <li><a href="/">LogOut</a></li>
            </ul>
        </div>
    </div>
</nav>
<%Campground camp = (Campground)request.getAttribute("camp");%>
<h1><%=camp.getName()%></h1>
<img style="height:300px; width:300px" src=<%= camp.getSrc()%> alt=<%=camp.getName()%>>

</body>
</html>