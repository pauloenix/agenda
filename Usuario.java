package agenda;

import java.util.ArrayList;

public class Usuario {
	
	//Atributos
	private String Nome;
	private int Idade;
	private int CPF;
	private ArrayList<Contato> contatos;
	
	
	public Usuario(String nome, int idade, int cPF, ArrayList<Contato> contatos) {
		Nome = nome;
		Idade = idade;
		CPF = cPF;
		this.contatos = contatos;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
		
}
	

