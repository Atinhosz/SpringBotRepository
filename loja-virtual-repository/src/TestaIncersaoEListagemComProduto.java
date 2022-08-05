import Modelo.Produto;
import dao.ProdutoDao;

import java.sql.*;
import java.util.List;

public class TestaIncersaoEListagemComProduto {

    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Comoda","Comoda Vertical");

        try(Connection connection = new FabricaDeConexao().recuperarConexao()) {
              ProdutoDao produtoDao = new ProdutoDao(connection);
            produtoDao.salvar(comoda);
            List<Produto> listaDeProdutos = produtoDao.listar();
            listaDeProdutos.stream().forEach(lp -> System.out.println(lp));

        }
    }
}
