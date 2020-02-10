package calculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class calculator implements ActionListener {
	JFrame frame = new JFrame(); // for the design part
	JPanel panel = new JPanel(); // for the calculator screen
	JTextArea t = new JTextArea(2,12); // for writing on the screen upto 12 digits
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	
		JButton buttonadd = new JButton("+");
	JButton buttonsub = new JButton("-");
	JButton buttonmul = new JButton("*");
	JButton buttondiv = new JButton("/");
	JButton buttonclear = new JButton("clr");
	JButton buttondot = new JButton(" . ");
	JButton buttonequal = new JButton("=");
	JButton bdel = new JButton("Del");
	static double a=0,b=0,result=0;
	int addc=0,mulc=0,divc=0,subc=0;
	static int operator=0;
	public calculator() {
		frame.setSize(340,540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Rajdeep Majumder Calculator");
		
		frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED,4);
		
		panel.add(t);
		t.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		t.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD,33);
		t.setFont(font);
		t.setForeground(Color.WHITE);
		t.setPreferredSize(new Dimension(2,12));
		t.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button1.png"));
		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button2.png"));
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button3.png"));
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button4.png"));
		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button5.png"));
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button6.png"));
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button7.png"));
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button8.png"));
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button9.png"));
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\button0.png"));
		buttondot.setPreferredSize(new Dimension(100,40));
		buttondot.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttondot.png"));
		buttonadd.setPreferredSize(new Dimension(100,40));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonadd.png"));
		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonsub.png"));
		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonmul.png"));
		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttondiv.png"));
		buttonclear.setPreferredSize(new Dimension(100,40));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonclear.png"));
		buttonequal.setPreferredSize(new Dimension(100,40));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonequal.png"));
		bdel.setPreferredSize(new Dimension(100,40));
		//bdel.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\buttonequal.png"));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		
		panel.add(button8);
		
		panel.add(button9);
		panel.add(button0);
		panel.add(buttondot);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonclear);
		panel.add(buttonequal);
		panel.add(bdel);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		bdel.addActionListener((ActionListener)this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==button2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==button3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==button4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==button5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==button6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==button7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==button8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==button9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==button0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==buttondot)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==buttonadd)
		{
		
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==buttonsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==buttonmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==buttondiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(e.getSource()==buttonequal)
		{
			b=Double.parseDouble(t.getText());
		
			switch(operator)
			{
				case 1: result=a+b;
					break;
		
				case 2: result=a-b;
					break;
		
				case 3: result=a*b;
					break;
		
				case 4: result=a/b;
					break;
		
				default: result=0;
			}
		
			t.setText(""+result);
		}
		
		if(e.getSource()==buttonclear)
			t.setText("");
		
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}	
	
	}
	
}
