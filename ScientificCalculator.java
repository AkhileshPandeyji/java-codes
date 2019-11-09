package javaBPIT;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



class Controls extends JPanel{

	static final long serialVersionUID = 1L;
	private GridLayout grid = new GridLayout(6,4);
	private static float num1;
	private static float num2;
	private static float result;
	private static int operation;
	public static String output="";
	
	Controls(){
		this.setSize(300,150);
		
		JButton addbtn = new JButton("+");
		JButton subbtn = new JButton("-");
		JButton multbtn = new JButton("*");
		JButton divbtn = new JButton("/");
		JButton num0 = new JButton("0");
		JButton num1 = new JButton("1");
		JButton num2 = new JButton("2");
		JButton num3 = new JButton("3");
		JButton num4 = new JButton("4");
		JButton num5 = new JButton("5");
		JButton num6 = new JButton("6");
		JButton num7 = new JButton("7");
		JButton num8 = new JButton("8");
		JButton num9 = new JButton("9");
		JButton dotbtn = new JButton(".");
		JButton equalbtn = new JButton("=");
		JButton tanbtn = new JButton("tan");
		JButton sinbtn = new JButton("sin");
		JButton cosbtn = new JButton("cos");
		JButton factbtn = new JButton("!");
		JButton sqrtbtn = new JButton("sqrt");
		JButton cbrtbtn = new JButton("cbrt");
		JButton powerbtn = new JButton("^");		
		JButton logbtn = new JButton("log");
		
		
		
		//////////////////// actions
		
		addbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float val1 = Float.valueOf(ScientificCalculator.screen.getText());
				Controls.output = "";				
				Controls.num1 = val1;
				Controls.operation = 1;
			}
			
		});
		
		subbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float val1 = Float.valueOf(ScientificCalculator.screen.getText());
				Controls.output = "";	
				Controls.num1 = val1;
				Controls.operation = 2;
			}
			
		});
		
		multbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float val1 = Float.valueOf(ScientificCalculator.screen.getText());
				Controls.output = "";	
				Controls.num1 = val1;
				Controls.operation = 3;
			}
			
		});
		
		divbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float val1 = Float.valueOf(ScientificCalculator.screen.getText());
				Controls.output = "";	
				Controls.num1 = val1;
				Controls.operation = 4;
			}
			
		});
		
		
		num1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="1";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="2";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="3";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="4";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="5";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="6";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="7";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="8";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="9";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		num0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+="0";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		dotbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ScientificCalculator.screen.setText("");
				Controls.output+=".";
				ScientificCalculator.screen.setText(Controls.output);
			}
			
			
			
		});
		
		equalbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float val2 = Float.valueOf(ScientificCalculator.screen.getText());
				Controls.num2 = val2;
				if (Controls.operation == 1) {
					Controls.result = Controls.add();
				}
				else if (Controls.operation == 2) {
					Controls.result = Controls.sub();
				}
				else if (Controls.operation == 3) {
					Controls.result = Controls.mult();
				}
				else {
					Controls.result = Controls.div();
				}
				
			ScientificCalculator.screen.setText(String.valueOf(Controls.result));	
			}			
			
		});
		
		
		
		
		grid.setHgap(10);
		grid.setVgap(10);
		
		this.add(num1);
		this.add(num2);
		this.add(num3);
		this.add(addbtn);
		this.add(num4);
		this.add(num5);
		this.add(num6);
		this.add(subbtn);
		this.add(num7);
		this.add(num8);
		this.add(num9);
		this.add(multbtn);
		this.add(num0);
		this.add(dotbtn);
		this.add(equalbtn);
		this.add(divbtn);
		this.add(tanbtn);
		this.add(sinbtn);
		this.add(cosbtn);
		this.add(factbtn);
		this.add(powerbtn);
		this.add(logbtn);
		this.add(cbrtbtn);
		this.add(sqrtbtn);
		
		
		this.setLayout(grid);
		
	}
	
	
	public static float add() {
		return (num1+num2);
	}
	public static float sub() {
		return (num1-num2);
	}
	public static float mult() {
		return (num1*num2);
	}
	public static float div() {
		return (num1/num2);
	}
}

public class ScientificCalculator extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Controls control = new Controls();
	private BorderLayout bl = new BorderLayout();
	private BorderLayout bl2 = new BorderLayout();
	public static JTextField screen = new JTextField("0.0",50);
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	private JPanel panel7 = new JPanel();
	private Font inputFont = new Font("Courier",Font.BOLD,20);
	private JButton clrbtn = new JButton("CLEAR");
	
	ScientificCalculator(){
		
		this.setSize(500,400);
		this.setVisible(true);
		this.setLocation(new Point(600,300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(bl);
		this.setTitle("Scientific Calculator 2.0         Author:Akhilesh Kumar Pandey 00620802717");
		
		Dimension dim = screen.getSize();
		
		panel1.setLayout(bl2);
		
		screen.setPreferredSize(new Dimension(dim.width,50));
		screen.setFont(inputFont);
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		clrbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("");
				Controls.output = "";
			}
		});
		
		panel1.add(screen,BorderLayout.CENTER);
		panel1.add(panel4,BorderLayout.LINE_START);
		panel1.add(panel5,BorderLayout.LINE_END);
		panel1.add(panel6,BorderLayout.NORTH);
		panel1.add(panel7,BorderLayout.SOUTH);
		
		//panel1.setPreferredSize(new Dimension(400,dim.height));
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.LINE_START);
		this.add(control,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.LINE_END);
		this.add(clrbtn,BorderLayout.SOUTH);
		
		
		
		
	}

	public static void main(String[] args) {
		
		new ScientificCalculator();
	}

}
