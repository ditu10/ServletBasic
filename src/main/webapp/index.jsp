<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="index.css">
</head>
<body>

  <h1 style="text-align: center">Please Fill up the Form</h1>


  <div>
    <form id="my-form" action="RegisteredServlet" method="post">
      <table>
        <tr>
          <td>Enter your name: </td>
          <td><input type="text" name="user_name" placeholder="username"></td>
        </tr>
        <tr>
          <td>Enter password: </td>
          <td><input type="password" name="password" placeholder="password"></td>
        </tr>
        <tr>
          <td>Enter your email: </td>
          <td><input type="email" name="email" placeholder="email"></td>
        </tr>
        <tr>
          <td>Select your gender: </td>
          <td>
            <input type="radio" name="gender" value="Male">Male</input> &nbsp &nbsp
            <input type="radio" name="gender" value="Female">Female</input> &nbsp &nbsp
            <input type="radio" name="gender" value="Other">Other</input>

          </td>
        </tr>
        <tr>
          <td>Select your course</td>
          <td>
            <select name="course">
              <option value="Java">Java</option>
              <option value="Python">Python</option>
              <option value="Javascript">Javascript</option>
              <option value="C++">C++</option>
            </select>
          </td>
        </tr>
        <tr>

          <td style="text-align: right"><input  type="checkbox" value="checked" name="condition"></td>
          <td>Agree Terms & Condition</td>
        </tr>

        <tr>
          <td></td>
          <td>
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
          </td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>