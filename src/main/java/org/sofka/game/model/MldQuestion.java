package org.sofka.game.model;

import org.sofka.game.utils.Messages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class MldQuestion to get the questions data
 */
public class MldQuestion {

    /**
     * Instance of DBConnection
     */
    DBConnection data = new DBConnection();

    /**
     * This method finds the questions filter for levels
     * @param level value to filter the data
     * @return ArrayList the questions filter for level
     */
    public ArrayList[] FindQuestions(int level) {

        DBConnection db = new DBConnection();
        int e = 0;
        try (Connection conn = DriverManager.getConnection(db.getUrl(),
                db.getUser(), db.getPassword())) {

            String query = "SELECT * FROM `questions` WHERE `level` = "+level;
            Statement statementPlan = conn.createStatement();
            ResultSet result = statementPlan.executeQuery(query);
            int columnas = result.getMetaData().getColumnCount();
            ArrayList[] table = new ArrayList[5];

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
