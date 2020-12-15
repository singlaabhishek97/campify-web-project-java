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
<div class="container">
    <div class="row">
        <h1 style="text-align: center;">Create a new Campground</h1>
        <div style="width:30%; margin:25px auto;">
            <form action="/campgrounds" method="post">
                <div class="form-group">
                    <input class="form-control" type="text" name="name" placeholder="Name">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="src" placeholder="Image src">
                </div>
                <div class="form-group">
                    <button class="btn btn-lg btn-primary btn-block">Submit</button>
                </div>
            </form>
            <a href="/campgrounds">Go Back</a>
        </div>

    </div>
</div>

</body>
</html>