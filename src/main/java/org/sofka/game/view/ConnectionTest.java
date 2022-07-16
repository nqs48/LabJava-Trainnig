package org.sofka.game.view;

import org.jboss.logging.Logger;
import org.sofka.game.configuration.Configuration;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ConnectionTest {

    static Logger log = Logger.getLogger("Connection Data Base");

    public static void main(String[] args) {

        Properties properties = Configuration.environmentProperties();
        String driver = properties.getProperty("driver");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        java.sql.Connection connection;



        try (java.sql.Connection conn = DriverManager.getConnection(url,user,password)){
            String consulta = "INSERT INTO gamer (name, email, score) VALUES (?,?,?)";
            PreparedStatement state = conn.prepareStatement(consulta);
            state.setString(1, "Harry");
            state.setString(2, "harry@user.com");
            state.setInt(3, 1000);
            int rowsInserted = state.executeUpdate();
            if (rowsInserted > 0){
                log.info("Fila insertada");
            }else {
                log.warn("Estamos Jodidos ");
            };
        } catch (Exception e) {
            log.error("Estamos Jodidos "+ e);

        }



    }
}
