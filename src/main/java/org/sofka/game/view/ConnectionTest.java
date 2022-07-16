package org.sofka.game.view;

import org.jboss.logging.Logger;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionTest {

    static Logger log = Logger.getLogger("Connection Data Base");

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:8889/GameBDWho?useSSL=false";
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
