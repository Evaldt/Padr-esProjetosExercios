import java.util.List;

public class ConjuntoProd implements Produto{
    private int id;
    private String nome;
    private double desconto;
    private List<Produto> lista;

    public ConjuntoProd(int id, String nome, double desconto, List<Produto> lista) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.lista = lista;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // soma o preco dos filhos (que podem ser kits tambem) e aplica o desconto da oferta
    public double getPreco() {
        double total = 0.0;
        for (Produto item : lista) {
            total += item.getPreco();
        }
        return total * (1 - desconto);
    }

    public String getProdutos(){
        StringBuilder produtos = new StringBuilder();
        for (Produto item : lista) {
            produtos.append(item.toString());
        }
        return produtos.toString();
    }
}

