import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*; 
import java.util.*;
@SuppressWarnings("serial")

class Calculator extends JFrame implements ActionListener {
	private JTextField curT;
	private JTextField result;
	private JPanel myPanel;
	private JButton b0 , b1, b2, b3, b4, b5, b6 , b7 , b8 , b9 , Fclear,be,bf,bm,bd,bs,ba;
	private int operator;
	public static void main(String[] args) {
		new Calculator();
	}
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CSCI-141");
		setSize(500,680);
		this.setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel myTitle = new JLabel("Calculator");
		myTitle.setHorizontalAlignment(SwingConstants.CENTER);
		myTitle.setFont(new Font("SansSerif", Font.BOLD, 40));
		myTitle.setBounds(10, 11, 474, 39);
		getContentPane().add(myTitle);
		
		curT = new JTextField();
		curT.setHorizontalAlignment(SwingConstants.TRAILING);
		curT.setBounds(10, 61, 464, 39);
		getContentPane().add(curT);
		curT.setColumns(10);
		
		result = new JTextField();
		result.setHorizontalAlignment(SwingConstants.TRAILING);
		result.setColumns(10);
		result.setBounds(10, 103, 464, 39);
		getContentPane().add(result);
		
		b0 = new JButton("0");
		b0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b0.setBounds(28, 529, 100, 87);
		getContentPane().add(b0);
		b0.addActionListener(this);
		
		bf = new JButton(".");
		bf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bf.setBounds(152, 529, 100, 87);
		getContentPane().add(bf);
		bf.addActionListener(this);
		
		 be = new JButton("=");
		be.setFont(new Font("Tahoma", Font.PLAIN, 30));
		be.setBounds(274, 529, 100, 87);
		getContentPane().add(be);
		be.addActionListener(this);
		
		 b1 = new JButton("1");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b1.setBounds(28, 410, 100, 87);
		getContentPane().add(b1);
		b1.addActionListener(this);
		
		 b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b2.setBounds(152, 410, 100, 87);
		getContentPane().add(b2);
		b2.addActionListener(this);
		
		 b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b3.setBounds(274, 410, 100, 87);
		getContentPane().add(b3);
		b3.addActionListener(this);
		
		 b4 = new JButton("4");
		b4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b4.setBounds(28, 291, 100, 87);
		getContentPane().add(b4);
		b4.addActionListener(this);
		
		 b5 = new JButton("5");
		b5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b5.setBounds(152, 291, 100, 87);
		getContentPane().add(b5);
		b5.addActionListener(this);
		
		 b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b6.setBounds(274, 291, 100, 87);
		getContentPane().add(b6);
		b6.addActionListener(this);
		
		 b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b7.setBounds(28, 177, 100, 87);
		getContentPane().add(b7);
		b7.addActionListener(this);
		
		 b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b8.setBounds(152, 177, 100, 87);
		getContentPane().add(b8);
		b8.addActionListener(this);
		
		 b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b9.setBounds(274, 177, 100, 87);
		getContentPane().add(b9);
		b9.addActionListener(this);
		
		 Fclear = new JButton("C");
		Fclear.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Fclear.setBounds(384, 176, 89, 72);
		getContentPane().add(Fclear);
		Fclear.addActionListener(this);
		
		 bm = new JButton("*");
		bm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bm.setBounds(385, 259, 89, 72);
		getContentPane().add(bm);
		bm.addActionListener(this);
		
		 bd = new JButton("/");
		bd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bd.setBounds(384, 354, 89, 72);
		getContentPane().add(bd);
		bd.addActionListener(this);
		
		 bs = new JButton("-");
		bs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bs.setBounds(384, 451, 89, 72);
		getContentPane().add(bs);
		bs.addActionListener(this);
		
		 ba = new JButton("+");
		ba.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ba.setBounds(385, 544, 89, 72);
		getContentPane().add(ba);
		ba.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Fclear) {
			result.setText("");
		}
		if(e.getSource()==b1)
			result.setText(result.getText().concat("1"));
		if(e.getSource()==b2)
			result.setText(result.getText().concat("2"));
		if(e.getSource()==b3)
			result.setText(result.getText().concat("3"));
		if(e.getSource()==b4)
			result.setText(result.getText().concat("4"));
		if(e.getSource()==b5)
			result.setText(result.getText().concat("5"));
		if(e.getSource()==b6)
			result.setText(result.getText().concat("6"));
		if(e.getSource()==b7)
			result.setText(result.getText().concat("7"));
		if(e.getSource()==b8)
			result.setText(result.getText().concat("8"));
		if(e.getSource()==b9)
			result.setText(result.getText().concat("9"));
		if(e.getSource()==b0)
			result.setText(result.getText().concat("0"));
		if(e.getSource()==bf)
			result.setText(result.getText().concat("."));
		if(e.getSource()==bm) {
			curT.setText(result.getText());
			operator=1;
			result.setText("");
		}
		if(e.getSource()==bd) {
			curT.setText(result.getText());
			operator=2;
			result.setText("");
		}
		if(e.getSource()==bs) {
			curT.setText(result.getText());
			operator=3;
			result.setText("");
		}
		if(e.getSource()==ba) {
			curT.setText(result.getText());
			operator=4;
			result.setText("");
		}
		if(e.getSource()==be) {
			double b =Double.parseDouble(curT.getText());
			double a = Double.parseDouble(result.getText());
			double ans;
			curT.setText(result.getText());
			switch (operator) {
			case 1:
				ans = a*b;
				result.setText(""+ans);
				break;
			case 2:
				ans = b/a;
				result.setText(""+ans);
				break;
			case 3:
				ans = b-a;
				result.setText(""+ans);
				break;
			case 4:
				ans = a+b;
				result.setText(""+ans);
				break;
			default:
				break;
			}
		}
	}
}
