package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String[] args) {

        String raio;
        double perimetro, raioCirc;

        try {
            raio = JOptionPane.showInputDialog(null, "Digite o raio da circunferencia: ");
            raio = raio.replace(",", ".");
            raioCirc = Double.parseDouble(raio);

            perimetro = 2 * 3.14 * raioCirc;
            JOptionPane.showMessageDialog(null, "O perimetro sera de: " + perimetro);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
}
