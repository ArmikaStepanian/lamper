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
        <h1 class="text-center" style="font-size: 7em"><i class="glyphicon glyphicon-off
<#if position=='OFF'>color-red<#else>color-green</#if>"></i>
        </h1>
    </div>
    <form name="enable" action="/enable" method="post">
        <button class="btn-block btn-lg btn btn-default <#if mode=='ENABLE'>btn-primary</#if>"><i class="glyphicon glyphicon-play"></i>&nbsp;
            Enable
        </button>
    </form>
    <br>
    <form name="schedule" action="/schedule" method="post">
        <button class="btn-block btn-lg btn btn-default <#if mode=='SCHEDULE'>btn-primary</#if>"><i class="glyphicon glyphicon-time"></i>&nbsp;
            Schedule
        </button>
    </form>
    <br>
    <form name="disable" action="/disable" method="post">
        <button class="btn-block btn-lg btn btn-default <#if mode=='DISABLE'>btn-primary</#if>"><i class="glyphicon glyphicon-stop"></i>&nbsp;
            Disable
        </button>
    </form>
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