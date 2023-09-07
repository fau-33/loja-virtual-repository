import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE id > 2");
		
		Integer linhasModificadas  = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas modificadas " + linhasModificadas);

	}

}
