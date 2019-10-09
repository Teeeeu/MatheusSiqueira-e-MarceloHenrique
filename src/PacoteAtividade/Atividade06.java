
package PacoteAtividade;

import javax.swing.JOptionPane;


public class Atividade06 {
    public static void main(String[] args) {

        try {

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
   
    
    }
}
