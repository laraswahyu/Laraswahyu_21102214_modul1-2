package com.LarasWahyuAdiningsih.PBO.Pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class demodatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField txtNama;
    private JTextField txtNIM;
    private JTextField sprNilai;
    private JButton submitButton;
    private JButton clearButton;
    private JTable dataTable;
    private JSpinner spr_Nilai;

    private DefaultTableModel model;
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    public demodatabase(){
        super("Demo Database");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = txtNIM.getText();
                String nama = txtNama.getText();
                int nilai = (int) spr_Nilai.getValue();
                try {
                    openDB();
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame panel1 = new demodatabase();
        panel1.setVisible(true);
    }

    public static void openDB() throws ClassNotFoundException, SQLException {
        String URL = "jdbc.mysql://localhost:3306/db_demo";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.cj.jdbc Driver");
        c = DriverManager.getConnection(URL, Username, Password);
        s = c.createStatement();

    }

    private void CloseDB(){
        try {
            rs.close();
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}