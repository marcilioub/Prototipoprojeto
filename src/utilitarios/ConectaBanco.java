
package utilitarios;

import java.sql.*;
import javax.swing.JOptionPane;



public class ConectaBanco {
    public static Connection conectabanco() throws ClassNotFoundException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDSoftAll","postgres","post123");
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            return con;
          
            
        } catch (SQLException error) {
             JOptionPane.showMessageDialog(null, "Erro ao conectar!\n Erro:"+error);
        
        return null;
        }
    }}