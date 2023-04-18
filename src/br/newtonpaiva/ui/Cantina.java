package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Ingrediente;
import br.newtonpaiva.dominio.Massa;
import br.newtonpaiva.dominio.Pedido;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cantina {
    public static void main(String[] args) {

        try {

            String nomeC = "" , nomeM = "";
            double valorM = 0.0;
            int opcao = 0;


            nomeC = JOptionPane.showInputDialog("Informe o nome do cliente: ");
            if (nomeC.matches(".*\\d.*")){
                throw new Exception("Contém números, digite apenas letras");
            }
            nomeM = JOptionPane.showInputDialog("Informe o nome da massa: ");
            if (nomeM.matches(".*\\d.*")){
                throw new Exception("Contém números, digite apenas letras");
            }
            valorM = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa: "));

            Cliente c1 = new Cliente();
            Massa m1 = new Massa();
            m1.setTipoMassa(nomeM);
            m1.setValorMassa(valorM);
            Pedido p1 = new Pedido();
            p1.setLista(new ArrayList<>());

            while (opcao != 5) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingrediente escolhidos:\n1- Bacon\n2- Mussarela\n3- Tomate\n4- Queijo\n5- Sair"));
                switch (opcao) {
                    case 1:
                        Ingrediente i = new Ingrediente();
                        i.setNomeIngrediente("Bacon");
                        p1.getLista().add(i);
                        break;
                    case 2:
                        i = new Ingrediente();
                        i.setNomeIngrediente("Mussarela");
                        p1.getLista().add(i);
                        break;
                    case 3:
                        i = new Ingrediente();
                        i.setNomeIngrediente("Tomate");
                        p1.getLista().add(i);
                        break;
                    case 4:
                        i = new Ingrediente();
                        i.setNomeIngrediente("Queijo");
                        p1.getLista().add(i);
                        break;
                }
            }
            String mensagem = "";
            int posicao = 0;

            for (Ingrediente item : p1.getLista()) {
                if (posicao == p1.getLista().size() - 2) {
                    mensagem += item.getNomeIngrediente() + " e ";
                } else if (posicao == p1.getLista().size() - 1) {
                    mensagem += item.getNomeIngrediente() + ".";
                } else {
                    mensagem += item.getNomeIngrediente() + ", ";
                }
                posicao++;
            }
            p1.calculaValor(m1, 2.0);
            JOptionPane.showMessageDialog(null, "O pedido feito para " + c1.getNomeCliente() + "\n" + m1.getTipoMassa() + " com " + mensagem + "\nValor:  " + p1.getValorTotal(), "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Contém letras, digite apenas números");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
