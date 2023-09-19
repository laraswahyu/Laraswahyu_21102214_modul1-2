package com.LarasWahyuAdiningsih.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField txt_nim;
    private JTextField txt_telp;
    private JRadioButton rb_laki;
    private JTextArea txt_area;
    private JRadioButton rb_perempuan;
    private JButton showButton;
    private JButton clearButton;
    private JPanel jpanel;
    public Register(){
        super("Form Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        this.setSize(800, 600);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_nama.setText("");
                txt_nim.setText("");
                txt_telp.setText("");
                txt_area.setText("");
                cb_prodi.setSelectedIndex(0);
                jk.clearSelection();

            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namaTextField.getText();
                String nim = nimTextField.getText();
                String telp = telpTextField.getText();
                String alamat = AlamatTextArea.getText();
                String prodi =cb_prodi.getSelectedItem().toString();
                String jk;
                if (LakiRadioButton.isSelected()){
                    JK = "Laki laki";
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new Register();
        frame.setVisible(true);
    }
    private JComboBox cb_prodi;
    private JTextField txt_nama;
    private ButtonGroup jk;
}
