
public abstract class conta {
	
	// Attributes
	
	private int numero;
	private int agencia;
	private double saldo;
	private String titular;
	
	// General constructor
	
	public conta(int numero, int agencia, String titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}
	
	// Getters and Setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	// Methods
	
	public void sacar (double valor) {
		setSaldo(getSaldo() - valor);
	}
	
	public void depositar (double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void infoConta () {
		System.out.println();
		System.out.println("Atenção! Informações CONFIDENCIAIS abaixo.");
		System.out.println();
		System.out.println("Número da conta: " + getNumero());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Titular da conta: " + getTitular());

	}

}
