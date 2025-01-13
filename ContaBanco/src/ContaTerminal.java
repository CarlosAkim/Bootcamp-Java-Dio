import java.util.Scanner ;

public class ContaTerminal {
	public static void main(String[] args){
		ContaUsuario cliente = new ContaUsuario();
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("Digite o nome do Cliente: ");
			cliente.setCliente(scanner.nextLine());	
			
			System.out.println("Digite a agencia (formato 123-4): ");
			cliente.setAgencia(scanner.nextLine());
			
			//Garantia que não seja adicionado nem um valor além do INT
			while(true) {
				try{
					System.out.println("Digite o numero da conta: ");
					cliente.setNumero(scanner.nextInt());
					break;
				}catch (Exception e) {
					System.out.println("Entrada invalida ");
					scanner.nextLine();
				}
			}
			
			//Garantia que não seja adicionado um outro valor além do double
			while(true) {
				try {
					System.out.println("Digite o saldo que gostaria de depositar: ");
					cliente.setSaldo(scanner.nextDouble());
					break;
				}catch (Exception e){
					System.out.println("Entrada invalida ");
					scanner.nextLine();
				}
			}
			
			
		}catch (Exception e) {
			System.out.println("Erro :" + e.getMessage());
		}finally {
			scanner.close();
		}
		
		System.out.println("Olá cliente " + cliente.getCliente() + " obrigado por criar uma conta em nosso "
				+ "banco, sua agencia é " + cliente.getAgencia() + " conta " + cliente.getNumero() + " e seu saldo "
				+ cliente.getSaldo() + " está disponivel para saque");
		
		
	}
}
