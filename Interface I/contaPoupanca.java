
public class contaPoupanca extends conta {
	
	public contaPoupanca(int numero, int agencia, String titular) {
		super(numero, agencia, titular);
		// TODO Auto-generated constructor stub
	}

	public void rendimentoPoupanca () {
		
		/* Na linha abaixo (linha 8) eu coloquei 0.005 para representar 0,5% do valor, pois no enunciado, pede-se 
	 	"meio %" mas eu não tenho certeza de como o(a) professor(a) quis se expressar (se era 50%, 5% ou 0,5%) */
		
		setSaldo(getSaldo() * 0.005);
	}

}
