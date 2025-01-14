import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

class Ejercicio19 {
    public void ejecutar() {
        JFrame frame = new JFrame("Ejercicio 19");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        Color backgroundColor = new Color(255, 230, 230);
        Color buttonColor = new Color(255, 200, 200);
        Color inputBackgroundColor = new Color(255, 240, 240);

        frame.getContentPane().setBackground(backgroundColor);

        JLabel lblSide = new JLabel("Valor del lado:");
        lblSide.setBounds(10, 20, 150, 25);
        frame.add(lblSide);

        JTextField txtSide = new JTextField(20);
        txtSide.setBounds(150, 20, 200, 25);
        txtSide.setBackground(inputBackgroundColor);
        frame.add(txtSide);

        JButton btnCalculate = new JButton("Calcular");
        btnCalculate.setBounds(150, 60, 100, 25);
        btnCalculate.setBackground(buttonColor);
        frame.add(btnCalculate);

        JLabel lblResult = new JLabel("Resultados:");
        lblResult.setBounds(10, 100, 150, 25);
        frame.add(lblResult);

        JTextArea txtResult = new JTextArea();
        txtResult.setBounds(150, 100, 200, 100);
        txtResult.setEditable(false);
        txtResult.setBackground(inputBackgroundColor);
        txtResult.setLineWrap(true);
        txtResult.setWrapStyleWord(true);
        frame.add(txtResult);

        JButton btnBack = new JButton("Volver");
        btnBack.setBounds(150, 220, 100, 25);
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
                    double side = Double.parseDouble(txtSide.getText());

                    if (side <= 0) {
                        throw new NumberFormatException();
                    }

                    double perimeter = 3 * side;
                    double height = Math.sqrt(3) / 2 * side;
                    double area = (Math.sqrt(3) / 4) * side * side;

                    txtResult.setText("Perímetro: " + String.format("%.2f", perimeter) + "\n" +
                            "Altura: " + String.format("%.2f", height) + "\n" +
                            "Área: " + String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    txtResult.setText("Por favor, ingrese un valor válido para el lado (positivo y numérico).");
                }
            }
        });

        frame.setVisible(true);
    }
}
