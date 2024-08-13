package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conectaDB(){
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/concessionaria?user=root&password=";
            con = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" +   erro.getMessage());
        }
        return con; 
    }

}
