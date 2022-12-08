package com.ash;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ash {
    public static void main(String... args){
        JFrame application = createGUI();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
        application.setVisible(true);
    }
    private static JFrame createGUI() {
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(300, 40));

        JButton convertButton = new JButton("Convert");

        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(300, 40));

        convertButton.addActionListener(event -> {
            output.setText(input.getText());
        });

        JFrame gui = new JFrame("Title case converter");
        gui.setLayout(new FlowLayout());
        gui.add(input);
        gui.add(convertButton);
        gui.add(output);
        gui.pack();
        gui.setLocationRelativeTo(null);

        return gui;
    }
}
