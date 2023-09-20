package ejercicioPeliculas;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JList<Peliculas> jList;
	private DefaultListModel<Peliculas> listModel;

	public ListarPeliculas() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		add(lblPeliculas, BorderLayout.WEST);
		
		//JList<Peliculas> listPeliculas = new JList<Peliculas>();
		//add(listPeliculas, BorderLayout.CENTER);
		jList = new JList<>();
        add(jList, BorderLayout.CENTER);
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModel2)
	{
		this.listModel = listModel2;
		jList.setModel(this.listModel);
		
	}
}
