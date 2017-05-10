
public class DocumentoCSV implements Resposta {
	
	DocumentoCSV(Resposta proxima) {
		this.proxima = proxima;
	}

	private Resposta proxima;

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getNomeTitular() + ";" + conta.getSaldo());
		} else {
			proxima.responde(req, conta);
		}
	}

//	public void setProxima(Resposta proxima) {
//		this.proxima = proxima;
//	}

}
