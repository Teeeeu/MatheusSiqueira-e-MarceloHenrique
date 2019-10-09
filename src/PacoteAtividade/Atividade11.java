package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade11 {

    public static void main(String[] args) {
        String senha, x, y, senhanov;
        double PrimNum, SegNum, resp;

        try {
            senha = JOptionPane.showInputDialog(null, "Por favor digite uma senha:");
            

            x = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
            x = x.replace(",", ".");
            PrimNum = Double.parseDouble(x);

            y = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
            y = y.replace(",", ".");
            SegNum = Double.parseDouble(y);

            resp = PrimNum / SegNum;

            senhanov = JOptionPane.showInputDialog(null, "Digite sua senha novamente:");

            if (senha == null ? senhanov == null : senha.equals(senhanov)) {
                JOptionPane.showMessageDialog(null, "O resultado da conta é: " + resp);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
            System.exit(0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }

}
