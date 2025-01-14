import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ejercicio22 {
    public void ejecutar() {
        JFrame frame = new JFrame("Ejercicio 22");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(220, 240, 255);
        Color buttonColor = new Color(180, 210, 255); 
        Color resultBackgroundColor = new Color(230, 245, 255);

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblName = new JLabel("Nombre del empleado:");
        lblName.setBounds(10, 20, 150, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField(20);
        txtName.setBounds(170, 20, 200, 25);
        txtName.setBackground(resultBackgroundColor);
        frame.add(txtName);

        JLabel lblSalario = new JLabel("Salario por hora:");
        lblSalario.setBounds(10, 60, 150, 25);
        frame.add(lblSalario);

        JTextField txtSalario = new JTextField(20);
        txtSalario.setBounds(170, 60, 200, 25);
        txtSalario.setBackground(resultBackgroundColor);
        frame.add(txtSalario);

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(10, 100, 150, 25);
        frame.add(lblHoras);

        JTextField txtHoras = new JTextField(20);
        txtHoras.setBounds(170, 100, 200, 25);
        txtHoras.setBackground(resultBackgroundColor);
        frame.add(txtHoras);

        JButton btnCalculate = new JButton("Calcular Salario");
        btnCalculate.setBounds(150, 140, 150, 25);
        btnCalculate.setBackground(buttonColor);
        frame.add(btnCalculate);

        JLabel lblResult = new JLabel("Resultado:");
        lblResult.setBounds(10, 180, 150, 25);
        frame.add(lblResult);

        JTextArea txtResult = new JTextArea();
        txtResult.setBounds(170, 180, 250, 80);
        txtResult.setEditable(false);
        txtResult.setBackground(resultBackgroundColor);
        txtResult.setLineWrap(true);
        txtResult.setWrapStyleWord(true);
        frame.add(txtResult);

        JButton btnBack = new JButton("Volver");
        btnBack.setBounds(150, 270, 150, 25);
        btnBack.setBackground(buttonColor);
        frame.add(btnBack);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtName.getText();
                    double salarioPorHora = Double.parseDouble(txtSalario.getText());
                    double horasTrabajadas = Double.parseDouble(txtHoras.getText());

                    double salarioMensual = salarioPorHora * horasTrabajadas;

                    String resultado = salarioMensual > 450000
                            ? "Nombre: " + nombre + "\nSalario mensual: $" + String.format("%.2f", salarioMensual)
                            : "Nombre: " + nombre;

                    txtResult.setText(resultado);
                } catch (NumberFormatException ex) {
                    txtResult.setText("Por favor, ingrese valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}
