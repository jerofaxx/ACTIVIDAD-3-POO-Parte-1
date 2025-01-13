import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("ACTIVIDAD 3 POO");
        mainFrame.setSize(500, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        Color backgroundColor = new Color(230, 255, 230);
        Color buttonColor = new Color(200, 255, 200);
        Color headerColor = new Color(173, 216, 230);

        mainFrame.getContentPane().setBackground(backgroundColor);

        JLabel header = new JLabel("<html><center>ACTIVIDAD 3 POO<br>" +
                "Jeronimo Restrepo Ramirez<br>" +
                "Ciencias de la Computacion<br>" +
                "Grupo: 4</center></html>", SwingConstants.CENTER);
        header.setBounds(50, 10, 400, 100);
        header.setOpaque(true);
        header.setBackground(headerColor);
        header.setFont(new Font("Arial", Font.BOLD, 16));
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainFrame.add(header);

        JButton btnEjercicio18 = new JButton("Ejercicio 18 (Cap 3.)");
        btnEjercicio18.setBounds(150, 130, 200, 30);
        btnEjercicio18.setBackground(buttonColor);
        mainFrame.add(btnEjercicio18);
        btnEjercicio18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio18 ejercicio = new Ejercicio18();
                ejercicio.ejecutar();
            }
        });

        JButton btnEjercicio19 = new JButton("Ejercicio 19 (Cap 3.)");
        btnEjercicio19.setBounds(150, 180, 200, 30);
        btnEjercicio19.setBackground(buttonColor);
        mainFrame.add(btnEjercicio19);
        btnEjercicio19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio19 ejercicio = new Ejercicio19();
                ejercicio.ejecutar();
            }
        });

        JButton btnEjercicio7 = new JButton("Ejercicio 7 (Cap 4.)");
        btnEjercicio7.setBounds(150, 230, 200, 30);
        btnEjercicio7.setBackground(buttonColor);
        mainFrame.add(btnEjercicio7);
        btnEjercicio7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio7 ejercicio = new Ejercicio7();
                ejercicio.ejecutar();
            }
        });

        JButton btnEjercicio10 = new JButton("Ejercicio 10 (Cap 4.)");
        btnEjercicio10.setBounds(150, 280, 200, 30);
        btnEjercicio10.setBackground(buttonColor);
        mainFrame.add(btnEjercicio10);
        btnEjercicio10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio10 ejercicio = new Ejercicio10();
                ejercicio.ejecutar();
            }
        });

        JButton btnEjercicio22 = new JButton("Ejercicio 22 (Cap 4.)");
        btnEjercicio22.setBounds(150, 330, 200, 30);
        btnEjercicio22.setBackground(buttonColor);
        mainFrame.add(btnEjercicio22);
        btnEjercicio22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio22 ejercicio = new Ejercicio22();
                ejercicio.ejecutar();
            }
        });

        JButton btnEjercicio23 = new JButton("Ejercicio 23 (Cap 4.)");
        btnEjercicio23.setBounds(150, 380, 200, 30);
        btnEjercicio23.setBackground(buttonColor);
        mainFrame.add(btnEjercicio23);
        btnEjercicio23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejercicio23 ejercicio = new Ejercicio23();
                ejercicio.ejecutar();
            }
        });

        mainFrame.setVisible(true);
    }
}
