
// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
import java.util.ArrayList;
import java.util.Arrays;

public class MenuPizza { // Principal função do sistema, controla a maioria das funcionalidades

	// ATRIBUTOS
	private int idPizza;
	private String showSabor;
	private int intTamPizza;
	private int valorPizza;
	private String tamPizza;
	private int borda;
	private String bordaS;
	static int qtClientes;
	static int qtMenu;
	private int taxa;
	private String taxaS;

	ArrayList<MenuPizza> menupizzas = new ArrayList<MenuPizza>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	// CONSTRUTORES
	MenuPizza(int idPizza, String showSabor, int intTamPizza, int valorPizza, String tamPizza, int borda, String bordaS,
			int taxa, String taxaS) {
		this.setIdPizza(idPizza);
		this.setIntTamPizza(intTamPizza);
		this.setValorPizza(valorPizza);
		this.setTamPizza(tamPizza);
		this.setBorda(borda);
		this.setBordaS(bordaS);
		this.setTaxa(taxa);
		this.setTaxaS(taxaS);
		this.setShowSabor(showSabor);
		Util.criarClientes(clientes);
	}

	// GETTING, SETTING E VALIDAÇÃO

	public int getIdPizza() {
		return idPizza;
	}

	public String getShowSabor() {
		return showSabor;
	}

	public void setShowSabor(String showSabor) {
		this.showSabor = showSabor;
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}

	public String getTaxaS() {
		return taxaS;
	}

	public void setTaxaS(String taxaS) {
		this.taxaS = taxaS;
	}

	public int getBorda() {
		return borda;
	}

	public void setBorda(int borda) {
		this.borda = borda;
	}

	public String getBordaS() {
		return bordaS;
	}

	public void setBordaS(String bordaS) {
		this.bordaS = bordaS;
	}

	public int getValorPizza() {
		return valorPizza;
	}

	public void setValorPizza(int valorPizza) {
		this.valorPizza = valorPizza;
	}

	public String getTamPizza() {
		return tamPizza;
	}

	public void setTamPizza(String tamPizza) {
		this.tamPizza = tamPizza;
	}

	public int getIntTamPizza() {
		return intTamPizza;
	}

	public int setIdPizza(int idPizza) {
		if (idPizza >= 1 & idPizza <= 35) {
			return this.idPizza = idPizza;
		} else {
			throw new IllegalArgumentException("[ID DA PIZZA]: Valor inválido.");
		}
	}

	public int setIntTamPizza(int intTamPizza) {
		if (intTamPizza >= 1 & intTamPizza <= 3) {
			return this.intTamPizza = intTamPizza;
		} else {
			throw new IllegalArgumentException("[TAMANHO DA PIZZA]: Valor inválido.");
		}
	}

	public String toString() {
		return "PIZZA SABOR: " + getShowSabor() + "\nID: " + getIdPizza() + "\nBORDA: " + getBordaS()
				+ "\nTAMANHO DA PIZZA: " + getTamPizza() + "\nOBS: " + getTaxaS() + "\n PREÇO TOTAL: R$"
				+ getValorPizza() + ".00\n\n" + Arrays.toString(clientes.toArray()) + "\n";
	}
}