<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="css/bootstrap.css" rel="stylesheet" />

</head>
<body>

  <table>
  	 <tr>${position}</tr>
  	 <br/>
  	 <tr>${mode}</tr>
  </table>

</br>

  <form name="enable" action="/enable" method="post">
  <button type="submit" class="btn btn-default">Enable</button>
  </form>

  <form name="schedule" action="/schedule" method="post">
  <button type="submit" class="btn btn-default">Schedule</button>
  </form>

  <form name="disable" action="/disable" method="post">
  <button type="submit" class="btn btn-default">Disable</button>
  </form>
</body>
</html>