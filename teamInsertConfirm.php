

<?php
			header('Content-type: text/html; charset=utf-8');
            $host = 'chester.cs.unm.edu';
			$user = 'omidkv';
			$password = 'Ivp1fy9Y';
			$database = 'omidkv';

			$db = new mysqli($host, $user, $password, $database);

			/* check connection */
			if (mysqli_connect_errno()) {
 		   printf("Connect failed: %s\n", mysqli_connect_error());
  			  exit();
				}



$stmt = $db->prepare("INSERT INTO teams VALUES (?,?,?,?)");




// prepare and bind

$stmt->bind_param("ssss",$teamName,$yearEstablished,$stadiumName,
                          $owner);

$teamName = $_POST['teamName'];
$yearEstablished = $_POST['yearEstablished'];
$stadiumName = $_POST['stadiumName'];
$owner = $_POST['owner'];


//$stmt->execute();


$stmt->close();
$db->close();

?>
<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>



 <head>

  <title>Bootstrap Example</title>
    <meta content="IE=edge" http-equiv="X-UA-Compatible" />
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">English Preimer League Stats</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="firstpage.php">Home</a></li>
      <li><a href="selectStat.php">Stats Lookup</a></li>
      <li><a href="selectInsert.php">Insertions</a></li>
      <li><a href="selectDelete.php">Deletions</a></li>
      <li><a href="selectUpdate.php">Updates</a></li>
    </ul>
  </div>
</nav>
<p> This is a test</p>
</html>
