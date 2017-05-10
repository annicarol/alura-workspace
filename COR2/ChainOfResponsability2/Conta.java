
public class Conta {

	private String titular;
	private Double saldo;

	
	public Conta (String nomeTitular, Double saldo) {
		super();
		this.saldo = saldo;
		this.titular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getNomeTitular() {
		return titular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.titular = nomeTitular;
	}
	
	
}
