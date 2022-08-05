import java.sql.*;


public class TestaListagem {

    public static void main(String[] args) throws SQLException {
        FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
        Connection connection = fabricaDeConexao.recuperarConexao();

        PreparedStatement stm = connection.prepareStatement("SELECT ID,NOME, DESCRICAO FROM PRODUTO");
        stm.execute();

        ResultSet resultado = stm.getResultSet();


        while (resultado.next()){
            Integer id = resultado.getInt("ID");
            System.out.println(id);
            String nome = resultado.getString("NOME");
            System.out.println(nome);
            String descricao = resultado.getString("descricao");
            System.out.println(descricao);

        }
        connection.close();

    }

}
