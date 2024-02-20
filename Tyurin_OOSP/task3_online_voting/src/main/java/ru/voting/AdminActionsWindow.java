package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminActionsWindow extends JFrame {
    public AdminActionsWindow() {
        setTitle("Администратор");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 1, 5, 5));

        JButton viewUsersButton = new JButton("Просмотр пользователей");
        JButton deleteUsersButton = new JButton("Удаление пользователя");
        JButton viewCIKButton = new JButton("Просмотр CIK");
        JButton deleteCIKButton = new JButton("Удаление CIK");
        JButton createCIKButton = new JButton("Создание CIK");
        JButton viewCandidatesButton = new JButton("Просмотр кандидатов");
        JButton deleteCandidatesButton = new JButton("Удаление кандидатов");

        add(viewUsersButton);
        add(deleteUsersButton);
        add(viewCIKButton);
        add(deleteCIKButton);
        add(createCIKButton);
        add(viewCandidatesButton);
        add(deleteCandidatesButton);

        viewUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра пользователей
                JOptionPane.showMessageDialog(null, "Просмотр пользователей");
            }
        });

        deleteUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика удаления пользователей
                JOptionPane.showMessageDialog(null, "Удаление пользователей");
            }
        });

        viewCIKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра ЦИК
                JOptionPane.showMessageDialog(null, "Просмотр CIK");
            }
        });

        deleteCIKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика удаления ЦИК
                JOptionPane.showMessageDialog(null, "Удаление CIK");
            }
        });

        createCIKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика создания ЦИК
                JOptionPane.showMessageDialog(null, "Создание CIK");
            }
        });

        viewCandidatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика просмотра кандидатов
                JOptionPane.showMessageDialog(null, "Просмотр кандидатов");
            }
        });

        deleteCandidatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика удаления кандидатов
                JOptionPane.showMessageDialog(null, "Удаление кандидатов");
            }
        });

        setVisible(true);
    }
}
