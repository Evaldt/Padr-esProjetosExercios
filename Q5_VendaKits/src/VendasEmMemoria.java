import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<Produto> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		produtos.add(new UnitarioProd(1, "Caneta", 1.55));
		produtos.add(new UnitarioProd(2, "Borracha", 1.15));
		produtos.add(new UnitarioProd(3, "Caderno", 32.99));
		produtos.add(new ConjuntoProd(4, "Kit Escolar", 0.10,
				List.of(produtos.get(0), produtos.get(1), produtos.get(2))));
	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		Produto prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<Produto> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}
