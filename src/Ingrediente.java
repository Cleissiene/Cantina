public class Ingrediente {

    private String nome;

    private final Double PRECO = 2.00;
    private  double valor;

    public Ingrediente(String nome) {
        this.nome = nome;
        this.valor = PRECO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
