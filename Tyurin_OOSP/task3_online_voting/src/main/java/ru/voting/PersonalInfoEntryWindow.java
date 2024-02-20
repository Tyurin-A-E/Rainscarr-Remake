package ru.voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalInfoEntryWindow extends JFrame {
    private JTextField fullNameField;
    private JTextField dobField;
    private JTextField snilsField;
    private JTextField passportField;
    private JTextField loginField;
    private JPasswordField passwordField;

    public PersonalInfoEntryWindow(String role) {
        setTitle("Ввод личной информации");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 5, 5));

        JLabel fullNameLabel = new JLabel("Полное имя:");
        fullNameField = new JTextField();
        JLabel dobLabel = new JLabel("Дата рождения:");
        dobField = new JTextField();
        JLabel snilsLabel = new JLabel("СНИЛС:");
        snilsField = new JTextField();
        JLabel passportLabel = new JLabel("Паспорт (серия + номер):");
        passportField = new JTextField();
        JLabel loginLabel = new JLabel("Логин:");
        loginField = new JTextField();
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();
        JButton registerButton = new JButton("Зарегестрироваться");

        add(fullNameLabel);
        add(fullNameField);
        add(dobLabel);
        add(dobField);
        add(snilsLabel);
        add(snilsField);
        add(passportLabel);
        add(passportField);
        add(loginLabel);
        add(loginField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullName = fullNameField.getText();
                String dob = dobField.getText();
                String snils = snilsField.getText();
                String passport = passportField.getText();
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                if (fullName.isEmpty() || dob.isEmpty() || snils.isEmpty() || passport.isEmpty() || login.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Пожалуйста заполните все поля!");
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
