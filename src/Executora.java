// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
public class Executora {
	public static void main(String[] args) {

		new Imagem(); // Insere o plano de fundo através do método Imagem.java

		try {
			MenuPizza c = Util.subMenuPizza(0); // Chama o método MenuPizza que dará começo ao programa
			View.exibirMensagem("NOTA DO PEDIDO: \n\n" + c.toString());// Imprime a nota a ser impressa do
																		// atendente/cliente
		} catch (Exception e) {
			View.exibirERRO(e.getMessage(), "ERRO");
		}
	}
}
