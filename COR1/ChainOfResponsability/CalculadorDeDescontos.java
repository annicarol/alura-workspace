public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoMais5Itens();
		Desconto d2 = new DescontoMaior500Reais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemProximo();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		return d1.desconta(orcamento);
	}
}