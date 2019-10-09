package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade13 {

    public static void main(String[] args) {

        String x;
        int qtMaior = 0, nIdade = 0;

        try {
            for (int i = 1; i <= 20; i++){
            
               x = JOptionPane.showInputDialog(null, "Digite a idade da "+ i + " pessoa: ");
               nIdade = Integer.parseInt(x);

                if (nIdade >= 18) {
                    qtMaior++;

                }

            }
            JOptionPane.showMessageDialog(null,"Quantidade de pessoas maior de idade: " + qtMaior);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }

}
