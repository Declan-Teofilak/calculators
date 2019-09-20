package betterCounter;


import java.awt.*;
import java.awt.event.*;

public class betterCounter extends Frame implements ActionListener
{
	   private Label lblInput;     // Declare input Label
	   private Label lblOutput;    // Declare output Label
	   private Label lblDivider;	//Declare visual divider between labels
	   private TextField tfInput;  // Declare input TextField
	   private TextField tfOutput; // Declare output TextField
	   private int sum = 0;        // Accumulated sum, init to 0
	   private int i = 0;         // Counter
	   private Button one;		//Declare buttons 1-9
	   private Button two;
	   private Button three;
	   private Button four;
	   private Button five;
	   private Button six;
	   private Button seven;
	   private Button eight;
	   private Button nine;
	   
	betterCounter()
	{
	//tfInput = new TextField(10);
	//add(tfInput);
	tfOutput = new TextField(12);
	lblDivider = new Label("The Sum is :");
	add(lblDivider);
	add(tfOutput);
	
	one = new Button("1");
	add(one);
	one.addActionListener(this);
	
	two = new Button("2");
	add(two);
	two.addActionListener(this);
	
	three = new Button("3");
	add(three);
	three.addActionListener(this);
	
	four = new Button("4");
	add(four);
	four.addActionListener(this);
	
	five = new Button("5");
	add(five);
	five.addActionListener(this);
	
	six = new Button("6");
	add(six);
	six.addActionListener(this);
	
	seven = new Button("7");
	add(seven);
	seven.addActionListener(this);
	
	eight = new Button("8");
	add(eight);
	eight.addActionListener(this);
	
	nine = new Button("9");
	add(nine);
	nine.addActionListener(this);
	
	
	setLayout(new GridLayout(2, 0));
	setTitle("Add Em' Up");
	setSize(700, 700);
	setVisible(true);

	}

	public static void main(String[] args) 
	{
		// launch window
		new betterCounter();

	}
	//checks which button was clicked
	//adds appropriate integer
	//checks counter and run through twice displays total
	   @Override
	   public void actionPerformed(ActionEvent evt) {
		   
		   if (evt.getSource() == one && i <= 1)
		   {
			   sum += 1;
			   i++;
		   }
		   if (evt.getSource() == two && i <= 1)
		   {
			   sum += 2;
			   i++;
		   }
		   if (evt.getSource() == three && i <= 1)
		   {
			   sum += 3;
			   i++;
		   }
		   if (evt.getSource() == four && i <= 1)
		   {
			   sum += 4;
			   i++;
		   }
		   if (evt.getSource() == five && i <= 1)
		   {
			   sum += 5;
			   i++;
		   }
		   if (evt.getSource() == six && i <= 1)
		   {
			   sum += 6;
			   i++;
		   }
		   if (evt.getSource() == seven && i <= 1)
		   {
			   sum += 7;
			   i++;
		   }
		   if (evt.getSource() == eight && i <= 1)
		   {
			   sum += 8;
			   i++;
		   }
		   if (evt.getSource() == nine && i <= 1)
		   {
			   sum += 9;
			   i++;
		   }
		   if (i > 1)
		   {
			   tfOutput.setText(sum + " ");
				 sum = 0;				// reset sum
				 i = 0;					// reset counter
				 tfInput.setText("");  // Clear input TextField
		   }
	   }	   
}
