package ejercicioPeliculas;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;

public class Principal {
	
	private static DefaultListModel<Peliculas> listModel;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					//INSTANCIO EL LISTMODEL
					listModel = new DefaultListModel<Peliculas>();
					Ventana frame = new Ventana(listModel);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
	