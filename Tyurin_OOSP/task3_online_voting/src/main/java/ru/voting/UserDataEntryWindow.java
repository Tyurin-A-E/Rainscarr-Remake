package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDataEntryWindow extends JFrame {
    private JTextField loginField;
    private JPasswordField passwordField;

    public UserDataEntryWindow(String role) {
        setTitle("Ввод пользовательских данных");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        JLabel loginLabel = new JLabel("Логин:");
        loginField = new JTextField();
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();
        JButton registerButton = new JButton("Зарегистрироваться");

        add(loginLabel);
        add(loginField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                if (login.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Пожалуста заполните все поля авиторизации");
                    return;
                }

                // Добавить регистрацию пользователя с указанной ролью
                LoginWindow.getInstance().addUser(login, password, role);

                JOptionPane.showMessageDialog(null, "Успешная регистрация! Ваша роль: " + role);
                dispose(); // Закрыть окно ввода данных
            }
        });

        setVisible(true);
    }
}
