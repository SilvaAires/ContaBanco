import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Por favor, digite o número da Agência !" );
		int numero = e.nextInt();
		e = new Scanner(System.in);
		System.out.println("Por favor, digite a Agência !" );
		String agencia = e.nextLine();
		e = new Scanner(System.in);
		System.out.println("Por favor, digite o seu nome !" );
		String nome = e.nextLine();
		System.out.println("Por favor, digite o seu saldo/saque !" );
		e = new Scanner(System.in);
		double saldo = e.nextDouble();
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" "
				+ "já está disponível para saque");
	}
}
