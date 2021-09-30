
public class contaPremium extends conta implements tributacao {
	
	// Additional attribute
	
	public contaPremium(int numero, int agencia, String titular) {
		super(numero, agencia, titular);
	}

	private double credito;
	
	// Getters and Setters 

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	// Methods
	
	@Override
	public void infoConta () {
		System.out.println();
		System.out.println("Atenção! Informações CONFIDENCIAIS abaixo.");
		System.out.println();
		System.out.println("Número da conta: " + getNumero());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Titular da conta: " + getTitular());
		System.out.println();
		System.out.println("Informação adicional:  Na conta premium, você tem a opção de utilizar crédito.");
		System.out.println();
		System.out.println("Crédito: " + getCredito());
		System.out.println();
		System.out.println("------------------------------");
	}
	
	@Override
	public double calculaImposto() {
		return getSaldo() * 0.01;
	}

}
