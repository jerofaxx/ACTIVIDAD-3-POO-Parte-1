import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ejercicio7 {
    public void ejecutar() {
        JFrame frame = new JFrame("Comparación de Números");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(240, 240, 255); // Azul claro
        Color buttonColor = new Color(200, 200, 255);
        Color resultBackgroundColor = backgroundColor;

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblA = new JLabel("Valor de A:");
        lblA.setBounds(10, 20, 150, 25);
        frame.add(lblA);

        JTextField txtA = new JTextField(20);
        txtA.setBounds(150, 20, 200, 25);
        frame.add(txtA);

        JLabel lblB = new JLabel("Valor de B:");
        lblB.setBounds(10, 60, 150, 25);
        frame.add(lblB);

        JTextField txtB = new JTextField(20);
        txtB.setBounds(150, 60, 200, 25);
        frame.add(txtB);

        JLabel lblResult = new JLabel("Resultado:");
        lblResult.setBounds(10, 140, 150, 25);
        lblResult.setVisible(false);
        frame.add(lblResult);

        JTextArea txtResult = new JTextArea();
        txtResult.setBounds(150, 140, 200, 50);
        txtResult.setEditable(false);
        txtResult.setBackground(resultBackgroundColor);
        txtResult.setFont(new Font("Arial", Font.PLAIN, 14));
        txtResult.setVisible(false);
        frame.add(txtResult);

        JButton btnCompare = new JButton("Comparar");
        btnCompare.setBounds(150, 100, 100, 25);
        btnCompare.setBackground(buttonColor);
        frame.add(btnCompare);

        btnCompare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());

                    String message;
                    if (a > b) {
                        message = "A es mayor que B";
                    } else if (a == b) {
                        message = "A es igual que B";
                    } else {
                        message = "A es menor que B";
                    }

                    lblResult.setVisible(true);
                    txtResult.setText(message);
                    txtResult.setVisible(true);
                } catch (NumberFormatException ex) {
                    lblResult.setVisible(true);
                    txtResult.setText("ingrese valores numericos");
                    txtResult.setVisible(true);
                }
            }
        });

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 210, 150, 25);
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
