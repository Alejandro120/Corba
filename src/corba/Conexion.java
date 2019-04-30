package corba;

import java.sql.*;

public class Conexion {
    public Connection conex;

    public Connection conectar(){
            try{
                Class.forName("com.mysql.jdbc.Driver");

                conex=DriverManager.getConnection("jdbc:mysql://localhost/kevin","root","");
                System.out.println("Conexion establecida");

                }catch(Exception e){
     System.out.println("No fue posible la ocnexion"+e.getMessage());
                               }
            return conex;
            }

    
    
}
