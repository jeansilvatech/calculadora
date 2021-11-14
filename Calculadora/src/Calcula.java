import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import java.awt.Window.Type;


public class Calcula extends JFrame {

	private JPanel contentPane;
	private JTextField jtValor;
	private double numero1, numero2,resultado;
	private String operacao, ponto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Calcula frame = new Calcula();					
	}

	/**
	 * Create the frame.
	 */
	public Calcula() {
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\314124272\\Downloads\\Calculadora\\calculator_100870.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 219, 307);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtValor = new JTextField();
		jtValor.setHorizontalAlignment(SwingConstants.RIGHT);
		jtValor.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtValor.setForeground(new Color(255, 255, 255));
		jtValor.setBackground(new Color(0, 0, 0));
		jtValor.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent evento) {
				
				String caracteres="0123456789.";
				if(!caracteres.contains(evento.getKeyChar()+""))
				{
					evento.consume();
				}
				
				if(jtValor.getText().contains(".") && evento.getKeyChar()=='.')
				{
					evento.consume();
					
				}
				
			}
		});
		jtValor.setBounds(1, 0, 201, 90);
		contentPane.add(jtValor);
		jtValor.setColumns(10);
		
		JButton jb1 = new JButton("1");
		jb1.setFocusPainted(false);
		jb1.setBackground(new Color(0, 0, 0));
		jb1.setForeground(new Color(255, 255, 255));
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtValor.setText(jtValor.getText()+"1");
			}
		});
		jb1.setBounds(1, 165, 51, 39);
		contentPane.add(jb1);
		
		JButton jb2 = new JButton("2");
		jb2.setFocusPainted(false);
		jb2.setForeground(new Color(255, 255, 255));
		jb2.setBackground(new Color(0, 0, 0));
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"2");
			}
		});
		jb2.setBounds(50, 165, 51, 39);
		contentPane.add(jb2);
		
		JButton jbmais = new JButton("+");
		jbmais.setFocusPainted(false);
		jbmais.setForeground(new Color(255, 255, 255));
		jbmais.setBackground(new Color(0, 0, 0));
		jbmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numero1=Double.parseDouble(jtValor.getText());
				operacao="+";
				jtValor.setText("");
			}
		});
		jbmais.setBounds(150, 203, 51, 39);
		contentPane.add(jbmais);
		
		JButton jbigual = new JButton("=");
		jbigual.setFocusPainted(false);
		jbigual.setBackground(new Color(0, 0, 204));
		jbigual.setForeground(new Color(255, 255, 255));
		jbigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				
				numero2=Double.parseDouble(jtValor.getText());
				if(operacao.equals("+"))
				{
					resultado=numero1+numero2;
				}
				jtValor.setText(resultado+"");
				
			
				if(operacao.equals("\u2212"))
				{
					resultado=numero1-numero2;
				}
				jtValor.setText(resultado+"");
			
			
				if(operacao.equals("X"))
				{
					resultado=numero1*numero2;
				}
				jtValor.setText(resultado+"");
			
			
				if(operacao.equals("/"))
				{
					resultado=numero1/numero2;
				}
				jtValor.setText(resultado+"");
				
				}
				catch(Exception a)
				{
					jtValor.setText("");
				}
			}
		});
		jbigual.setBounds(100, 242, 101, 23);
		contentPane.add(jbigual);
		
		JButton jb3 = new JButton("3");
		jb3.setFocusPainted(false);
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"3");
			}
		});
		jb3.setForeground(new Color(255, 255, 255));
		jb3.setBackground(new Color(0, 0, 0));
		jb3.setBounds(100, 165, 51, 39);
		contentPane.add(jb3);
		
		JButton jb0 = new JButton("0");
		jb0.setFocusPainted(false);
		jb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"0");
			}
		});
		jb0.setForeground(new Color(255, 255, 255));
		jb0.setBackground(new Color(0, 0, 0));
		jb0.setBounds(1, 203, 51, 39);
		contentPane.add(jb0);
		
		JButton jb4 = new JButton("4");
		jb4.setFocusPainted(false);
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"4");
			}
		});
		jb4.setBackground(new Color(0, 0, 0));
		jb4.setForeground(new Color(255, 255, 255));
		jb4.setBounds(1, 127, 51, 39);
		contentPane.add(jb4);
		
		JButton jb5 = new JButton("5");
		jb5.setFocusPainted(false);
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"5");
			}
		});
		jb5.setBackground(new Color(0, 0, 0));
		jb5.setForeground(new Color(255, 255, 255));
		jb5.setBounds(50, 127, 51, 39);
		contentPane.add(jb5);
		
		JButton jb6 = new JButton("6");
		jb6.setFocusPainted(false);
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"6");
			}
		});
		jb6.setForeground(new Color(255, 255, 255));
		jb6.setBackground(new Color(0, 0, 0));
		jb6.setBounds(100, 127, 51, 39);
		contentPane.add(jb6);
		
		JButton jb7 = new JButton("7");
		jb7.setFocusPainted(false);
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"7");
			}
		});
		jb7.setForeground(new Color(255, 255, 255));
		jb7.setBackground(new Color(0, 0, 0));
		jb7.setBounds(1, 89, 51, 39);
		contentPane.add(jb7);
		
		JButton jb8 = new JButton("8");
		jb8.setFocusPainted(false);
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtValor.setText(jtValor.getText()+"8");
			}
		});
		jb8.setForeground(new Color(255, 255, 255));
		jb8.setBackground(new Color(0, 0, 0));
		jb8.setBounds(50, 89, 51, 39);
		contentPane.add(jb8);
		
		JButton jb9 = new JButton("9");
		jb9.setFocusPainted(false);
		jb9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				jtValor.setText(jtValor.getText()+"9");
			}
		});
		jb9.setForeground(new Color(255, 255, 255));
		jb9.setBackground(new Color(0, 0, 0));
		jb9.setBounds(100, 89, 51, 39);
		contentPane.add(jb9);
		
		JButton jbponto = new JButton(".");
		jbponto.setFocusPainted(false);
		jbponto.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		
		});
		jbponto.setForeground(new Color(255, 255, 255));
		jbponto.setBackground(new Color(0, 0, 0));
		jbponto.setBounds(50, 203, 51, 39);
		contentPane.add(jbponto);
		
		//raiz quadrada
		JButton jbraiz = new JButton("\u221A");
		jbraiz.setFocusPainted(false);
		jbraiz.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				numero1=Double.parseDouble(jtValor.getText());
				resultado= Math.sqrt(numero1);
				jtValor.setText(""+resultado);
			
			}
		});
		jbraiz.setForeground(new Color(255, 255, 255));
		jbraiz.setBackground(new Color(0, 0, 0));
		jbraiz.setBounds(100, 203, 51, 39);
		contentPane.add(jbraiz);
		
		//subtração
		JButton jbsubtrair = new JButton("\u2212");
		jbsubtrair.setFocusPainted(false);
		jbsubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(jtValor.getText());
				operacao="\u2212";
				jtValor.setText("");
			}
		});
		jbsubtrair.setForeground(new Color(255, 255, 255));
		jbsubtrair.setBackground(new Color(0, 0, 0));
		jbsubtrair.setBounds(150, 165, 51, 39);
		contentPane.add(jbsubtrair);
		
		//multiplicação
		JButton jbmultiplicar = new JButton("x");
		jbmultiplicar.setFocusPainted(false);
		jbmultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(jtValor.getText());
				operacao="X";
				jtValor.setText("");
			}
		});
		jbmultiplicar.setForeground(Color.WHITE);
		jbmultiplicar.setBackground(Color.BLACK);
		jbmultiplicar.setBounds(150, 127, 51, 39);
		contentPane.add(jbmultiplicar);
		
		//delete
		JButton jbdelete = new JButton("DEL");
		jbdelete.setFocusPainted(false);
		jbdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtValor.setText("");
				
			}
		});
		jbdelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbdelete.setBackground(new Color(255, 0, 0));
		jbdelete.setForeground(new Color(255, 255, 255));
		jbdelete.setBounds(1, 242, 100, 23);
		contentPane.add(jbdelete);
		
		//divisão
		JButton jbdividir = new JButton("/");
		jbdividir.setFocusPainted(false);
		jbdividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(jtValor.getText());
				operacao="/";
				jtValor.setText("");
			}
		});
		jbdividir.setForeground(Color.WHITE);
		jbdividir.setBackground(Color.BLACK);
		jbdividir.setBounds(150, 89, 51, 39);
		contentPane.add(jbdividir);
		
		setVisible(true);
	}
}
