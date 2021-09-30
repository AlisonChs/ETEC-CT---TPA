public class contaCorrente extends conta implements tributacao {
	
	public contaCorrente(int numero, int agencia, String titular) {
		super(numero, agencia, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar (double valor) {
		setSaldo((getSaldo() - valor) - 5);
	}
	
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
		System.out.println("Informação adicional:  Na conta corrente, há uma taxa de 5 reais para realizar um saque.");
		System.out.println();
		System.out.println("------------------------------");

	}

	@Override
	public double calculaImposto() {
		return getSaldo() * 0.02;
	}
	
}
