<?php
include 'db_connect.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $first_name = $_POST["first_name"];
    $last_name = $_POST["last_name"];
    $date_of_birth = $_POST["date_of_birth"];
    $gender = $_POST["gender"];
    $contact_number = $_POST["contact_number"];
    $address = $_POST["address"];

    $sql = "INSERT INTO patients (first_name, last_name, date_of_birth, gender, contact_number, address) VALUES ('$first_name', '$last_name', '$date_of_birth', '$gender', '$contact_number', '$address')";

    if ($conn->query($sql) === TRUE) {
        echo "New patient registered successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    $conn->close();
}
?>
