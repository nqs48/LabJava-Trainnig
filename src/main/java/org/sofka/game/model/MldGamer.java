package org.sofka.game.model;

import org.sofka.game.clases.Gamer;
import org.sofka.game.utils.Messages;

import java.sql.*;

public class MldGamer {

    DBConnection data = new DBConnection();

    public int createGamer(Gamer g) {
        int id = 0;
        try (Connection conn = DriverManager.getConnection(data.getUrl(), data.getUser(),
                data.getPassword())) {
            String consulta = "INSERT INTO gamer (name,email,score) VALUES (?,?,?)";
            PreparedStatement state = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            state.setString(1, g.getName());
            state.setString(2, g.getEmail());
            state.setInt(3, g.getScore());
            int inserto = state.executeUpdate();
            if (inserto > 0) {
                ResultSet keys = state.getGeneratedKeys();
                if (keys.next()) {
                    id = keys.getInt(1);
                }
            }
            return id;
        } catch (Exception e) {
            Messages.printError("Something went Wrong"+ e);
            return id;
        }
    }


}