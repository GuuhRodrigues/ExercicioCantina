package br.newtonpaiva;

import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Ingrediente;
import br.newtonpaiva.dominio.Massa;
import br.newtonpaiva.dominio.Pedido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cantina {
    public static void main(String[] args) {

        String nomeC, nomeM;
        double valorM;
        int opcao = 0;


        nomeC = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        nomeM = JOptionPane.showInputDialog("Informe o nome da massa: ");
        valorM = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa: "));

        Cliente c1 = new Cliente();
        c1.setNomeCliente(nomeC);
        Massa m1 = new Massa();
        m1.setTipoMassa(nomeM);
        m1.setValorMassa(valorM);
        Pedido p1 = new Pedido();
        p1.setLista(new ArrayList<Ingrediente>());

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingrediente escolhidos:\n1- Bacon\n2- Mussarela\n3- Tomate\n4- Queijo\n5- Sair"));
            switch (opcao){
                case 1:
                    Ingrediente i1 = new Ingrediente();
                    i1.setNomeIngrediente("Bacon");
                    p1.getLista().add(i1);
                    break;
                case 2:
                    Ingrediente i2 = new Ingrediente();
                    i2.setNomeIngrediente("Mussarela");
                    p1.getLista().add(i2);
                    break;
                case 3:
                    Ingrediente i3 = new Ingrediente();
                    i3.setNomeIngrediente("Tomate");
                    p1.getLista().add(i3);
                    break;
                case 4:
                    Ingrediente i4 = new Ingrediente();
                    i4.setNomeIngrediente("Queijo");
                    p1.getLista().add(i4);
                    break;
            }
        }
        p1.calculaValor();

        JOptionPane.showMessageDialog(null, "O pedido feito para " + c1.getNomeCliente());
        JOptionPane.showMessageDialog(null, m1.getTipoMassa());
        System.out.println(p1);





    }
}