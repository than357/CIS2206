<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Project 2 by Tom Hannon Dec 5 2012</title>
</head>

<body>

<h1>Please set your wakeup time here</h1>
<p>Enter in the Time using 24-Hour time (ex: 14:00 for 2:00 pm). <br>
   Then, click on the Submit button.</p>

<form action="addToWakeupList" method="post">
<jsp:useBean id="user" scope="session" class="customer.User"/>
<table cellspacing="5" border="0">
    <tr>
        <td align="right">First name:</td>
        <td><input type="text" name="firstName" 
             value="<jsp:getProperty name="user" property="firstName"/>">
        </td>
    </tr>
    <tr>
        <td align="right">Last name:</td>
        <td><input type="text" name="lastName"
             value="<jsp:getProperty name="user" property="lastName"/>">
        </td>
    </tr>
    <tr>
        <td align="right">Room Number for Wake Up Call:</td>
        <td><input type="text" name="roomNum"
             value="<jsp:getProperty name="user" property="roomNum"/>">
        </td>
    </tr>
    <tr>
        <td align="right">Enter the Wake Up Time (xx:xx 24hr):</td>
        <td><input type="text" name="wtime"
              value="<jsp:getProperty name="user" property="wtime"/>">
        </td>
    </tr>
    <tr>
        <td></td>
        <td><br><input type="submit" value="Submit"></td>
    </tr>
</table>
</form>

</body>    
</html>