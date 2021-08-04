/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author apmejiar
 */
public class Pool {
    private final String DB = "ventas_db_g42";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB;
    private final String USER = "root";
    private final String PASS = "";
    
    public DataSource initilizeDataSource(){
        BasicDataSource inst_basicDataSource = new BasicDataSource();
        inst_basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        inst_basicDataSource.setUrl(URL);
        inst_basicDataSource.setUsername(USER);
        inst_basicDataSource.setPassword(PASS);
        inst_basicDataSource.setMaxActive(50);
        return inst_basicDataSource;
    }
}
