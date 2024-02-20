package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoleSelectionWindow extends JFrame {
    public RoleSelectionWindow(LoginWindow parent) {
        setTitle("Выбор роли");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 5, 5));

        String[] roles = {"Администратор", "CIK", "Кандидат", "Пользователь"};
        JComboBox<String> roleComboBox = new JComboBox<>(roles);
        JButton nextButton = new JButton("Далее");

        add(roleComboBox);
        add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedRole = (String) roleComboBox.getSelectedItem();
                if (selectedRole != null) {
                    switch (selectedRole) {
                        case "Пользователь":
                        case "Кандидат":
                            new PersonalInfoEntryWindow(selectedRole);
                            break;
                        default:
                            new UserDataEntryWindow(selectedRole);
                            break;
                    }
                }
                dispose(); // Закрыть окно выбора роли
            }
        });

        setVisible(true);
    }
}
