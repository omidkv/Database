


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
      var teamName = document.forms["teamForm"]["teamName"].value;
      var yearEstablished = document.forms["teamForm"]["yearEstablished"].value;
      var yETest = parseInt(yearEstablished)
      var stadiumName = document.forms["teamForm"]["stadiumName"].value;
      var owner = document.forms["teamForm"]["owner"].value;

      if (teamName == "" || playerName.length > 30 ) {
          document.getElementById("teamNameError").innerHTML = "Please enter a Team Name!";
          allValidated = false;
      }
      else document.getElementById("teamNameError").innerHTML = "";

      if (yearEstablished == "" || yETest < 0 || yETest == NaN ) {
         document.getElementById("yearEstablishedError").innerHTML = "Please enter Year Established!";
         allValidated = false;
      }
      else document.getElementById("yearEstablishedError").innerHTML = "";

      if (stadiumName == "" || playerNat.length > 30) {
         document.getElementById("stadiumNameError").innerHTML = "Please enter valid Stadium Name";
         allValidated = false;
      }
      else document.getElementById("stadiumNameError").innerHTML = "";

      if (owner == "" || owner.length > 30 ) {
          document.getElementById("ownerError").innerHTML = "Please enter an Owner Name!";
          allValidated = false;
      }
      else document.getElementById("ownerError").innerHTML = "";

     //Did they select at least one test?

	console.log(allValidated);
      return allValidated;

  }

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
<form name="teamForm" action="teamInsertConfirm.php" onsubmit="return validateForm()" method="post">

<div class="row">
                              <div class="col-xs-12 col-md-6">
                                  <h2>Team Information</h2>
                                  <div class="form-group">
                                      <label for="teamName">Team Name</label>
                                      <input class="form-control" for="teamName"
                                      name="teamName" id="teamName" label="" placeholder="Enter team name of club you wish to add" type="text" />
                                      <label id="teamNameError" for="teamName" style="color: red;"></label>
                                  </div>
 <div class="form-group">
                                    <label for="yearEstablished">Year Established</label>
                                    <input class="form-control" for="yearEstablished"
                                    name="yearEstablished" id="yearEstablished" label="" placeholder="Enter year team was established" type="text" />
                                    <label id="yearEstablishedError" for="yearEstablished" style="color: red;"></label>
                                  </div>





<div class="form-group">
                                  <label for="stadiumName">Stadium Name</label>
                                  <input class="form-control" for="stadiumName"
                                  name="stadiumName" id="stadiumName" label="" placeholder="Enter the name of team's stadium" type="text" />
                                  <label id="stdiumNameError" for="stadiumName" style="color: red;"></label>
                                   </div>

 <div class="form-group">
                                    <label for="owner">Team Owner</label>
                                    <input class="form-control" for="owner"
                                    name="owner" id="owner" label="" placeholder="Enter team owner's name." type="text" />
                                    <label id="ownerError" for="owner" style="color: red;"></label>
                                  </div>


<input class="btn btn-primary " id="submit" type="submit" value="Submit Team" />


</html>
