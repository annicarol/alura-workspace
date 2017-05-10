
public class TestaImposto {
	
	public static void main(String[] args) {
		
        Orcamento orcamento = new Orcamento(700.0);
        orcamento.adicionaItem(new Item("CANETA", 101.0));
        orcamento.adicionaItem(new Item("LAPIS", 101.0));
        
        IKCV imposto1 = new IKCV();
        
        double desconto1 = imposto1.calcula(orcamento);
        
        ICPP imposto2 = new ICPP();
        
        double desconto2 = imposto2.calcula(orcamento);
        
        System.out.println("IKCV =" + desconto1 + "\nICPP = " + desconto2);
		
	}

}
