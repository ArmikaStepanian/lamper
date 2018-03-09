<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/style.css"/>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
</head>
<body>
<div class="container-fluid">
<div class="container">
    <div class="row">
        <div class='col-sm-6'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker3'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $(function () {
                $('#datetimepicker3').datetimepicker({
                    format: 'LT'
                });
            });
        </script>
    </div>
</div>

    <form name="back" action="/back" method="post">
        <button class="btn-block btn-lg btn btn-default"><i class="glyphicon glyphicon-menu-left"></i>&nbsp;
            Back
        </button>
    </form>
</div>

<!-- jQuery -->
<script src="/examples/vendors/jquery/jquery-3.2.1.min.js"></script>
<!-- Bootstrap -->
<script src="/examples/vendors/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<!-- Moment -->
<script src="/examples/vendors/moment/moment-with-locales.js"></script>
<!-- Bootstrap DateTimePicker -->
<script src="/examples/vendors/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<!-- Инициализация Bootstrap DateTimePicker -->
<script>
    $(function () {
        $('#datetimepicker4').datetimepicker(
            {format: 'HH:mm', locale: 'ru'}
        );
    });
</script>
</body>
</html>