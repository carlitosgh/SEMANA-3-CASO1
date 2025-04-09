package caso3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNom;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V3 frame = new V3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("INGRESE NOMBRE");
			lblNewLabel.setBounds(45, 25, 109, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(164, 22, 86, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			btnNewButton = new JButton("PROCESAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(164, 54, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(57, 126, 348, 109);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		if (txtNom.getText().trim().isEmpty()) { //verificar si el cuadro esta vacio
			JOptionPane.showMessageDialog(this, "INGRESA UN NOMBRE");
		} else {
		
		String nom = txtNom.getText(); 
		Contador c =new Contador(nom);
	
		
		
		txtS.setText(" ");
		txtS.append("Ingreso " + c.Cantidad() + " nombres :) ");
	}}
}
