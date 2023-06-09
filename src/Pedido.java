import com.sun.security.ntlm.Client;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private Massa massa;
    private List <Ingrediente>ingredientes;

    private double total;

   // public int escolha() {
        //return escolha(getIngredientes();

   // }
    public double calcula(){
        return total = massa.getValor() + (ingredientes.size()*2);

    }

    public Pedido(Cliente cliente, Massa massa, List<Ingrediente> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
