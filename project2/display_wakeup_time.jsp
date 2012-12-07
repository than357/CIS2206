<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Wakeup Time Display by Tom Hannon Dec 5 2012</title>
</head>

<body>

<h1>You have successfully entered a new wakeup time</h1>

<p>Here is the information that you entered:</p>

<jsp:useBean id="user" scope="session" class="customer.User"/>
<table cellspacing="5" cellpadding="5" border="1">
    <tr>
        <td align="right">First name:</td>
        <td><jsp:getProperty name="user" property="firstName"/></td>
    </tr>
    <tr>
        <td align="right">Last name:</td>
        <td><jsp:getProperty name="user" property="lastName"/></td>
    </tr>
    <tr>
        <td align="right">Your Room Number:</td>
        <td><jsp:getProperty name="user" property="roomNum"/></td>
    </tr>
    <tr>
        <td align="right">Wake Up Time:</td>
        <td><jsp:getProperty name="user" property="wtime"/></td>
    </tr>
</table>

<p>To add another wake up time, click on the Back <br>
button in your browser or the Return button shown <br>
below.</p>

<form action="set_wakeup_time.jsp" method="post">
    <input type="submit" value="Return">
</form>

</body>
</html>