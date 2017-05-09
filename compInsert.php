


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
      var compName = document.forms["compForm"]["compName"].value;
      var startYear = document.forms["compForm"]["startYear"].value;
      var syNum = parseInt(startYear)
      var winner = document.forms["compForm"]["winner"].value;


      if (compName == "" || compName.length > 30 ) {
          document.getElementById("compNameError").innerHTML = "Please Enter a Competition Name!";
          allValidated = false;
      }
      else document.getElementById("compNameError").innerHTML = "";

      if (startYear == "" || syNum > 1849 || syNum == NaN) {
         document.getElementById("startYearError").innerHTML = "Please Enter Valid Competition Starting Year!";
         allValidated = false;
      }
      else document.getElementById("startYearError").innerHTML = "";

      if (winner == "" || winner.length > 30) {
         document.getElementById("winnerError").innerHTML = "Please Enter Valid Winning Team!";
         allValidated = false;
      }
      else document.getElementById("winnerError").innerHTML = "";

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
<form name="compForm" action="compInsertConfirm.php" onsubmit="return validateForm()" method="post">

<div class="row">
                              <div class="col-xs-12 col-md-6">
                                  <h2>Competition Information</h2>
                                  <div class="form-group">
                                      <label for="compName">Competition Name</label>
                                      <input class="form-control" for="playerName"
                                      name="compName" id="compName" label="" placeholder="Enter Competition's Name." type="text" />
                                      <label id="compNameError" for="compName" style="color: red;"></label>
                                  </div>
 <div class="form-group">
                                    <label for="startYear">Competition Start Year</label>
                                    <input class="form-control" for="startYear"
                                    name="startYear" id="startYear" label="" placeholder="Enter Year in which Competition Started" type="text" />
                                    <label id="startYearError" for="startYear" style="color: red;"></label>
                                  </div>






 <div class="form-group">
                                    <label for="winner">Competition Winner</label>
                                    <input class="form-control" for="winner"
                                    name="winner" id="winner" label="" placeholder="Enter Winning Team's Name." type="text" />
                                    <label id="winnerError" for="winner" style="color: red;"></label>
                                  </div>

<div class="form-group">
                                    <label for="compType">Competition Type</label>
                                    <select class="form-control" for="compType"
                                    name="compType" id="compType" label="" placeholder="Select Type of Competition" type="text">


 									<option value="cup">Cup</option>
									<option value="league">League</option>

</select>
                                    <label id="compTypeError" for="compType"></label>
                                  </div>
<input class="btn btn-primary " id="submit" type="submit" value="Submit Player" />


</html>
