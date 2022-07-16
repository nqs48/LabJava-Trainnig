package org.sofka.game.model;

import org.sofka.game.clases.Gamer;
import org.sofka.game.utils.Messages;

import java.sql.*;
import java.util.ArrayList;

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

    public ArrayList[] allGamers() {

        int e = 0;
        try (Connection conn = DriverManager.getConnection(data.getUrl(),
                data.getUser(), data.getPassword())) {

            String query = "SELECT * FROM `gamer` WHERE 1";
            Statement statementPlan = conn.createStatement();
            ResultSet result = statementPlan.executeQuery(query);
            int columnas = result.getMetaData().getColumnCount();
            ArrayList[] table = new ArrayList[22];
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

    public int numberGamers(){
        try (Connection conn = DriverManager.getConnection(data.getUrl(),
                data.getUser(), data.getPassword())) {

            String query2 ="SELECT count(*) FROM gamer";
            Statement statementPlan = conn.createStatement();
            ResultSet result2 = statementPlan.executeQuery(query2);
            int filas= result2.getMetaData().getColumnCount();
            return filas;
        }
        catch (Exception exception) {
            Messages.printMessage("Something Went Wrong"+exception);
            return 0;
        }

    }


}
