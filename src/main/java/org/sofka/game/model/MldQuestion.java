package org.sofka.game.model;

import org.sofka.game.utils.Messages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MldQuestion {

    DBConnection data = new DBConnection();

    public ArrayList[] FindQuestions(String st) {

        DBConnection db = new DBConnection();
        int e = 0;
        try (Connection conn = DriverManager.getConnection(db.getUrl(),
                db.getUser(), db.getPassword())) {

            String query = "SELECT * FROM " + st + " WHERE 1";
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
