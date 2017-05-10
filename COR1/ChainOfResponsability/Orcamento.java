import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	
	private List<Item> itens = new ArrayList<>();

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);		
	}

}