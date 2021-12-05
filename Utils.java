package agenda;

public class Utils {
	// formata CPF;
	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	// Formata CEP;
	public static String imprimeCEP(String CEP) {
		return (CEP.substring(0, 5) + "-" + CEP.substring(5, 8));

	}

	// Formata Telefone;
	public static String imprimeTelefone(String TELEFONE) {
		return Contato.DDI + (TELEFONE.substring(0, 0) + " (" + TELEFONE.substring(0, 2) + ") "
				+ TELEFONE.substring(2, 3) + " " + TELEFONE.substring(3, 7) + "-" + TELEFONE.substring(7, 11));
	}
}



