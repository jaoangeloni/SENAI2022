import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		String nome;
		Scanner scan = new Scanner(System.in);

		public for (int i = 0; i < 2; i++) {
			System.out.println("Digite o número de seu candidato");
			numero = scan.nextInt();
			System.out.printf("Você tem certeza do seu voto?\n1.Sim\n2.Não\n");
			int confirma = scan.nextInt();
			if (confirma == 2)
				i--;
			else
				break;
			}

			if (numero == 13)
				nome = "lula";
			else if (numero == 22)
				nome = "bolsonaro";
			else if (numero == 0)
				nome = "branco";
			else
				nome = "nulo";

			String saida = String.format("Candidato %s\t%d", nome, numero);
			System.out.println(saida);
	}

}
