import javax.swing.*;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Cantina {

    public static void main(String[] args) {
        Massa massa = new Massa();
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();


        String cliente1 = JOptionPane.showInputDialog(null, "Informe o nome do cliente \n", "Cliente", JOptionPane.PLAIN_MESSAGE);
        Cliente cliente = new Cliente(cliente1);
        String massa1 = JOptionPane.showInputDialog(null, "Informe o nome da massa: \n", "Massa", JOptionPane.PLAIN_MESSAGE);
        massa.setTipo(massa1);
        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor: \n","Valor da massa ", JOptionPane.PLAIN_MESSAGE));
        massa.setValor(valor);
        // acresicmo.number.5 = exit
        //acrescimo.number 1 = bacon
        // acrescimo.number 2 = mussarela
        int escolha = 0;

        while (escolha != 5) {
            String acrescimo = JOptionPane.showInputDialog(null, "Escolha o Ingrediente:\n\n1-Bacon \n2-Mussarela \n3-Tomate \n4-Queijo \n5-SAIR", "ACRÉSCIMO ", JOptionPane.PLAIN_MESSAGE);
            escolha = Integer.parseInt(acrescimo);
            if (escolha == 1)
                ingredientes.add(new Ingrediente("Bacon"));
            else if (escolha == 2)
                ingredientes.add(new Ingrediente("Mussarela"));
            else if (escolha == 3)
                ingredientes.add(new Ingrediente("Tomate"));
            else if(escolha == 4)
                ingredientes.add(new Ingrediente("Queijo"));

        }


        Pedido pedido = new Pedido(cliente,massa,ingredientes);

        String txt = "Pedido feito para " + pedido.getCliente().getNome()+ "\n" +
                pedido.getMassa().getTipo();

        for(int i = 0; i<pedido.getIngredientes().size(); i++){
            txt += " com " + pedido.getIngredientes().get(i).getNome();
            if(i<pedido.getIngredientes().size()-1)
                txt += " e ";
        }

        txt += "\nvalor: " + pedido.calcula();
        JOptionPane.showMessageDialog(null, txt);
    }

}





