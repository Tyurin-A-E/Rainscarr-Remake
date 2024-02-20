package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CandidateWindow extends JFrame {

    public CandidateWindow() {
        setTitle("Candidate Actions");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 5, 5));

        JButton fillDataButton = new JButton("Заполнение данных кандидата");
        JButton viewResultsButton = new JButton("Просмотр предыдущих результатов");
        JButton viewVotingsButton = new JButton("Просмотр результатов голосования");

        add(fillDataButton);
        add(viewResultsButton);
        add(viewVotingsButton);

        fillDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика заполнения данных кандидата
                JOptionPane.showMessageDialog(null, "Заполнение данных кандидата");
            }
        });

        viewResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра результатов предыдущих голосований
                JOptionPane.showMessageDialog(null, "Просмотр предыдущих результатов");
            }
        });

        viewVotingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра списка голосований, в которых принимал участие кандидат
                JOptionPane.showMessageDialog(null, "Просмотр результатов голосования");
            }
        });

        setVisible(true);
    }
}
