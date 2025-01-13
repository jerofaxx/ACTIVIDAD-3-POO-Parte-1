import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ejercicio10 {
    public void ejecutar() {
        JFrame frame = new JFrame("Cálculo de Pago de Matrícula");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(255, 245, 225); // Beige claro
        Color buttonColor = new Color(255, 220, 180);
        Color resultBackgroundColor = backgroundColor;

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblNI = new JLabel("Número de inscripción:");
        lblNI.setBounds(10, 20, 180, 25);
        frame.add(lblNI);

        JTextField txtNI = new JTextField(20);
        txtNI.setBounds(200, 20, 200, 25);
        frame.add(txtNI);

        JLabel lblName = new JLabel("Nombres:");
        lblName.setBounds(10, 60, 180, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField(20);
        txtName.setBounds(200, 60, 200, 25);
        frame.add(txtName);

        JLabel lblPatrimonio = new JLabel("Patrimonio:");
        lblPatrimonio.setBounds(10, 100, 180, 25);
        frame.add(lblPatrimonio);

        JTextField txtPatrimonio = new JTextField(20);
        txtPatrimonio.setBounds(200, 100, 200, 25);
        frame.add(txtPatrimonio);

        JLabel lblEstrato = new JLabel("Estrato social:");
        lblEstrato.setBounds(10, 140, 180, 25);
        frame.add(lblEstrato);

        JTextField txtEstrato = new JTextField(20);
        txtEstrato.setBounds(200, 140, 200, 25);
        frame.add(txtEstrato);

        JLabel lblResult = new JLabel("Resultado:");
        lblResult.setBounds(10, 220, 180, 25);
        lblResult.setVisible(false);
        frame.add(lblResult);

        JTextArea txtResult = new JTextArea();
        txtResult.setBounds(200, 220, 200, 100);
        txtResult.setEditable(false);
        txtResult.setBackground(resultBackgroundColor);
        txtResult.setFont(new Font("Arial", Font.PLAIN, 14));
        txtResult.setVisible(false);
        frame.add(txtResult);

        JButton btnCalculate = new JButton("Calcular Matrícula");
        btnCalculate.setBounds(150, 180, 150, 25);
        btnCalculate.setBackground(buttonColor);
        frame.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String numeroInscripcion = txtNI.getText();
                    String nombres = txtName.getText();
                    double patrimonio = Double.parseDouble(txtPatrimonio.getText());
                    int estrato = Integer.parseInt(txtEstrato.getText());

                    double valorMatricula = 50000;

                    if (patrimonio > 2000000 && estrato > 3) {
                        valorMatricula += 0.03 * patrimonio;
                    }

                    lblResult.setVisible(true);
                    txtResult.setText(
                        "Número de Inscripción: " + numeroInscripcion + "\n" +
                        "Nombres: " + nombres + "\n" +
                        "Pago por Matrícula: $" + String.format("%.2f", valorMatricula)
                    );
                    txtResult.setVisible(true);
                } catch (NumberFormatException ex) {
                    lblResult.setVisible(true);
                    txtResult.setText("ingrese valores válidos.");
                    txtResult.setVisible(true);
                }
            }
        });

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 340, 150, 25);
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
