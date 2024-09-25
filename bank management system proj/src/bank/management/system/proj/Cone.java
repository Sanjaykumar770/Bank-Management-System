package bank.management.system.proj;

import java.sql.*;

public class Cone {

    Connection connection;
    Statement statement;



    public Cone(){
        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "sanjay@123.");
            statement = connection.createStatement();



        }catch(Exception e){

            e.printStackTrace();

        }
    }

}
