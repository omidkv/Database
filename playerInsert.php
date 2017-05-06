error_reporting(E_ALL);
ini_set('display_errors', 1);

<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>
   
 <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <script>
    function validateForm() {

      var allValidated = true;

      //If the first or last name is blank, correct it.
      //If it is correct but another error appears, remove correction method.
      var playerName = document.forms["playerForm"]["playerName"].value;
      var playerNum = document.forms["playerForm"]["playerNum"].value;
      var playerNat = document.forms["playerForm"]["playerNation"].value;

      if (playerName == "" || playerName.length > 30 ) {
          document.getElementById("playerNameError").innerHTML = "Please enter a Player Name!";
          allValidated = false;
      }
      else document.getElementById("playerNameError").innerHTML = "";

      if (playerNum == "") {
         document.getElementById("playerNumError").innerHTML = "Please enter Player Number!";
         allValidated = false;
      }
      else document.getElementById("playerNumError").innerHTML = "";

      if (playerNat == "" || playerNat.length > 30) {
         document.getElementById("playerNationError").innerHTML = "Please enter valid Nation!";
         allValidated = false;
      }
      else document.getElementById("playerNationError").innerHTML = "";

     //Did they select at least one test?
   
	console.log(allValidated);
      return allValidated;

  }
	console.log(playerName);
  </script>


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
<form name="playerForm" action="playerInsertConfirm.php" onsubmit="return validateForm()" method="post">

<div class="row">
                              <div class="col-xs-12 col-md-6">
                                  <h2>Player Information</h2>
                                  <div class="form-group">
                                      <label for="playerName">Player Name</label>
                                      <input class="form-control" for="playerName"
                                      name="playerName" id="playerName" label="" placeholder="Enter Player's First and Last Name." type="text" />
                                      <label id="playerNameError" for="playerName" style="color: red;"></label>
                                  </div>
 <div class="form-group">
                                    <label for="playerNum">Player Number</label>
                                    <input class="form-control" for="playerNum"
                                    name="playerNum" id="playerNum" label="" placeholder="Enter Player's Number." type="text" />
                                    <label id="playerNumError" for="playerNum" style="color: red;"></label>
                                  </div>





<div class="form-group">
                                    <label for="playerTeam">Player Team</label>
                                    <select class="form-control" for="playerTeam"
                                    name="playerTeam" id="playerTeam" label="" placeholder="Select Player's Team." type="text">
<?php
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
			$sql = 'SELECT teamName FROM teams';
       		 $result = $db->query($sql);
            

         
            
            while ($row = $result ->fetch_assoc()) {

 			echo "<option value=\"{$row['teamName']}\">";
        		echo $row['teamName'];
        			echo "</option>";
            
            }
                
            ?>
	
</select>
                                    <label id="playerTeamError" for="playerTeam"></label>
                                  </div>

 <div class="form-group">
                                    <label for="playerNation">Player Nationality</label>
                                    <input class="form-control" for="playerNation"
                                    name="playerNation" id="playerNation" label="" placeholder="Enter Player's Nationality." type="text" />
                                    <label id="playerNationError" for="playerNation" style="color: red;"></label>
                                  </div>

<div class="form-group">
                                    <label for="playerPos">Player Position</label>
                                    <select class="form-control" for="playerPos"
                                    name="playerPos" id="playerPos" label="" placeholder="Select Player's Postition." type="text">

 
 									<option value="GoalKeeper">GoalKeeper</option>
									<option value="Defender">Defender</option>
  									<option value="Midfielder">Midfielder</option>
  									<option value="Forward">Forward</option>

</select>
                                    <label id="playerPosError" for="playerPos"></label>
                                  </div>
<input class="btn btn-primary " id="submit" type="submit" value="Submit Player" />


</html>







