package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade08 {

    public static void main(String[] args) {
        String HoraAula, qtAulaMes, porINSS;
        double vlHoraAula, porINSS2, vlSalarioLiq, qtAulaMes2;
        int qtHoraAula;

        try {
            HoraAula = JOptionPane.showInputDialog(null, "Valor da hora/aula: ");
            vlHoraAula = Double.parseDouble(HoraAula);

            if (vlHoraAula <= 0) {
                JOptionPane.showMessageDialog(null, "Sem horas para calcular.");
            }
            qtAulaMes = JOptionPane.showInputDialog(null, "Digite a quantidade de aulas no mês: ");
            qtAulaMes2 = Double.parseDouble(qtAulaMes);

            if (qtAulaMes2 <= 0) {
                JOptionPane.showMessageDialog(null, "Sem horas para calcular");
            }
            porINSS = JOptionPane.showInputDialog(null, "Digite a aliquota de INSS (apenas números): ");
            porINSS2 = Double.parseDouble (porINSS);
            
            if (porINSS2 <=0){
            JOptionPane.showMessageDialog(null, "INSS negativo não é permitido");
            }
            qtHoraAula =1;
            
            vlSalarioLiq = (qtAulaMes2 * qtHoraAula * vlHoraAula) * ((100-porINSS2)/100);
            
            JOptionPane.showMessageDialog(null, "Seu salário liquido é de: "+ vlSalarioLiq);
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }

}
