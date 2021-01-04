package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInsertarTrabajador extends JPanel{
	private JLabel titulo,icon;
	public PanelInsertarTrabajador() {
		setLayout(null);
		setBackground(Color.orange);
		labels();
	}
	private void labels() {
		titulo = new JLabel("Inserte Datos del Trabajador nuevo");
		titulo.setBounds(250,100,400,40);
		titulo.setFont(new Font("serif",Font.PLAIN,22));

		icon = new JLabel(new ImageIcon("logo.png"));
		icon.setBounds(0,0,150,150);
		add(titulo);
		add(icon);
	}
}