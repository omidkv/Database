<?php
 session_start();
    $servername = "mysql.unm.edu";
    $username = "cep";
    $password = ":)";
    $dbname = "cep_cep";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// prepare and bind
$stmt = $conn->prepare("INSERT INTO 'My Database' VALUES (?,?,?,?,?,?)");
$stmt->bind_param("ssssss",$netID,$firstName,$lastName,
                          $firstAttend,$hearAbout,$tests);
$netID = $_SESSION['netid'];
$firstName = $_POST['firstName'];
$lastName = $_POST['lastName'];
$firstAttend = $_POST['firstAttend'];
$hearAbout = $_POST['hearAbout'];
$tests = implode(',', $_POST['test']);
$stmt->execute();


$stmt->close();
$conn->close();

?>
<!DOCTYPE html SYSTEM "about:legacy-compat">
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta content="IE=edge" http-equiv="X-UA-Compatible" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <title>
        Mock Finals Registration :: College Enrichment Program | The University of New Mexico
    </title>
    <meta content="suDeBu3cQ5JEfYn92UdyZqkDPVCRI3QFK4dbV1tzUNk" name="google-site-verification" />
    <link href="//webcore.unm.edu/v1/images/unm.ico" rel="shortcut icon" />
    <link rel="stylesheet" type="text/css" href="https://cloud.typography.com/7254094/6839152/css/fonts.css" />
    <link href="//webcore.unm.edu/dev/css/unm-styles.min.css" rel="stylesheet" />
    <link href="../../assets/css/site-styles.css" media="screen" rel="stylesheet" type="text/css" />
    <script src="//webcore.unm.edu/dev/js/unm-scripts.min.js" type="text/javascript"></script>
    <script src="../../assets/js/site.js" type="text/javascript"></script>
    <!-- Site Meta - put site specific css, javascript, etc. here-->
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
        <script src="//webcore.unm.edu/v2/js/html5shiv.min.js"></script>
        <script src="//webcore.unm.edu/v2/js/respond.min.js"></script>
        <link href="//webcore.unm.edu/v2/js/respond-proxy.html" id="respond-proxy" rel="respond-proxy" />
        <link href="/assets/js/respond.proxy.gif" id="respond-redirect" rel="respond-redirect" />
        <script src="/assets/js/respond.proxy.js"></script>
        <![endif]-->
</head>

<body>
    <!-- Google Tag Manager -->
    <noscript>
        <iframe src="//www.googletagmanager.com/ns.html?id=GTM-WQT2MB" height="0" width="0" style="display:none;visibility:hidden"></iframe>
    </noscript>
    <script>
        (function(w, d, s, l, i) {
            w[l] = w[l] || [];
            w[l].push({
                'gtm.start': new Date().getTime(),
                event: 'gtm.js'
            });
            var f = d.getElementsByTagName(s)[0],
                j = d.createElement(s),
                dl = l != 'dataLayer' ? '&l=' + l : '';
            j.async = true;
            j.src =
                '//www.googletagmanager.com/gtm.js?id=' + i + dl;
            f.parentNode.insertBefore(j, f);
        })(window, document, 'script', 'dataLayer', 'GTM-WQT2MB');
    </script>
    <!-- End Google Tag Manager -->
    <!-- container to hold menus on collapse --><a accesskey="2" class="sr-only sr-only-focusable skip2content" href="#main">Skip to main content</a>
    <div class="nav-wrapper" id="offcanvas">
        <div class="navbar-header">
            <button class="menu-toggle navbar-toggle collapsed" data-target="#mobile-menu .navbar-collapse" data-toggle="collapse" type="button"><span class="sr-only">Toggle navigation</span><span class="fa fa-reorder fa-2x"></span></button>
            <div id="mobile-menu">
                <div class="text-center visible-xs-block" id="mobile-toolbar">
                    <ul aria-label="..." class="list-unstyled btn-group" role="group">
                        <li class="btn btn-default"><a href="http://directory.unm.edu/departments/" title="UNM A to Z">UNM A-Z</a></li>
                        <li class="btn btn-default"><a href="https://my.unm.edu" title="myUNM">myUNM</a></li>
                        <li class="btn btn-default"><a href="http://directory.unm.edu" title="Directory">Directory</a></li>
                        <li class="btn btn-default"><a href="http://search.unm.edu" title="Search"><span class="fa fa-search"></span></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div id="page">
        <!-- start nav -->
        <div class="navbar navbar-unm">
            <div class="container"><a class="navbar-brand" href="http://www.unm.edu">The University of New Mexico</a>
                <!-- search form -->
                <form action="//search.unm.edu/search" class="pull-right hidden-xs" id="unm_search_form" method="get">
                    <div class="input-append search-query">
                        <input accesskey="4" id="unm_search_form_q" maxlength="255" name="q" placeholder="Search" title="input search query here" type="text" />
                        <button accesskey="s" class="btn" id="unm_search_for_submit" name="submit" title="submit search" type="submit"><span class="fa fa-search"></span></button>
                    </div>
                </form>
                <!-- end search form -->
                <ul class="nav navbar-nav navbar-right hidden-xs" id="toolbar-nav">
                    <li><a href="http://directory.unm.edu/departments/" title="UNM A to Z">UNM A-Z</a></li>
                    <li><a href="https://my.unm.edu" title="myUNM">myUNM</a></li>
                    <li><a href="http://directory.unm.edu" title="Directory">Directory</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Help <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="http://studentinfo.unm.edu" title="StudentInfo">StudentInfo</a></li>
                            <li><a href="http://fastinfo.unm.edu" title="FastInfo">FastInfo</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!-- end  nav -->
        <div id="header">
            <div class="container"><a href="http://unm.edu"><h1>College Enrichment Program</h1></a></div>
        </div>
        <div id="hero"></div>
        <div id="nav">
            <div class="container">
                <div class="navbar navbar-top" id="horiz-nav">
                    <nav class="navbar-collapse collapse" id="horz-nav" role="navigation">
                        <ul class="nav navbar-nav" role="menubar">
                            <li><a href="../../index.html" title="Home">Home</a></li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../about-us/index.html">About Us<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../../about-us/index.html" title="About Us - What is CEP?">What is CEP?</a></li>
                                    <li><a href="../../about-us/ceps-mission.html" title="About Us - CEPs Mission">CEPs Mission</a></li>
                                    <li><a href="../../about-us/meet-our-staff.html" title="About Us - Meet Our Staff">Meet Our Staff</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle active" data-toggle="dropdown" href="../index.html">Events<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../index.html" title="Events - Calandar">Calandar</a></li>
                                    <li><a href="../fafsa.html" title="Events - FAFSA Wednesdays">FAFSA Wednesdays</a></li>
                                    <li><a href="../mock-finals.html" title="Events - Mock Finals">Mock Finals</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../academic-support/peer-mentor-tutors.html">Academic Support<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="https://unm.starfishsolutions.com/starfish-ops/support/login.html;jsessionid=1BF4805EC92346961C02246148F88D65" title="Academic Support - See An Advisor">See An Advisor</a></li>
                                    <li><a href="../../academic-support/peer-mentor-tutors.html" title="Academic Support - Peer Mentor-Tutors">Peer Mentor-Tutors</a></li>
                                    <li><a href="http://financialaid.unm.edu/" title="Academic Support - Financial Aid">Financial Aid</a></li>
                                    <li class="dropdown-submenu"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../academic-support/success-navigator/index.html">Success Navigator</a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="../../academic-support/success-navigator/index.html" title="Success Navigator - What is Success Navigator?">What is Success Navigator?</a></li>
                                            <li><a href="../../academic-support/success-navigator/students.html" title="Success Navigator - Students">Students</a></li>
                                            <li><a href="../../academic-support/success-navigator/stafffaculty.html" title="Success Navigator - Staff/Faculty">Staff/Faculty</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../scholar-programs/daniels-fund.html">Scholar Programs<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../../scholar-programs/daniels-fund.html" title="Scholar Programs - Daniels Fund">Daniels Fund</a></li>
                                    <li><a href="../../scholar-programs/nmli.html" title="Scholar Programs - N.M.L.I.">N.M.L.I.</a></li>
                                    <li><a href="../../scholar-programs/simon.html" title="Scholar Programs - New Mexico Simon Scholars">New Mexico Simon Scholars</a></li>
                                    <li><a href="../../scholar-programs/f.y.r.e.html" title="Scholar Programs - F.Y.R.E">F.Y.R.E</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../pathway-programs/gateway.html">Pathway Programs<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../../pathway-programs/gateway.html" title="Pathway Programs - Gateway">Gateway</a></li>
                                    <li><a href="../../pathway-programs/early-start-program.html" title="Pathway Programs - Early Start Program">Early Start Program</a></li>
                                    <li><a href="../../pathway-programs/first-2-finish.html" title="Pathway Programs - First 2 Finish">First 2 Finish</a></li>
                                    <li><a href="../../pathway-programs/building-futures--foundations-bff.html" title="Pathway Programs - Building Futures &amp; Foundations (BFF)">Building Futures &amp; Foundations (BFF)</a></li>
                                    <li><a href="../../pathway-programs/first-2-finish1.html" title="Pathway Programs - Glossary of College Terms">Glossary of College Terms</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../scholarships/index.html">Scholarships<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../../scholarships/index.html" title="Scholarships - -- DISPLAY NAME --">-- DISPLAY NAME --</a></li>
                                    <li><a href="../../scholarships/osher.html" title="Scholarships - OSHER">OSHER</a></li>
                                    <li><a href="../../scholarships/ime-el-mezquite.html" title="Scholarships - IME / EL Mezquite">IME / EL Mezquite</a></li>
                                    <li><a href="../../scholarships/daniels.html" title="Scholarships - The Daniels Fund Boundless Opportunity Scholarship">The Daniels Fund Boundless Opportunity Scholarship</a></li>
                                </ul>
                            </li>
                            <li><a href="http://nso.unm.edu/index.html" title="New Student Orientation">New Student Orientation</a></li>
                            <li class="dropdown"><a aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" href="../../student-employee-development/index.html">Student Employee Development<span class="caret">&#160;</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="../../student-employee-development/index.html" title="Student Employee Development - SED Online Manual">SED Online Manual</a></li>
                                    <li><a href="../../student-employee-development/welcome.html" title="Student Employee Development - Welcome">Welcome</a></li>
                                    <li><a href="../../student-employee-development/chapter-1.html" title="Student Employee Development - Chapter 1">Chapter 1</a></li>
                                    <li><a href="../../student-employee-development/chapter-2.html" title="Student Employee Development - Chapter 2">Chapter 2</a></li>
                                    <li><a href="../../student-employee-development/chapter-3.html" title="Student Employee Development - Chapter 3">Chapter 3</a></li>
                                    <li><a href="../../student-employee-development/chapter-4.html" title="Student Employee Development - Chapter 4">Chapter 4</a></li>
                                    <li><a href="../../student-employee-development/chapter-5.html" title="Student Employee Development - Chapter 5">Chapter 5</a></li>
                                    <li><a href="../../student-employee-development/chapter-6.html" title="Student Employee Development - Chapter 6">Chapter 6</a></li>
                                    <li><a href="../../student-employee-development/chapter-7.html" title="Student Employee Development - Chapter 7">Chapter 7</a></li>
                                    <li><a href="../../student-employee-development/chapter-8.html" title="Student Employee Development - Chapter 8">Chapter 8</a></li>
                                    <li><a href="../../student-employee-development/training.html" title="Student Employee Development - Training">Training</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="../../placement-test/index.html">Registration / Course Placement</a></li>
                            <li class="dropdown"><a href="../../placement-tests-2/index.html">Registration / Course Placement 2</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
        <div id="upper">
            <div class="container">
                <!--UPPER-->
            </div>
        </div>
        <div id="breadcrumbs">
            <div class="container">
                <ul class="breadcrumb hidden-xs" id="unm_breadcrumbs">
                    <li class="unm_home"><a href="http://www.unm.edu">UNM</a></li>
                    <li><a href="../../index.html">Home</a></li>
                    <li><a href="../index.html">Events</a></li>
                    <li><a href="../mock-finals.html">Mock Finals</a></li>
                    <li>Mock Finals Registration</li>
                </ul>
            </div>
        </div>
        <div id="main">
            <div class="container layout" id="sc">
                <div class="row">
                  <div id="primary">
                        <h1>Register for Mock Finals</h1>
                        <h3><?php echo $_POST['firstName']?>,</h3>
                          <p>Thank you for registerting for <a href="http://cep.unm.edu/events/mock-finals.html">Mock Finals!</a></p>
                          <p>This is confirmation that you have registered for the following Mock Final Exams:</p>
                          <h3>-<?php echo implode('<br>-', $_POST['test']); ?></h3>
                          <p>See you on Saturday, April 29th, 2017 at 9am inside Dane Smith Hall.
                             You should be receiving a confirmation email shortly. We will also send you an email
                             reminder before the event. If you have any questions or concerns, please feel free to email us at cep@unm.edu!</p>
                    </div>
                    <div id="secondary">
                        <div class="sidebar-nav-wrapper">
                            <nav class="navbar-collapse collapse sidebar-nav" id="sidebar-nav">
                                <h2>Events</h2>
                                <ul class="nav" id="contextual_nav">
                                    <li><a href="../index.html" title="Events - Calandar">Calandar</a></li>
                                    <li><a href="../fafsa.html" title="Events - FAFSA Wednesdays">FAFSA Wednesdays</a></li>
                                    <li><a class = "active" href="../mock-finals.html" title="Events - Mock Finals">Mock Finals</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    <div id="tertiary"></div>
                </div>
            </div>
        </div>
        <div id="lower">
            <div class="container">
                <!--LOWER-->
            </div>
        </div>
        <div id="footer">
            <div class="container">
                <hr/>
                <div class="row">
                    <div class="col-md-8">
                        <p>
                            <a href="http://www.unm.edu"><img alt="The University of New Mexico" src="https://webcore.unm.edu/v2/images/unm-transparent-white.png" /></a>
                        </p>
                        <p><small>&#169; The University of New Mexico<br/> Albuquerque, NM 87131, (505) 277-0111<br/> New Mexico's Flagship University</small></p>
                    </div>
                    <div class="col-md-4">
                        <ul class="list-inline">
                            <li><a href="https://www.facebook.com/universityofnewmexico" title="UNM on Facebook"><span class="fa fa-facebook-square fa-2x"><span class="sr-only">UNM on Facebook</span></span></a></li>
                            <li><a href="http://instagram.com/uofnm" title="UNM on Instagram"><span class="fa fa-instagram fa-2x"><span class="sr-only">UNM on Instagram</span></span></a></li>
                            <li><a href="https://twitter.com/unm" title="UNM on Twitter"><span class="fa fa-twitter-square fa-2x"><span class="sr-only">UNM on Twitter</span></span></a></li>
                            <li><a href="http://uofnm.tumblr.com" title="UNM on Tumblr"><span class="fa fa-tumblr-square fa-2x"><span class="sr-only">UNM on Tumblr</span></span></a></li>
                            <li><a href="http://www.youtube.com/user/unmlive" title="UNM on YouTube"><span class="fa fa-youtube-square fa-2x"><span class="sr-only">UNM on YouTube</span></span></a></li>
                        </ul>
                        <p>more at <a href="http://social.unm.edu" title="UNM Social Media Directory &amp; Information">social.unm.edu</a></p>
                        <ul class="list-inline" id="unm_footer_links">
                            <li><a href="http://www.unm.edu/accessibility.html">Accessibility</a></li>
                            <li><a href="http://www.unm.edu/legal.html">Legal</a></li>
                            <li><a href="http://www.unm.edu/contactunm.html">Contact UNM</a></li>
                            <li><a href="http://nmhedss2.state.nm.us/Dashboard/index.aspx?ID=21">New Mexico Higher Education Dashboard</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="totop"><span class="fa fa-arrow-circle-up"></span></div>
</body>

</html>

<?php
// multiple recipients
$to  = $_SESSION['netid'].'@unm.edu';

// subject
$subject = 'Mock Finals Registration - Spring 2017';

// message
$message = '
<html>
<body>
  <p>Dear '.$_POST['firstName'].',</p>
  <p>Thank you for registering for <a href="http://cep.unm.edu/events/mock-finals.html">Mock Finals!</a></p>
  <p>You have registered for the following Mock Final Exams:</p>
  <h3>-'.implode('<br>-', $_POST['test']) .'</h3>
  <p>See you on Saturday, April  29th, 2017 at 9am inside Dane Smith Hall.
     If you have any questions or concerns, please feel free to reply to this
     email or email us at cep@unm.edu!</p>
  <p>Sincerely,<br> The College Enrichment Program.</p>
</body>
</html>
';

// To send HTML mail, the Content-type header must be set
$headers  = 'MIME-Version: 1.0' . "\r\n";
$headers .= 'Content-type: text/html; charset=iso-8859-1' . "\r\n";

// Additional headers
$headers .= 'From: UNM College Enrichment Program <cep@unm.edu>' . "\r\n";
$headers .= 'Cc: cep@unm.edu' . "\r\n";
$headers .= 'Bcc: chucho2@unm.edu' . "\r\n";

mail($to, $subject, $message, $headers);
echo("Here");
session_destroy();
?>
