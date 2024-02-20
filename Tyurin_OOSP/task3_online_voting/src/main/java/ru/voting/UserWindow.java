package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserWindow extends JFrame {
    public UserWindow() {
        setTitle("User Actions");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 5, 5));

        JButton registerButton = new JButton("Регистрация");
        JButton voteButton = new JButton("Голосование");
        JButton viewCandidatesButton = new JButton("Просмотр кандидатов");
        JButton viewVotingsButton = new JButton("Просмотр результатов голосования");

        add(registerButton);
        add(voteButton);
        add(viewCandidatesButton);
        add(viewVotingsButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика регистрации
                JOptionPane.showMessageDialog(null, "Регистрация...");
            }
        });

        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика голосования
                JOptionPane.showMessageDialog(null, "Голосование...");
            }
        });

        viewCandidatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра кандидатов
                JOptionPane.showMessageDialog(null, "Просмотр кандидатов...");
            }
        });

        viewVotingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра голосований
                JOptionPane.showMessageDialog(null, "Просмотр проголосовавших...");
            }
        });

        setVisible(true);
    }
}