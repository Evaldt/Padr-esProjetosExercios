public class UnitarioProd implements Produto {
    private int id;
    private String nome;
    private double preco;

    public UnitarioProd(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "ID: "+getId() + ", Nome: " + getNome() + ", Preço: " + getPreco()+".";
    }

}
