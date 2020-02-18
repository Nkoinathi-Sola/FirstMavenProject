package com.nkosinathi.app;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class App {
        public static void main(String[] args) {

            final JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            JButton button1 = new JButton("Click me to access my link.", new ImageIcon("C:\\Users\\nkosi\\IdeaProjects\\CloningAssignment\\src\\animate.gif"));
            //JButton button1 = new JButton();
            button1.setToolTipText("Click me to access my link.");
            button1.setPreferredSize(new Dimension(200, 35));


            button1.setForeground(Color.BLACK);
            button1.setBackground(Color.BLUE);
            Border line = new LineBorder(Color.WHITE);
            Border margin = new EmptyBorder(5, 15, 5, 15);
            Border compound = new CompoundBorder(line, margin);
            button1.setBorder(compound);

            final JLabel label = new JLabel("Click me to access my link");

            label.setVisible(true);
            frame.add(panel);
            panel.add(button1);
            panel.add(label);
            frame.setVisible(true);

            frame.setPreferredSize(new Dimension(500, 100)); //sets dimensions
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            button1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent arg0) {
                    JOptionPane.showMessageDialog(frame.getComponent(0), "Hi there I'm a git repo from https://github.com/Nkoinathi-Sola/FirstMavenProject.git ... Clone me and modify me for better features.");
                    label.setVisible(true);
                }
            });

        }

    }

