package DAO;

import DTO.VeiculoDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class VeiculoDAO {
    
    Connection con;
    PreparedStatement  pstm;
    
    public void cadastrarVeiculo(VeiculoDTO objveiculoDTO){
        String sql = "insert into veiculo (chassi, modelo, fabricante, cor, ano, preco) values (?, ?, ?, ?, ?, ?)";
    
        con = new ConexaoDAO().conectaDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objveiculoDTO.getChassi());
            pstm.setString(2, objveiculoDTO.getModelo());
            pstm.setString(3, objveiculoDTO.getFabricante());
            pstm.setString(4, objveiculoDTO.getCor());
            pstm.setString(5, objveiculoDTO.getAno());
            pstm.setString(6, objveiculoDTO.getPreco());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Veiculo Cadastrado!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO" + erro);
        }
    }
}
