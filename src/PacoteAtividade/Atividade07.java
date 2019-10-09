package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade07 {

    public static void main(String[] args) {
        String preco;
        double preco2, precoFinal, desconto;

        try {
            preco = JOptionPane.showInputDialog(null, "Por favor digite o preço do item a ser comprado: ");
            preco = preco.replace(",", ".");
            preco2 = Double.parseDouble(preco);
            
            desconto = preco2 * 0.09;
            precoFinal = preco2 - desconto;
            JOptionPane.showMessageDialog (null, "O preço final do produto com desconto é de: "+ precoFinal);
            

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }

    }
}
