// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Imagem extends JFrame {

	ImageIcon imagem = new ImageIcon(getClass().getResource("Saliere_Pizzeria.png")); // Imagem fictícia utilizada
																						// no plano de
																						// fundo

	JLabel label = new JLabel(imagem);

	public Imagem() {

		add(label);

		setSize(1200, 1035);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
	}
}