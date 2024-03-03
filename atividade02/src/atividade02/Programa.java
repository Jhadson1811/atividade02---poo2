package atividade02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	private static Scanner scanner = new Scanner(System.in);
	private static List<Pessoa> listaPessoas = new ArrayList<>();
	private static Agenda a1 = new Agenda(listaPessoas, 5);
	
	public static void main(String[] args) {

		int opcao; 
		
		do {
			
			System.out.println("Menu: ");
			System.out.println(" 1 - Cadastrar Pessoa: ");
			System.out.println(" 2 - Remover Pessoa: ");
			System.out.println(" 3 - Buscar Pessoa: ");
			System.out.println(" 4 - Imprimir Pessoa: ");
			System.out.println(" 5 - Imprimir Agenda: ");
			System.out.println(" 6 - Encerrar: ");
			System.out.println("Escolha uma opcao: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcao) {
			case 1: 
				cadastraPessoa();
				break;
			case 2:
				removePessoa();
				break;
			case 3:
				buscaPessoa();
				break;
			case 4:
				imprimiPessoa();
				break;
			case 5:
				imprimiAgenda();
				break;
			case 6:
				System.out.println("Fechando programa...");
				break;
			default:
				System.out.println("Opcao invalida! Digite uma opção novamente");
		}
		
		} while (opcao != 6);
		
	}
	
	private static void cadastraPessoa() {
		System.out.println("Digite o nome da pessoa");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a idade da pessoa");
		int idade = scanner.nextInt();
		
		System.out.println("Digite a altura da pessoa");
		Float altura = scanner.nextFloat();
		
		a1.armazenaPessoa(nome, idade, altura);
	}
	
	private static void removePessoa() {
		System.out.println("Digite o nome da pessoa");
		String nome = scanner.nextLine();
		
		a1.removePessoa(nome);
	}
	
	private static void buscaPessoa() {
		System.out.println("Digite o nome da pessoa");
		String nome = scanner.nextLine();
		
		int posicao = a1.buscaPessoa(nome);
		System.out.println("Pessoa encontrada na posicao: " + 
		posicao);
		a1.imprimePessoa(posicao);
	}
	
	private static void imprimiPessoa() {
		System.out.println("Digite a posicao da pessoa para imprimir");
		int posicao = scanner.nextInt();
		
		a1.imprimePessoa(posicao);
	}
	
	private static void imprimiAgenda() {
		a1.imprimiAgenda();
	}
	

}
