
public class GeradorDeContas {

	public void gerarDocumento(Requisicao req, Conta conta) {

//		Resposta r1 = new DocumentoXML();
//		Resposta r2 = new DocumentoCSV();
//		Resposta r3 = new DocumentoPorcento();
//		
//		r1.setProxima(r2);
//		r2.setProxima(r3);
		
		Resposta r = new DocumentoXML(new DocumentoCSV(new DocumentoPorcento(new SemFormato())));
		
		r.responde(req, conta);
		
	}
	
}
