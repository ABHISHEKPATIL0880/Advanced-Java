import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridCalculator {

	JFrame f = new JFrame();
	GridCalculator() {
		
		JButton B1 =new JButton("1");
		JButton B2 =new JButton("2");
		JButton B3 =new JButton("3");
		JButton B4 =new JButton("__");
	    JButton B5 =new JButton("4");
	    JButton B6 =new JButton("5");
	    JButton B7 =new JButton("6");
	    JButton B8 =new JButton("x");
	    JButton B9 =new JButton("7");
	   JButton B10 =new JButton("8");
	   JButton B11 =new JButton("9");
	   JButton B12 =new JButton("/");
	   JButton B13 =new JButton("AC");
	   JButton B14 =new JButton("%");
	   JButton B15 =new JButton("=");
	   JButton B16 =new JButton("+");
	   
	   
	   
	   
	   
		f.add(B1);
		f.add(B2);
		f.add(B3);
		f.add(B4);
		f.add(B5);
		f.add(B6);
		f.add(B7);
		f.add(B8);
		f.add(B9);
		f.add(B10);
		f.add(B11);
		f.add(B12);
		f.add(B13);
		f.add(B14);
		f.add(B14);
		f.add(B15);
		f.add(B16);
	
		
		
		f.setLayout(new GridLayout(4,4));
	
		f.setSize(400,450);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

 

	public static void main(String[] args) {
		
       new GridCalculator();
	}

}
