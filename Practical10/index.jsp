<!-- create databes sy22;
use sy22;
create table student(stdid int, stname varchar(20));
describe student;
select * from student; -->

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Form</title>
    </head>
    <body>
        <h1>DEALING WITH STUDENT TABLE INSERT, UPDATE AND DELETE RECORDS</h1>
        <% 
        try{
        // create connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sy22", "root", "mysql");
        String sql1 = "insert into student values(1, 'A')";
        String sql2 = "insert into student values(2, 'C')";
        String sql3 = "insert into student values(3, 'C')";
        String sql4 = "update student set stname='D' where stdid=3";
        String sql5 = "delete from student where stdid=2";
        Statement st = con.createStatement();
        st.addBatch(sql1);
        st.addBatch(sql2);
        st.addBatch(sql3);
        st.addBatch(sql4);
        st.addBatch(sql5);
        st.executeBatch();
        
            }
        catch(Exception e){
        out.print(e);
        }
        %>
    </body>
</html>