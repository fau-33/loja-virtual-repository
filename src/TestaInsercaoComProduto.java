import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.jdbc.ConnectionFactory;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {
	public static void main(String[] args) throws SQLException {
		
		Produto comoda = new Produto("Cômoda", "Cômoda Vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			
			produtoDAO.salvar(comoda);
			// Lista = persistenciaProduto.listar();
		}
		
	}
}
