
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
		System.out.println("Aten��o! Informa��es CONFIDENCIAIS abaixo.");
		System.out.println();
		System.out.println("N�mero da conta: " + getNumero());
		System.out.println("Ag�ncia: " + getAgencia());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Titular da conta: " + getTitular());
		System.out.println();
		System.out.println("Informa��o adicional:  Na conta premium, voc� tem a op��o de utilizar cr�dito.");
		System.out.println();
		System.out.println("Cr�dito: " + getCredito());
		System.out.println();
		System.out.println("------------------------------");
	}
	
	@Override
	public double calculaImposto() {
		return getSaldo() * 0.01;
	}

}
