package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PRIMER NUMERO");
			lblNewLabel.setBounds(46, 28, 97, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("SEGUNDO NUMERO");
			lblNewLabel_1.setBounds(46, 53, 97, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("TERCER NUMERO");
			lblNewLabel_2.setBounds(46, 78, 117, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("SUMAR DOS ENTEROS");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(297, 24, 173, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("SUMAR DOS REALES");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(297, 74, 173, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("SUMAR TRES ENTEROS");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(297, 49, 173, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(170, 25, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(170, 50, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(170, 75, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(65, 120, 405, 130);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton_3 = new JButton("BORRAR");
			btnNewButton_3.setBounds(46, 96, 89, 23);
			contentPane.add(btnNewButton_3);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText()); 
		calculadora c=new calculadora(n1, n2);
		txtS.append("La suma es: "+c.Sumar(n1, n2)); 
		
	} catch (Exception e2) {
		MostrarError(); 
	} 
	
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this, "ingrese numeros validos");
	}
	
	
	
	
	
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	
	try {
		int n1 = Integer.parseInt(txtN1.getText()); 
		int n2 = Integer.parseInt(txtN2.getText()); 
		int n3 = Integer.parseInt(txtN3.getText()); 
		calculadora c = new calculadora(n1, n2, n3); 
		txtS.append("la suma es: " +c.Sumar(n1, n2, n3));
		

	} catch (Exception e2) {
		MostrarError(); 
	}
	
	}
	
	
	
	
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	
	try {
		double num1 = Double.parseDouble(txtN1.getText()); 
		double num2 = Double.parseDouble(txtN2.getText()); 
		calculadora c = new calculadora(num1, num2); 
		txtS.append("la suma es: " + c.Sumar(num1, num2));
		
		
	} catch (Exception e2) {
		MostrarError();
	}
	
	}
}
