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
