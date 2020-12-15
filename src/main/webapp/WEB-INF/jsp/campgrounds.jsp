<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.web.project.java.campify.campifywebprojectjava.camp.Campground" %>
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
<div class="container">
    <header class="jumbotron">
        <div class="container">
            <h1>Campgrounds Page</h1>
            <p>View our handpicked campgrounds</p>
            <p>
                <a class="btn btn-primary btn-lg" href="/campgrounds/new">Add new campground</a>
            </p>
        </div>
    </header>

    <div class="row text-center" style="display:flex; flex-wrap:wrap">
        <%List<Campground> camps =
                (ArrayList<Campground>)request.getAttribute("camps");
        for ( int i = 0; i < camps.size(); i++){ %>
            <div class="col-md-3 col-sm-6">
                <div class="thumbnail">
                    <img style="height:300px; width:300px" src=<%= camps.get(i).getSrc() %> alt=<%= camps.get(i).getName() %>>
                    <div class="caption">
                        <h4><%= camps.get(i).getName() %></h4>
                    </div>
                    <p>
                        <a href="/campgrounds/<%=i%>" class="btn btn-primary">More Info</a>
                    </p>
                </div>
            </div>
        <%}%>
    </div>
</div>

</body>
</html>