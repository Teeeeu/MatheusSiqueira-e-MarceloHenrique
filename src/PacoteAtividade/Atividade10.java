package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade10 {
    public static void main(String[] args) {
        String tempoViagem, velocidade;
        double tempo, velmedia, distancia, litrosusados;
        

        try {
            tempoViagem = JOptionPane.showInputDialog(null, "Por favor, digite o tempo da viagem, em horas: ");
            tempoViagem = tempoViagem.replace(",", ".");
            tempo = Double.parseDouble(tempoViagem);
            
            velocidade = JOptionPane.showInputDialog(null, "Por favor, digite a velocidade média da viagem: ");
            velocidade = velocidade.replace(",", ".");
            velmedia = Double.parseDouble(velocidade);
            
            distancia = tempo * velmedia;
            litrosusados = distancia / 12;
            
            JOptionPane.showMessageDialog(null, "A quantidade de combustível gasto na viagem é de: " + litrosusados);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }
    
}
