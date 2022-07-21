import Modelo.Categoria;
import dao.CategoriaDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategoria {

    public static void main(String[] args) throws SQLException {

        try(Connection connection = new FabricaDeConexao().recuperarConexao()){
            CategoriaDao categoriaDao = new CategoriaDao(connection);
            List<Categoria> listaDeCategorias = categoriaDao.listar();
            listaDeCategorias.stream().forEach(ct -> System.out.println(ct.getNome()));
        }


    }
}
