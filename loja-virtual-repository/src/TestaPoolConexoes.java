import java.sql.Connection;
import java.sql.SQLException;

public class TestaPoolConexoes {


    public static void main(String[] args) throws SQLException {
        FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();



        for(int i = 0; i < 20; i++){
            fabricaDeConexao.recuperarConexao();
            System.out.println("Conexão de numero: " + i);
        }
    }
}
