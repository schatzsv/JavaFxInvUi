package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

import java.sql.*;

public class TableViewController implements Initializable {
    @FXML
    private TableView<Record> tableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Record> data = tableView.getItems();
        Connection c;
        Statement stmt;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:it.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM trans;" );
            while ( rs.next() ) {
                String  source = rs.getString("Source");
                String  name = rs.getString("Name");
                String  symbol = rs.getString("Symbol");
                String  fundname = rs.getString("Fundname");
                String  ttype = rs.getString("Ttype");
                Double  v = rs.getDouble("Divrate");
                String divrate = "";
                if (v != 0.0) {
                    divrate = String.valueOf(v);
                }
                String shares = String.valueOf(rs.getDouble("Shares"));
                String shprice = String.valueOf(rs.getDouble("Shprice"));
                v = rs.getDouble("Tfee");
                String tfee = "";
                if (v != 0.0) {
                    tfee = String.valueOf(v);
                }
                v = rs.getDouble("Tamt");
                String tamt = "";
                if (v != 0.0) {
                    tamt = String.valueOf(v);
                }
                String note = String.valueOf(rs.getString("Note"));
                String taxlot = String.valueOf(rs.getString("Taxlot"));
                data.add(new Record(source, name, symbol, fundname, ttype, divrate,
                        shares, shprice, tfee, tamt, note, taxlot));
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            //System.exit(0);
        }
        /*
        int rowNum = data.size();
        for (int i = rowNum; i < rowNum + 100000; i++) {
            data.add(new Record("Added row", String.valueOf(i)));
        }
        */
    }

    @FXML
    protected void addRows(ActionEvent event) {
        ObservableList<Record> data = tableView.getItems();
        int rowNum = data.size();
        for (int i = rowNum; i < rowNum + 100000; i++) {
            data.add(new Record("Added row", String.valueOf(i), "", "", "",
                    "", "", "", "", "", "", ""));
        }
    }

}
