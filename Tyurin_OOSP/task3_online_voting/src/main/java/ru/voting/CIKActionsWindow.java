package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CIKActionsWindow extends JFrame {
    public CIKActionsWindow() {
        setTitle("Возможности CIK");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 5, 5));

        JButton createVotingButton = new JButton("Создание голоса");
        JButton addCandidatesButton = new JButton("Добавление кандидатов");
        JButton printResultsButton = new JButton("Распечатать результаты");
        JButton selectGroupingButton = new JButton("Выбор группы");
        JButton sortResultsButton = new JButton("Сортировать результаты");

        add(createVotingButton);
        add(addCandidatesButton);
        add(printResultsButton);
        add(selectGroupingButton);
        add(sortResultsButton);

        createVotingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика создания голосования
                JOptionPane.showMessageDialog(null, "Создание голоса");
            }
        });

        addCandidatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика добавления кандидатов
                JOptionPane.showMessageDialog(null, "Добавление кандидатов");
            }
        });

        printResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика печати результатов в PDF
                JOptionPane.showMessageDialog(null, "Распечатать результаты");
            }
        });

        selectGroupingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика выбора группировки результатов
                JOptionPane.showMessageDialog(null, "Выбор группы");
            }
        });

        sortResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика сортировки результатов
                JOptionPane.showMessageDialog(null, "Сортировать результаты");
            }
        });

        setVisible(true);
    }
}
