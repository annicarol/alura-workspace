
public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return false;
//		return orcamento.getItens().stream().collect(item -> item.get/d/e	)
//		Map<String, Long> counts = orcamento.stream().collect(
//			    Collectors.groupingBy(Item::getName, LinkedHashMap::new, Collectors.counting()));				
	}

}
