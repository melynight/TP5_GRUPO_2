package ejercicioPeliculas;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JList<Peliculas> jList;
	
	public ListarPeliculas(DefaultListModel<Peliculas> listModel) {    
        setLayout(new BorderLayout(0, 0));

        JLabel lblPeliculas = new JLabel("Peliculas");
        add(lblPeliculas, BorderLayout.WEST);
        
        ordenarAlfabeticamente(listModel);
        jList = new JList<>(listModel);
        add(jList, BorderLayout.CENTER);
	}
	
	public void ordenarAlfabeticamente(DefaultListModel<Peliculas> listModel) {
		List<Peliculas> listaPelis = new ArrayList<>();
		
		for (int i = 0; i < listModel.getSize(); i++) {
            listaPelis.add(listModel.getElementAt(i));
        }

        Collections.sort(listaPelis);

        listModel.removeAllElements();
        for (Peliculas pelicula : listaPelis) {
            listModel.addElement(pelicula);
        }
	}
}