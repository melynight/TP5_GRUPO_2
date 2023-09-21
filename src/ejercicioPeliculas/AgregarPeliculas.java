package ejercicioPeliculas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class AgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private DefaultListModel<Peliculas> listModel;
	

	public AgregarPeliculas() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(76, 30, 46, 14);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(76, 70, 66, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(76, 107, 66, 14);
		add(lblGenero);
		
		JLabel lblIDAutonum = new JLabel("id");
		lblIDAutonum.setBounds(163, 30, 46, 14);
		add(lblIDAutonum);
		lblIDAutonum.setText(Integer.toString(Peliculas.getIdAutomatico()));
		
		txtNombre = new JTextField();
		txtNombre.setBounds(163, 67, 183, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox<Categorias> cbGeneros = new JComboBox<Categorias>();
		cbGeneros.setBounds(163, 104, 183, 20);
		cbGeneros.addItem(new Categorias("Seleccione un género"));
		cbGeneros.addItem(new Categorias("Terror"));
		cbGeneros.addItem(new Categorias("Acción"));
		cbGeneros.addItem(new Categorias("Suspenso"));
		cbGeneros.addItem(new Categorias("Romántica"));
		add(cbGeneros);
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
                //Agrega una pelicula al JList
                if (cbGeneros.getSelectedIndex() != 0 && cbGeneros.getSelectedIndex() != -1 &&
                        !txtNombre.getText().isEmpty()) { 
                    //0 = primer elemento; -1 = ningun elemento seleccionado
                    Peliculas pel = new Peliculas();
                    Categorias cat = new Categorias();
                    cat.setNombre(cbGeneros.getSelectedItem().toString());
                    pel.setNombre(txtNombre.getText());
                    pel.setCategoria(cat);
                    pel.setId(Integer.parseInt(lblIDAutonum.getText()));
                    listModel.addElement(pel);
                    
                    txtNombre.setText("");
                    lblIDAutonum.setText(Integer.toString(Peliculas.getIdAutomatico()));
                    cbGeneros.setSelectedIndex(0);
                    
                } else 
                {
                    JOptionPane.showMessageDialog(null, "No se puede agregar la pelicula");
                    txtNombre.setText("");
                    cbGeneros.setSelectedIndex(0);
                }
            }
        });
        btnAceptar.setBounds(76, 149, 89, 23);
        add(btnAceptar);
    }
    
    public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
    {
        this.listModel = listModelRecibido;
    }
}