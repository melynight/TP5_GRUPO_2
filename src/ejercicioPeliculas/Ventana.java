package ejercicioPeliculas;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	//private static DefaultListModel<Peliculas> listModel;
	
	private JPanel contentPane;
	
	public Ventana(DefaultListModel<Peliculas> listModel) {
		
		
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPeliculas = new JMenu("Peliculas");
		menuBar.add(menuPeliculas);
		
		JMenuItem mItemAgregar = new JMenuItem("Agregar");
		mItemAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				AgregarPeliculas panelAgregar = new AgregarPeliculas();
				panelAgregar.setDefaultListModel(listModel);
				contentPane.add(panelAgregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		menuPeliculas.add(mItemAgregar);
		
		JMenuItem mItemListar = new JMenuItem("Listar");
		mItemListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ListarPeliculas panelListar = new ListarPeliculas();
				panelListar.setDefaultListModel(listModel);
				contentPane.add(panelListar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		menuPeliculas.add(mItemListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}