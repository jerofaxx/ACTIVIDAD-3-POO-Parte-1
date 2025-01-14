import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("ACTIVIDAD 3 POO");
        mainFrame.setSize(500, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color backgroundColor = new Color(255, 255, 255);
        Color headerColor = new Color(250, 216, 230);
        Color menuColor = new Color(200, 220, 255);
        Color menuTextColor = new Color(50, 50, 150);

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

        try {
            ImageIcon originalIcon = new ImageIcon("gatito.jpg");
            Image scaledImage = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            JLabel gatoLabel = new JLabel(scaledIcon);
            gatoLabel.setBounds(150, 120, 200, 200);
            mainFrame.add(gatoLabel);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("No se pudo cargar la imagen del gatito", SwingConstants.CENTER);
            errorLabel.setBounds(150, 120, 200, 30);
            errorLabel.setForeground(Color.RED);
            mainFrame.add(errorLabel);
        }

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(menuColor);

        JMenu menuEjercicios = new JMenu("Menu de Ejercicios");
        menuEjercicios.setForeground(menuTextColor);
        menuEjercicios.setFont(new Font("Arial", Font.BOLD, 14));

        addMenuItem(menuEjercicios, "Ejercicio 18 (Cap 3.)", e -> new Ejercicio18().ejecutar());
        addMenuItem(menuEjercicios, "Ejercicio 19 (Cap 3.)", e -> new Ejercicio19().ejecutar());
        addMenuItem(menuEjercicios, "Ejercicio 7 (Cap 4.)", e -> new Ejercicio7().ejecutar());
        addMenuItem(menuEjercicios, "Ejercicio 10 (Cap 4.)", e -> new Ejercicio10().ejecutar());
        addMenuItem(menuEjercicios, "Ejercicio 22 (Cap 4.)", e -> new Ejercicio22().ejecutar());
        addMenuItem(menuEjercicios, "Ejercicio 23 (Cap 4.)", e -> new Ejercicio23().ejecutar());

        menuBar.add(menuEjercicios);
        mainFrame.setJMenuBar(menuBar);

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }

    private static void addMenuItem(JMenu menu, String text, ActionListener action) {
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItem.addActionListener(action);
        menu.add(menuItem);
    }
}
