package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationWindow extends JFrame {
    private JTextField loginField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;

    public RegistrationWindow(LoginWindow parent) {
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Закрывать окно регистрации, не закрывая главное окно входа
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel loginLabel = new JLabel("Логин:");
        loginField = new JTextField();
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();
        JLabel roleLabel = new JLabel("Роль:");
        String[] roles = {"Администратор", "CIK", "Кандидат", "Пользователь"}; // Возможные роли
        roleComboBox = new JComboBox<>(roles);
        JButton registerButton = new JButton("Зарегестрироваться");

        add(loginLabel);
        add(loginField);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newLogin = loginField.getText();
                String newPassword = new String(passwordField.getPassword());
                String selectedRole = (String) roleComboBox.getSelectedItem();

                if (newLogin.isEmpty() || newPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Пожалуйста заполните поля авторизации!");
                    return;
                }

                parent.addUser(newLogin, newPassword, selectedRole); // Добавляем нового пользователя с указанной ролью
                JOptionPane.showMessageDialog(null, "Успешная регистрация! Ваша роль: " + selectedRole);
                dispose(); // Закрываем окно регистрации
            }
        });

        setVisible(true);
    }
}