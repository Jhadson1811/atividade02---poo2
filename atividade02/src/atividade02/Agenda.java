package atividade02;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Pessoa> listaPessoas;
	private int quantidadePessoas;
	private int limitePessoas;
	
	public Agenda(List<Pessoa> listaPessoas, int limitePessoas) {
		this.listaPessoas = new ArrayList<>(limitePessoas);
		this.quantidadePessoas = 0;
		this.limitePessoas = limitePessoas;
	} 
	
	public void armazenaPessoa(String nome, int idade, float altura) {
		
		Pessoa p = new Pessoa(nome, idade , altura);
		
		if(listaPessoas.size() < limitePessoas) {
			listaPessoas.add(p);
			quantidadePessoas ++;
			System.out.println("Pessoa inserida com sucesso! ");
		} else {
			System.out.println("Limite de pessoas atingida! Pessoa não inserida");
		}
	}
	
	public void removePessoa(String nome) {
		
		int posicaoPessoa = buscaPessoa(nome);
		
		Pessoa p1 = listaPessoas.get(posicaoPessoa);
		
		if(listaPessoas.remove(p1)) {
			quantidadePessoas--;
			System.out.println("Pessoa da posicao " + posicaoPessoa 
			+ " Removida com sucesso" ); 
		} else {
			System.out.println("Pessoa não removida, o nome não foi encontrado");
		}
	}
	
	public int buscaPessoa(String nome) {
		int posicao = -1;
		
		for(int i = 0; i< listaPessoas.size(); i++) {
			
			Pessoa p1 = listaPessoas.get(i);
			
			if(p1.getNome().equals(nome)) {
				return posicao = listaPessoas.indexOf(p1);
			}
		}
		return posicao;
	}
	
	public void imprimiAgenda() {
		for(int i=0; i<listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).toString());
		}
	}
	
	public void imprimePessoa(int posicao) {
		
		if(posicao >= 0 && posicao < listaPessoas.size()) {
			Pessoa p1 = listaPessoas.get(posicao);
			System.out.println(p1.toString());
		} else {
			System.out.println("Posicao não encontrada");
		}
	}
	

}
