package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    Connection con;
    PreparedStatement pstm;
    
    public void cadastrarUsuario(UsuarioDTO objUsuarioDTO){
        String sql = "insert into usuario (CPF, nome, email, telefone, RG, endereco, senha) values (?, ?, ?, ?, ?, ?, ?)";
        
        con = new ConexaoDAO() .conectaDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCPF());
            pstm.setString(2, objUsuarioDTO.getNome());
            pstm.setString(3, objUsuarioDTO.getEmail());
            pstm.setString(4, objUsuarioDTO.getTelefone());
            pstm.setString(5, objUsuarioDTO.getRG());
            pstm.setString(6, objUsuarioDTO.getEndereco());
            pstm.setString(7, objUsuarioDTO.getSenha());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
}
