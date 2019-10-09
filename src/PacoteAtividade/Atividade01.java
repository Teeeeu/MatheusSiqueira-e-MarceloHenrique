package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade01 {
    
     public static void main (String [] args){
        
        String aux;
        double salario,percentual,aumento,novosalario;
        
        try{
        
            aux = JOptionPane.showInputDialog(null,"Digite o seu salário: ");
            aux = aux.replace(",",".");
            salario = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null,"Digite o percetual a ser aplicado: ");
            aux = aux.replace(",",".");
            percentual = Double.parseDouble(aux);
        
            aumento = percentual / 100 * salario;
            novosalario = salario + aumento;
            
            JOptionPane.showMessageDialog(null,"O aumento aplicado foi de: "+aumento+"\nO novo salario é de: "+novosalario);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }


}
