import javax.swing.*;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Cantina {

    public static void main(String[] args) {
        int escolha = 0;
        Massa massa = new Massa();
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();


        String cliente1 = JOptionPane.showInputDialog(null, "Informe o nome do cliente \n", "Cliente", JOptionPane.PLAIN_MESSAGE);
        Cliente cliente = new Cliente(cliente1);
        String massa1 = JOptionPane.showInputDialog(null, "Informe o nome da massa: \n", "Massa", JOptionPane.PLAIN_MESSAGE);
        massa.setTipo(massa1);
        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor: \n", "Valor da massa ", JOptionPane.PLAIN_MESSAGE));
        massa.setValor(valor);


        //int escolha = 0;
        //int escolha ;

        //try{
        //int escolha <1>5
        //int
        //}
        //catch(Exception e ){
        //System.out.println("Escolha uma das opções de 1 a 5 ");
        //}


        while (escolha != 5) {
            try {
                String acrescimo = JOptionPane.showInputDialog(null, "Escolha o Ingrediente:\n\n1-Bacon \n2-Mussarela \n3-Tomate \n4-Queijo \n5-SAIR", "ACRÉSCIMO ", JOptionPane.PLAIN_MESSAGE);
                escolha = Integer.parseInt(acrescimo);
                if (escolha == 1)
                    ingredientes.add(new Ingrediente("Bacon"));
                else if (escolha == 2)
                    ingredientes.add(new Ingrediente("Mussarela"));
                else if (escolha == 3)
                    ingredientes.add(new Ingrediente("Tomate"));
                else if (escolha == 4)
                    ingredientes.add(new Ingrediente("Queijo"));


                else if(escolha >5)
                    throw new Exception("Escolha uma das opções de 1 a 5 ");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
                //System.out.println("Escolha uma das opções de 1 a 5 ");
            }

            Pedido pedido = new Pedido(cliente, massa, ingredientes);

            String txt = "Pedido feito para " + pedido.getCliente().getNome() + "\n" +
                    pedido.getMassa().getTipo();

            for (int i = 0; i < pedido.getIngredientes().size(); i++) {
                txt += " com " + pedido.getIngredientes().get(i).getNome();
                if (i < pedido.getIngredientes().size() - 1)
                    txt += " e ";
            }

            txt += "\nvalor: " + pedido.calcula();
            JOptionPane.showMessageDialog(null, txt);
        }

    }
}





