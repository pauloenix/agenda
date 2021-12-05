package agenda;

import java.util.ArrayList;

public class Contato {
	private String Nome;
	private int Idade;
	private String Sexo;
	private int foneCelular;
	private String email;
	private int cep;
	
	public static int DDI = 55;

	public Contato(String nome, int idade, String sexo, int foneCelular, String email, int cep) {
		Nome = nome;
		Idade = idade;
		Sexo = sexo;
		this.foneCelular = foneCelular;
		this.email = email;
		this.cep = cep;
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

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public int getFoneCelular() {
		return foneCelular;
	}

	public void setFoneCelular(int foneCelular) {
		this.foneCelular = foneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}


	@Override
	public String toString() {
		return "Contato [Nome=" + Nome + ", Idade=" + Idade + ", Sexo=" + Sexo + ", foneCelular=" + foneCelular
				+ ", email=" + Utils.imprimeTelefone(foneCelular) +  email + ", cep=" + Utils.imprimeCEP(cep)+ "]";
	}
	
	

}
	