package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {
        String salarioBruto, emprestimo;
        double salario, emprestimo2, porcentagem, salario3;

        try {
            salarioBruto = JOptionPane.showInputDialog(null, "Digite seu salário bruto: ");
            salarioBruto = salarioBruto.replace(",", ".");
            salario = Double.parseDouble(salarioBruto);

            emprestimo = JOptionPane.showInputDialog(null, "Digite o total do empréstimo: ");
            emprestimo = emprestimo.replace(",", ".");
            emprestimo2 = Double.parseDouble(emprestimo);

            porcentagem = 0.3 * salario;
            /*salario3 = emprestimo2 + salario;

            if (emprestimo2 <= porcentagem) {
                JOptionPane.showMessageDialog(null, "O emprestimo podera ser concedido"+ salario3);*/
            if (emprestimo2 <= porcentagem) {
                JOptionPane.showMessageDialog(null, "O emprestimo podera ser concedido");

            } else {
                JOptionPane.showMessageDialog(null, "O empréstimo não poderá ser concedido");
            }

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
}
