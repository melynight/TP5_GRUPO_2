package ejercicioPeliculas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;

	public ListarPeliculas() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		add(lblPeliculas, BorderLayout.WEST);
		
		JList<Peliculas> listPeliculas = new JList<Peliculas>();
		add(listPeliculas, BorderLayout.CENTER);
	}
}
