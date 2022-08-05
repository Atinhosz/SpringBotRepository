import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class FabricaDeConexao {


public DataSource dataSource;



    public FabricaDeConexao(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("123123");

        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooledDataSource;

    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();


    }
}
