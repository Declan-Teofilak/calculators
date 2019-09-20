package simpleCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class simpleCalc extends Frame implements ActionListener
{
	   private Label lblInput;     // Declare input Label
	   private Label lblOutput;    // Declare output Label
	   private Label lblDivider;	//Declare visual divider between labels
	   private TextField tfInput;  // Declare input TextField
	   private TextField tfOutput; // Declare output TextField
	   private int sum = 0;        // Accumulated sum, init to 0
	   private int i = 0; 			//Counter

	   private Button one;		//Declare buttons 1-9
	   private Button two;
	   private Button three;
	   private Button four;
	   private Button five;
	   private Button six;
	   private Button seven;
	   private Button eight;
	   private Button nine;
	   
	   Button change;							//change to sub or add
	   private String c1 = "ADD"; 						//button option add
	   private String c2 = "SUBTRACT";					//button option subtract
	   boolean add = true;						//tells calculator to add or subtract
	   
	public simpleCalc()
	{
	//creates output field and panel	
	Panel panelSum = new Panel(new FlowLayout());
	tfOutput = new TextField(40);
	panelSum.add(tfOutput);
	
	
	//create numbers and their panel
	Panel panelNumbers = new Panel(new GridLayout(3, 3));
	one = new Button("1");
	add(one);
	one.addActionListener(this);
	panelNumbers.add(one);
	
	two = new Button("2");
	add(two);
	two.addActionListener(this);
	panelNumbers.add(two);
	
	three = new Button("3");
	add(three);
	three.addActionListener(this);
	panelNumbers.add(three);
	
	four = new Button("4");
	add(four);
	four.addActionListener(this);
	panelNumbers.add(four);
	
	five = new Button("5");
	add(five);
	five.addActionListener(this);
	panelNumbers.add(five);
	
	six = new Button("6");
	add(six);
	six.addActionListener(this);
	panelNumbers.add(six);
	
	seven = new Button("7");
	add(seven);
	seven.addActionListener(this);
	panelNumbers.add(seven);
	
	eight = new Button("8");
	add(eight);
	eight.addActionListener(this);
	panelNumbers.add(eight);
	
	nine = new Button("9");
	add(nine);
	nine.addActionListener(this);
	panelNumbers.add(nine);
	
	//add subtract button
	change = new Button("ADD");
	add(change);
	change.addActionListener(this);
	panelNumbers.add(change);
	
	//window general settings
	setLayout(new BorderLayout());
	add(panelSum, BorderLayout.NORTH);
	add(panelNumbers, BorderLayout.CENTER);
	setTitle("Add Em' Up");
	setSize(400, 600);
	setVisible(true);

	}
	public static void main(String[] args) 
	{
		// launch window
		new simpleCalc();

	}
	//checks which button was clicked
	//adds appropriate integer
	//checks counter and run through twice displays total
	   @Override
	   public void actionPerformed(ActionEvent evt) {
		   
		   if (evt.getSource() == one && i <= 1 && add == true)
		   {
			   sum += 1;
			   i++;
		   }
		   else if (evt.getSource() == one && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 1;
				   i++;
			   }
			   else
			   {
			   sum -= 1;
			   i++;
			   }
		   }
		   if (evt.getSource() == two && i <= 1 && add == true)
		   {
			   sum += 2;
			   i++;
		   }
		   else if (evt.getSource() == two && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 2;
				   i++;
			   }
			   else
			   {
			   sum -= 2;
			   i++;
			   }
		   }
		   if (evt.getSource() == three && i <= 1 && add == true)
		   {
			   sum += 3;
			   i++;
		   }
		   else if (evt.getSource() == three && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 3;
				   i++;
			   }
			   else
			   {
			   sum -= 3;
			   i++;
			   }
		   }
		   if (evt.getSource() == four && i <= 1 && add == true)
		   {
			   sum += 4;
			   i++;
		   }
		   else if (evt.getSource() == four && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 4;
				   i++;
			   }
			   else
			   {
			   sum -= 4;
			   i++;
			   }
		   }
		   if (evt.getSource() == five && i <= 1 && add == true)
		   {
			   sum += 5;
			   i++;
		   }
		   else if (evt.getSource() == five && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 5;
				   i++;
			   }
			   else
			   {
			   sum -= 5;
			   i++;
			   }
		   }
		   if (evt.getSource() == six && i <= 1 && add == true)
		   {
			   sum += 6;
			   i++;
		   }
		   else if (evt.getSource() == six && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 6;
				   i++;
			   }
			   else
			   {
			   sum -= 6;
			   i++;
			   }
		   }
		   if (evt.getSource() == seven && i <= 1 && add == true)
		   {
			   sum += 7;
			   i++;
		   }
		   else if (evt.getSource() == seven && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 7;
				   i++;
			   }
			   else
			   {
			   sum -= 7;
			   i++;
			   }
		   }
		   if (evt.getSource() == eight && i <= 1 && add == true)
		   {
			   sum += 8;
			   i++;
		   }
		   else if (evt.getSource() == eight && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 8;
				   i++;
			   }
			   else
			   {
			   sum -= 8;
			   i++;
			   }
		   }
		   if (evt.getSource() == nine && i <= 1 && add == true)
		   {
			   sum += 9;
			   i++;
		   }
		   else if (evt.getSource() == nine && i <= 1 && add == false)
		   {
			   if (i == 0)
			   {
				   sum = 9;
				   i++;
			   }
			   else
			   {
			   sum -= 9;
			   i++;
			   }
		   }
		   if (i == 2)
		   {
			   tfOutput.setText(sum + " ");
				 sum = 0;				// reset sum
				 i = 0;					// reset counter
		   }
		   if (evt.getSource() == change)
		   {
			   if (change.getLabel() == c1)
			   {
				   sum = 0;
				   tfOutput.setText(" ");
				   add = false;
				   change.setLabel(c2);
				   i = 0;
			   }
			   else if (change.getLabel() == c2)
			   {
				   sum = 0;
				   tfOutput.setText(" ");
				   add = true;
				   change.setLabel(c1);
				   i = 0;
			   }
		   }
	   }
}

