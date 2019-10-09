package PacoteAtividade;

import javax.swing.JOptionPane;

public class Atividade15 {

    public static void main(String[] args) {
        int escolha, escolha2, escolha3, calpratopric = 0, calsobremesa = 0, calbebida = 0;
        String prato, pratoPric = "", sobremesa, sobremesa2 = "", bebida, bebida2 ="";
        double calorias;

        try {
            prato = JOptionPane.showInputDialog(null, "Opoções de prato principal são de:\n 1 - Vegetariano\n 2 - Peixe\n 3 - Frango\n 4 - Carne");
            escolha = Integer.parseInt(prato);

            switch (escolha) {
                case 1:
                    pratoPric = "Vegetariano";
                    calpratopric = 180;

                    break;
                case 2:
                    pratoPric = "Peixe";
                    calpratopric = 230;
                    break;
                case 3:
                    pratoPric = "Frango";
                    calpratopric = 250;
                    break;
                case 4:
                    pratoPric = "Carne";
                    calpratopric = 350;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "A opção escolhida é incorreta");
                    System.exit(0);
                    break;

            }
            sobremesa = JOptionPane.showInputDialog(null, "Opoções de sobremesa são de:\n 1 - Abacaxi\n 2 - Sorvete Diet\n 3 - Mouse Diet\n 4 - Mouse chocolate");
            escolha2 = Integer.parseInt(sobremesa);

            switch (escolha2) {
                case 1:
                    sobremesa2 = "Abacaxi";
                    calsobremesa = 75;
                    break;
                case 2:
                    sobremesa2 = "Sorvete Diet";
                    calsobremesa = 110;
                    break;
                case 3:
                    sobremesa2 = "Mouse Diet";
                    calsobremesa = 170;
                    break;
                case 4:
                    sobremesa2 = "Mouse chocolate";
                    calsobremesa = 200;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "A opção escolhida é incorreta");
                    System.exit(0);
                    break;

            }
            bebida = JOptionPane.showInputDialog(null, "Opções de bebidas são de:\n 1 - Chá\n 2 - Suco de laranja Diet\n 3 - Suco de melão\n 4 - Refrigerante Diet");
            escolha3 = Integer.parseInt(bebida);

            switch (escolha3) {
                case 1:
                    bebida2 = "Chá";
                    calbebida = 20;
                    break;
                case 2:
                    bebida2 = "Suco de laranja";
                    calbebida = 70;
                    break;
                case 3:
                    bebida2 = "Suco de melão";
                    calbebida = 100;
                    break;
                case 4:
                    bebida2 = "Refrigerante Diet";
                    calbebida = 65;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "A opção escolhida é incorreta");
                    System.exit(0);
                    break;

            }

            calorias = calpratopric + calsobremesa + calbebida;

            JOptionPane.showMessageDialog(null, "As opções escolhidas são\nPrato principal: " + pratoPric + "\nSobremesa: " + sobremesa2 + "\nBebida: " + bebida2+ "\nClique em ok para ver o total de calorias"
                    + "");
            JOptionPane.showMessageDialog(null, "O total de calorias dos pratos é: " + calorias);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
        }
    }

}
