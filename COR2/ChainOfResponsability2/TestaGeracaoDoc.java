
public class TestaGeracaoDoc {
	
	public static void main(String[] args) {
		
		GeradorDeContas gerador = new GeradorDeContas();
		
		Conta conta = new Conta("John Snow", 100.0);

		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		gerador.gerarDocumento(req,conta);
	}

}
