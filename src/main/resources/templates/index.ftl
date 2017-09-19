<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/style.css"/>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
</head>
<body>
<div class="container-fluid">
    <div class="page-header">
        <h3>${position}/${mode}</h3>
    </div>
    <div class="btn-group-vertical text-justify">
        <form name="enable" action="/enable" method="post">
            <button class="btn btn-primary"><i class="glyphicon glyphicon-play"></i>&nbsp;Enable</button>
        </form>
        <br>
        <form name="schedule" action="/schedule" method="post">
            <button class="btn btn-primary"><i class="glyphicon glyphicon-time"></i>&nbsp;Schedule</button>
        </form>
        <br>
        <form name="disable" action="/disable" method="post">
            <button class="btn btn-primary"><i class="glyphicon glyphicon-stop"></i>&nbsp;Disable</button>
        </form>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
        integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
        integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

</body>
</html>