import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestaRemocao {

    public static void main(String[] args) throws SQLException {

        FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
        Connection connection = fabricaDeConexao.recuperarConexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1  ,2);
        stm.execute();


        Integer  linhaModificadas = stm.getUpdateCount();

        System.out.println("Qunatidade de linhas que foram modificadas " + linhaModificadas);
    }

}
