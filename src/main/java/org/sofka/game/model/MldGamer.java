package org.sofka.game.model;

import org.sofka.game.clases.Gamer;
import org.sofka.game.utils.Messages;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class MldGamer to get the gamers data
 */
public class MldGamer {

    /**
     * Instance of DBConnection
     */
    DBConnection data = new DBConnection();


    /**
     * Method to create the DB connection and sends the query
     * @param g Gamer, to set in database
     * @return Gamer id
     */
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

    /**
     * Make a request to the DB to get all the gamers
     * @return Arraylist with all gamers in the table
     */
    public ArrayList[] allGamers() {
        int e = 0;
        try (Connection conn = DriverManager.getConnection(data.getUrl(),
                data.getUser(), data.getPassword())) {

            String query = "SELECT * FROM `gamer` WHERE 1";
            Statement statementPlan = conn.createStatement();
            ResultSet result = statementPlan.executeQuery(query);
            int columnas = result.getMetaData().getColumnCount();
            ArrayList[] table = new ArrayList[25];
            while (result.next()) {
                table[e] = new ArrayList();
                int i = 1;
                while (i <= columnas) {
                    table[e].add(result.getString(i++));
                }
                e += 1;
            }
            return table;
        } catch (Exception exception) {
            Messages.printMessage("Something Went Wrong"+exception);
            return null;
        }
    }

}
