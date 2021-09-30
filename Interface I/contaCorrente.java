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
		System.out.println("Aten��o! Informa��es CONFIDENCIAIS abaixo.");
		System.out.println();
		System.out.println("N�mero da conta: " + getNumero());
		System.out.println("Ag�ncia: " + getAgencia());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Titular da conta: " + getTitular());
		System.out.println();
		System.out.println("Informa��o adicional:  Na conta corrente, h� uma taxa de 5 reais para realizar um saque.");
		System.out.println();
		System.out.println("------------------------------");

	}

	@Override
	public double calculaImposto() {
		return getSaldo() * 0.02;
	}
	
}
