package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		PreparedStatement stm = connection
				.prepareStatement("DELETE FROM PRODUTO WHERE id > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificadas  = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas modificadas " + linhasModificadas);

	}

}
