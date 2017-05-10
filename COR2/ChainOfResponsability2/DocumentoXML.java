
public class DocumentoXML implements Resposta {
	
	DocumentoXML(Resposta proxima) {
		this.proxima = proxima;
	}	
	
	private Resposta proxima;
	
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getNomeTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			proxima.responde(req, conta);
		}
	}
	
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;
	}

}
