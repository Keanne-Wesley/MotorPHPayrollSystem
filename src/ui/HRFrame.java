package ui;

import javax.swing.*;

public class HRFrame extends JFrame {
    public HRFrame() {
        setTitle("MotorPH Payroll System - HR Dashboard");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnViewAll = new JButton("View All Employees");
        btnViewAll.setBounds(100, 40, 200, 30);
        add(btnViewAll);

        JButton btnSearch = new JButton("Search Employee");
        btnSearch.setBounds(100, 90, 200, 30);
        add(btnSearch);

        JButton btnAdd = new JButton("Add New Employee");
        btnAdd.setBounds(100, 140, 200, 30);
        add(btnAdd);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(100, 200, 200, 30);
        add(btnLogout);

        btnViewAll.addActionListener(e -> JOptionPane.showMessageDialog(this, "View All Employees clicked"));
        btnSearch.addActionListener(e -> JOptionPane.showMessageDialog(this, "Search Employee clicked"));
        btnAdd.addActionListener(e -> JOptionPane.showMessageDialog(this, "Add Employee clicked"));
        btnLogout.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Logging out...");
            dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new HRFrame();
    }
}
