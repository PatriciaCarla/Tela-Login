package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public Connection getConnetion() {
        Connection conexao = null;
        try {
            String url= "jdbc:mysql://localhost:3306/oliveira_trade?user=root&password=";
            conexao = DriverManager.getConnection(url);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDao: "+erro.getMessage());
        }
        return conexao;
    }
}
