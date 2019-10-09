
package PacoteAtividade;

import javax.swing.JOptionPane;


public class Atividade09 {
    public static void main(String[] args) {
        String raio, altura;
        double raio2, altura2, volume, raio3;

        try {
            raio = JOptionPane.showInputDialog(null, "Por favor, informe o raio da lata de óleo: ");
            raio = raio.replace(",", ".");
            raio2 = Double.parseDouble (raio);
            
            raio3 = raio2*raio2;
            
            altura = JOptionPane.showInputDialog(null, "Por favor, informe a altura da lata de óleo: ");
            altura = altura.replace(",", ".");
            altura2 = Double.parseDouble (altura);
            
            volume = 3.14159 * raio3 * altura2;
            JOptionPane.showMessageDialog(null, "O volume da lata de óleo será de: " + volume);
            

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
    
}
