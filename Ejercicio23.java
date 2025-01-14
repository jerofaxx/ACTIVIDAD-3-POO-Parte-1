import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ejercicio23 {
    public void ejecutar() {
        JFrame frame = new JFrame("Ejercicio 23");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(255, 255, 200); 
        Color buttonColor = new Color(255, 230, 150);   
        Color resultBackgroundColor = new Color(255, 250, 220); 

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblA = new JLabel("Valor de A:");
        lblA.setBounds(10, 20, 150, 25);
        frame.add(lblA);

        JTextField txtA = new JTextField(20);
        txtA.setBounds(170, 20, 200, 25);
        frame.add(txtA);

        JLabel lblB = new JLabel("Valor de B:");
        lblB.setBounds(10, 60, 150, 25);
        frame.add(lblB);

        JTextField txtB = new JTextField(20);
        txtB.setBounds(170, 60, 200, 25);
        frame.add(txtB);

        JLabel lblC = new JLabel("Valor de C:");
        lblC.setBounds(10, 100, 150, 25);
        frame.add(lblC);

        JTextField txtC = new JTextField(20);
        txtC.setBounds(170, 100, 200, 25);
        frame.add(txtC);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 150, 160, 30);
        btnCalcular.setBackground(buttonColor);
        frame.add(btnCalcular);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(20, 200, 400, 100);
        resultArea.setEditable(false);
        resultArea.setBackground(resultBackgroundColor);
        frame.add(resultArea);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 320, 120, 30);
        btnVolver.setBackground(buttonColor);
        frame.add(btnVolver);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double A = Double.parseDouble(txtA.getText());
                    double B = Double.parseDouble(txtB.getText());
                    double C = Double.parseDouble(txtC.getText());

                    double discriminante = B * B - 4 * A * C;

                    if (discriminante > 0) {
                        double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                        double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                        resultArea.setText("Dos soluciones reales:\n" +
                                "x1 = " + String.format("%.2f", x1) + "\n" +
                                "x2 = " + String.format("%.2f", x2));
                    } else if (discriminante == 0) {
                        double x = -B / (2 * A);
                        resultArea.setText("Una solución única:\n" +
                                "x = " + String.format("%.2f", x));
                    } else {
                        resultArea.setText("La ecuación no tiene soluciones reales.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Por favor, ingrese valores válidos.");
                }
            }
        });

        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
