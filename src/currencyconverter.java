package currencyproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cc {
    public static void converter() {
        JFrame f = new JFrame("CONVERTER");
        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;
        
        // Initialize labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        
        l2 = new JLabel("Dollars:");
        l2.setBounds(170, 40, 60, 30);
        
        // Initialize text fields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);
        
        // Initialize buttons
        b1 = new JButton("INR");
        b1.setBounds(50, 80, 60, 15);
        
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 60, 15);
        
        b3 = new JButton("Close");
        b3.setBounds(150, 150, 60, 30);
        
        // INR to Dollar conversion logic
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double d = Double.parseDouble(t1.getText());
                    double d1 = (d / 75.25); // Conversion rate
                    String str1 = String.valueOf(d1);
                    t2.setText(str1); // Update Dollars
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number in Rupees");
                }
            }
        });
        
        // Dollar to INR conversion logic
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double d2 = Double.parseDouble(t2.getText());
                    double d3 = (d2 * 75.25); // Conversion rate
                    String str2 = String.valueOf(d3);
                    t1.setText(str2); // Update Rupees
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number in Dollars");
                }
            }
        });
        
        // Close button logic
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose(); // Close the window
            }
        });

        // Window listener for closing the application
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        // Add components to the frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        // Set frame properties
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        converter();
    }
}
