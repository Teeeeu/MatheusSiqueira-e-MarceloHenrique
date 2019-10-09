package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade14 {

    public static void main(String[] args) {

        int nIdadeAtual, nMenorIdade = 0, nomeAtual;
        String nomeMenor = "", nome, idade;

        try {
            for (int i = 1; i <= 10; i++) {
                nome = JOptionPane.showInputDialog(null, i + " - Qual é seu nome: ");
                

                idade = JOptionPane.showInputDialog(null, nome + " Digite sua idade: ");
                nIdadeAtual = Integer.parseInt(idade);

                if (i == 1) {
                    nomeMenor = nome;
                    nMenorIdade = nIdadeAtual;
                } else {
                    if (nMenorIdade > nIdadeAtual) {
                        nMenorIdade = nIdadeAtual;
                        nomeMenor = nome;
                    }
                }

            }
            JOptionPane.showMessageDialog(null, "O nome da pessoa com menor idade é: " + nomeMenor + " com " + nMenorIdade + " anos. ");

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Entrada de idade inválida / nome inválido.");
            System.exit(0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        }
    }

}
