import java.util.List;

public class Pedido {

    private String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private String massa;

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    private List <Ingrediente>ingredientes;

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void calcula() {
        //return

    }


}
