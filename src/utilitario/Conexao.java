package utilitario;

import java.sql.*;
import javax.swing.*;

public class Conexao {

    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1:3306/estoque";
    final private String usuario = "root";
    final private String senha = "root";
    Connection conexao;
    public Statement statement;
    public ResultSet resultSet;

    //metodo para efetuar a conexao
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectou !");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado :" + Driver);
            result = false;
        } catch (SQLException fonte) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão  :" + "com a fonte de dados " + fonte);
            result = false;
        }

        return result;
    }

    public void desconecta() {
        boolean result = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel " + "fecha o banco de dados " + fecha);
            result = false;
        }
    }

    public void executeSQL( String sql ) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando sql " + sqlex.getMessage() + ",sql passado foi " + sql);
        }
    }

    public int executeUpdate( String sql ) throws SQLException {
        try ( Statement statement = conexao.createStatement()) {
            return statement.executeUpdate(sql);
        }
    }

}
