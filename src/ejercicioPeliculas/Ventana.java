package ejercicioPeliculas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ventana extends JFrame {

	private JPanel contentPane;


	
	public Ventana() {
		
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPeliculas = new JMenu("Peliculas");
		menuBar.add(menuPeliculas);
		
		JMenuItem mItemAgregar = new JMenuItem("Agregar");
		menuPeliculas.add(mItemAgregar);
		
		JMenuItem mItemListar = new JMenuItem("Listar");
		menuPeliculas.add(mItemListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}




