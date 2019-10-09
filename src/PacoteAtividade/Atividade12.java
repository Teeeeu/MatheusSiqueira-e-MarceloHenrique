package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade12 {
    public static void main(String[] args) {
        String x;
        int num, y, z;

        try {
            x = JOptionPane.showInputDialog(null, "Por favor digite um número inteiro:");
            x = x.replace(",", ".");
            num = Integer.parseInt (x);
            
            y = num + 1;
            z = num - 1;
            
            JOptionPane.showMessageDialog(null, "O número antecessor do digitado é: "+ z +"\nO número sucessor do número digitado é: "+ y);
            

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números inteiros");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }

}
