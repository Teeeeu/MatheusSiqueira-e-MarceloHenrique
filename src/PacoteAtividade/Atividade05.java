
package PacoteAtividade;

import javax.swing.JOptionPane;


public class Atividade05 {
    public static void main(String[] args) {

        try {
            int i = 5 ,j ,k;
            j = --i;
            k = i ++;
            i += 10;
            JOptionPane.showMessageDialog(null, "O valor de i é: " + i +"\nO valor de k é: " + k +"\nO valor de j é: "+ j);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
}
    

