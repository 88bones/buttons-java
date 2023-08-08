package button;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class readdata {

    public readdata() {
        JFrame frame = new JFrame("Database Data");
        String[][] data = getData();
        String[] colunmTitle = {"Roll Number", "Name", "Address", "Gender", "Province"};
        JTable tbl = new JTable(data, colunmTitle);
        JScrollPane pane = new JScrollPane(tbl);
        frame.add(pane);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new readdata();
    }

    public String[][] getData() {
        int counter = 0, count = 0;
        String[][] data = {{}};
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
            String sql = "SELECT * FROM student";   //selects all the records
            PreparedStatement statement = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                counter++;
            }
            data = new String[counter][5];
            rs.beforeFirst();
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    data[count][i] = rs.getString(i + 2);
                }
                count = count + 1;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception caught " + ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return data;

    }
}


