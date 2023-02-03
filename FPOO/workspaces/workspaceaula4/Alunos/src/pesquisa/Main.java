package pesquisa;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		int contcrianca = 0,contjovem = 0,contadulto = 0,contidoso = 0,contidade=0,idadec = 0,idadej = 0,idadea = 0,idadei = 0;

		System.out.println("Digite quantas pessoas estão interessadas no curso:");
		int n = scan.nextInt();
		System.out.println("Digite nome, sobrenome e idade das pessoas que deseja cadastrar");
		for(int i=0;i<n;i++) {
			pessoas.add(new Pessoa(scan.next(),scan.next(),scan.nextInt()));
			if (pessoas.get(i).faseDaVida() == "Criança"){
				contcrianca++;
				idadec += pessoas.get(i).idade;
			}else if (pessoas.get(i).faseDaVida() == "Jovem") {
				contjovem++;
				idadej += pessoas.get(i).idade;
			}else if (pessoas.get(i).faseDaVida() == "Adulto") {
				contadulto++;
				idadea += pessoas.get(i).idade;
			}else if (pessoas.get(i).faseDaVida() == "Idoso") {
				contidoso++;
				idadei += pessoas.get(i).idade;
			}
			
			contidade += pessoas.get(i).idade;
		}
		float mediaidade = contidade/n;
		float mediac = idadec/contcrianca;
		float mediaj = idadej/contjovem;
		float mediaa = idadea/contadulto;
		float mediai = idadei/contidoso;
		
		
		System.out.println(pessoas.toString());
		System.out.println("Estatísticas");
		System.out.printf("[Crianca]\t%d\n[Jovem]\t\t%d\n[Adulto]\t%d\n[Idoso]\t\t%d\n",contcrianca,contjovem,contadulto,contidoso);
		System.out.printf("\nMedia de idade\t%.1f\nCrianca\t%.1f\nJovem\t%.1f\nAdulto\t%.1f\nIdoso\t%.1f",mediaidade,mediac,mediaj,mediaa,mediai);
	}	
}