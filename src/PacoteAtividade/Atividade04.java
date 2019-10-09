package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade04 {

    public static void main(String[] args) {
        int x;
        String aux;
        double numeros, resp = 0;

        x = 1;
        try {
            while (x == 1) {
                aux = JOptionPane.showInputDialog(null, "Ditige o valor a ser somado: ");
                aux = aux.replace(",", ".");
                numeros = Double.parseDouble(aux);

                if (numeros < 0) {
                    JOptionPane.showMessageDialog(null, "O número digitado é negativo");
                    System.exit(0);
                }
                resp = numeros + resp;

                aux = JOptionPane.showInputDialog(null, "Deseja somar mais algum valor? se:\n 1 - sim\n2 - não");
                x = Integer.parseInt(aux);

                switch (x) {
                    case 1:
                        x = 1;
                        break;
                    case 2:
                        x = 2;
                        break;
                    default:
                        System.exit(0);

                }

            }

            JOptionPane.showMessageDialog(null, "A soma dos números é: " + resp);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
}
