package Dao;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {
        Connection conexao;
        
    public ResultSet autentification(UsuarioModel objusuario){
        conexao = new ConexaoBD().getConnetion();
        try {
            String sql= "select * from usuario where email = ? and senha = ?";
            PreparedStatement preparaConexao = conexao.prepareStatement(sql);
            preparaConexao.setString(1, objusuario.getEmail());
            preparaConexao.setString(2, objusuario.getSenha());
            ResultSet resultado = preparaConexao.executeQuery();
            return resultado;         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: "+ erro);
            return null;
        }
    }
}
