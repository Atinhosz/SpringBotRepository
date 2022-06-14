import java.sql.*;

public class TestaInsercaoComParametro  {

    public static void main(String[] args) throws SQLException {
        FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
        try(Connection connection = fabricaDeConexao.recuperarConexao()){

            connection.setAutoCommit(false);


            try (
                    PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (? , ?)", Statement.RETURN_GENERATED_KEYS);
            ) {
                adicionarVariavel("Desodorante", "Anti Transpirante", stm);
                adicionarVariavel("Teclado", "Teclado sete oitavas", stm);

                connection.commit();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLBACK EXECUTADO ");
                connection.rollback();
            }
        }

    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        if(nome.equals("radio")){
            throw new RuntimeException("não foi possivel adicionar o produto");
        }


        stm.execute();

       try( ResultSet resultado = stm.getGeneratedKeys()) {

           while (resultado.next()) {
               Integer id = resultado.getInt(1);
               System.out.println("o id criado foi " + id);
           }
       }
    }

}

