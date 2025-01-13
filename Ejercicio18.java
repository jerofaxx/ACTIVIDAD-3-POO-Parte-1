import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

class Ejercicio18 {
    public void ejecutar() {
        JFrame frame = new JFrame("Ejercicio 18 - Cálculo de Salario");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(175, 238, 238);
        Color buttonColor = new Color(135, 206, 250);
        Color inputBackgroundColor = new Color(224, 255, 255);

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblCode = new JLabel("Código:");
        lblCode.setBounds(10, 20, 100, 25);
        frame.add(lblCode);

        JTextField txtCode = new JTextField(20);
        txtCode.setBounds(150, 20, 200, 25);
        txtCode.setBackground(inputBackgroundColor);
        frame.add(txtCode);

        JLabel lblName = new JLabel("Nombres:");
        lblName.setBounds(10, 60, 100, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField(20);
        txtName.setBounds(150, 60, 200, 25);
        txtName.setBackground(inputBackgroundColor);
        frame.add(txtName);

        JLabel lblHours = new JLabel("Horas trabajadas:");
        lblHours.setBounds(10, 100, 150, 25);
        frame.add(lblHours);

        JTextField txtHours = new JTextField(20);
        txtHours.setBounds(150, 100, 200, 25);
        txtHours.setBackground(inputBackgroundColor);
        frame.add(txtHours);

        JLabel lblRate = new JLabel("Valor por hora:");
        lblRate.setBounds(10, 140, 150, 25);
        frame.add(lblRate);

        JTextField txtRate = new JTextField(20);
        txtRate.setBounds(150, 140, 200, 25);
        txtRate.setBackground(inputBackgroundColor);
        frame.add(txtRate);

        JLabel lblRetention = new JLabel("Retención (%):");
        lblRetention.setBounds(10, 180, 150, 25);
        frame.add(lblRetention);

        JTextField txtRetention = new JTextField(20);
        txtRetention.setBounds(150, 180, 200, 25);
        txtRetention.setBackground(inputBackgroundColor);
        frame.add(txtRetention);

        JButton btnCalculate = new JButton("Calcular");
        btnCalculate.setBounds(150, 220, 100, 25);
        btnCalculate.setBackground(buttonColor);
        frame.add(btnCalculate);

        JLabel lblResult = new JLabel("Resultados:");
        lblResult.setBounds(10, 260, 150, 25);
        frame.add(lblResult);

        JTextArea txtResult = new JTextArea();
        txtResult.setBounds(150, 260, 200, 100);
        txtResult.setEditable(false);
        txtResult.setBackground(backgroundColor);
        txtResult.setLineWrap(true);
        txtResult.setWrapStyleWord(true);
        frame.add(txtResult);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String code = txtCode.getText();
                    String name = txtName.getText();
                    int hoursWorked = Integer.parseInt(txtHours.getText());
                    double valuePerHour = Double.parseDouble(txtRate.getText());
                    double retention = Double.parseDouble(txtRetention.getText());

                    double grossSalary = hoursWorked * valuePerHour;
                    double netSalary = grossSalary - (grossSalary * (retention / 100));

                    txtResult.setText("Código: " + code + "\n" +
                            "Nombres: " + name + "\n" +
                            "Salario Bruto: $" + String.format("%.2f", grossSalary) + "\n" +
                            "Salario Neto: $" + String.format("%.2f", netSalary));
                } catch (NumberFormatException ex) {
                    txtResult.setText("Por favor, ingrese valores válidos.");
                }
            }
        });

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 360, 150, 25);
        btnVolver.setBackground(buttonColor);
        frame.add(btnVolver);

        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
