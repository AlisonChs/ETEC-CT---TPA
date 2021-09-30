import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Variáveis temporárias para uso de testes didáticos
		
		int numero, agencia;
		String titular;
		double credito, depositoInicial, saqueInicial;
		char escolhaConta, escolhaExecuta;
		
		// Realiza o teste para continuar ou interroper o programa
		
		System.out.println("Deseja testar as contas? Aperte S para sim ou aperte qualquer outra letra para parar o programa.");
		
		escolhaExecuta = sc.next().charAt(0);
		
		breakLine(2);
		
		while (escolhaExecuta == 's' || escolhaExecuta == 'S') {
		
			// Para testar a classe desejada, escolha
			
			System.out.println("Para testar a conta corrente, aperte C + enter.");
			System.out.println("Para testar a conta poupança, aperte P + enter.");
			System.out.println("Para testar a conta premium, aperte a tecla '+' e depois enter.");
			
			breakLine(2);
			
			escolhaConta = sc.next().charAt(0);
			
			// Testes da conta corrente
			
			if (escolhaConta == 'C' || escolhaConta == 'c') {
			
				System.out.println("Olá! Vamos abrir uma conta corrente?");
				
				breakLine(2);
				
				System.out.print("Insira o número da sua conta: ");
				numero = sc.nextInt();
				
				System.out.print("Insira o número da sua agência: ");
				agencia = sc.nextInt();
				
				System.out.print("Insira seu nome: ");
				titular = sc.next();
						
				contaCorrente c1 = new contaCorrente(numero, agencia, titular);
				
				c1.infoConta();
				
				breakLine(2);
				
				System.out.println("Insira um depósito inicial: ");
				
				depositoInicial = sc.nextDouble();
				
				while (1 > depositoInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					depositoInicial = sc.nextDouble();
				}
				
				c1.depositar(depositoInicial);
				
				breakLine(2);
				
				System.out.println("Sucesso! Informações atualizadas:");
				
				c1.infoConta();
				
				breakLine(2);
				
				System.out.println("Insira um saque inicial: ");
				
				saqueInicial = sc.nextDouble();
				
				breakLine(2);
				
				while (1 > saqueInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					saqueInicial = sc.nextDouble();
				}
				
				c1.sacar(saqueInicial);
				
				System.out.println("Sucesso! Informações atualizadas:");
				
				breakLine(2);
				
				c1.infoConta();

			
			}
			
			
			// Testes da conta poupança
			
			else if (escolhaConta == 'P' || escolhaConta == 'p') {
				
				breakLine(2);
	
				System.out.println("Olá! Vamos abrir uma conta poupança?");
				
				breakLine(2);
				
				System.out.print("Insira o número da sua conta: ");
				numero = sc.nextInt();
				
				System.out.print("Insira o número da sua agência: ");
				agencia = sc.nextInt();
				
				System.out.print("Insira seu nome: ");
				titular = sc.next();
						
				contaPoupanca p1 = new contaPoupanca(numero, agencia, titular);
				
				breakLine(2);
				
				p1.infoConta();
				
				breakLine(2);
				
				System.out.println("Insira um depósito inicial: ");
				
				depositoInicial = sc.nextDouble();
				
				while (1 > depositoInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					depositoInicial = sc.nextDouble();
				}
				
				breakLine(2);
				
				p1.depositar(depositoInicial);
				
				System.out.println("Sucesso! Informações atualizadas:");
				
				breakLine(2);
				
				p1.infoConta();
				
				breakLine(2);
				
				System.out.println("Insira um saque inicial: ");
				
				saqueInicial = sc.nextDouble();
				
				while (1 > saqueInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					saqueInicial = sc.nextDouble();
				}
				
				p1.sacar(saqueInicial);
				
				breakLine(2);
				
				System.out.println("Sucesso! Informações atualizadas:");
				
				breakLine(2);
				
				p1.infoConta();
			
			}
			
			// Testes da conta premium
			
			else if (escolhaConta == '+') {
				
				breakLine(2);
			
				System.out.println("Olá! Vamos abrir uma conta premium?");
				
				breakLine(2);
				
				System.out.print("Insira o número da sua conta: ");
				numero = sc.nextInt();
				
				System.out.print("Insira o número da sua agência: ");
				agencia = sc.nextInt();
				
				System.out.print("Insira seu nome: ");
				titular = sc.next();
				
				System.out.print("Escolha um limite de crédito: ");
				credito = sc.nextDouble();
						
				contaPremium pp1 = new contaPremium(numero, agencia, titular);
				
				while (credito < 1 || credito > 10000) {
					System.out.println("Escolha um limite maior que / igual a 1 e menor que / igual a 10000.");
					credito = sc.nextDouble();
				}
				
				pp1.setCredito(credito);
				
				pp1.infoConta();
				
				System.out.println("Insira um depósito inicial: ");
				
				depositoInicial = sc.nextDouble();
				
				while (1 > depositoInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					depositoInicial = sc.nextDouble();
				}
				
				pp1.depositar(depositoInicial);
				
				breakLine(2);
				
				System.out.println("Sucesso! Informações atualizadas:");
				
				breakLine(2);
				
				pp1.infoConta();
				
				System.out.println("Insira um saque inicial: ");
				
				saqueInicial = sc.nextDouble();
				
				while (1 > saqueInicial) {
					System.out.println("Insira um valor maior que ou igual a 1.");
					saqueInicial = sc.nextDouble();
				}
				
				pp1.sacar(saqueInicial);
				
				breakLine(2);
				
				System.out.println("Sucesso! Informações atualizadas:");
								
				pp1.infoConta();
			
			}
			
			else {
				
				System.out.println("Por favor, coloque uma letra válida!");
				
			}
			
			breakLine(3);
			
			System.out.println("Deseja continuar/Testar outras contas? S para SIM e N para NÃO");
			
			escolhaExecuta = sc.next().charAt(0);
			
			breakLine(3);
			
		}
		
				
		sc.close();

	}
	
	// Função básica (e temporária) para pular as linhas.
	
	public static void breakLine (int quantity) {
		for (int i = 1; quantity>i; i++) {
			System.out.println();
		}
	}

}


