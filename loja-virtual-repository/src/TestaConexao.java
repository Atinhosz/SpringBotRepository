import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao{

    public static void main(String[] args) throws SQLException {

       FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
       Connection connection = fabricaDeConexao.recuperarConexao();

       connection.close();
    }
}
