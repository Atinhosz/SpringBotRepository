import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

    public static void main(String[] args) throws SQLException {
        FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
        Connection connection = fabricaDeConexao.recuperarConexao();

        Statement stm = connection.createStatement();

        stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse','Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);

        ResultSet resultado = stm.getGeneratedKeys();

        while (resultado.next()){
            Integer id = resultado.getInt(1);
            System.out.println("o id criado foi " + id );
        }

        connection.close();
    }


}
