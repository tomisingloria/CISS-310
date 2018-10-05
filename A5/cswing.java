
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cswing extends JFrame{

	JLabel lab_user_message = new JLabel();
	JButton btn_one = new JButton("Fun Fact 1");
	JButton btn_two = new JButton("Fun Fact 2");
	JButton btn_three = new JButton("Fun Fact 3");
	JButton btn_four = new JButton("Fun Fact 4");
	JButton btn_five = new JButton("Fun Fact 5");
	JButton btn_six = new JButton("Fun Fact 6");
	JButton btn_seven = new JButton("Fun Fact 7");
	JButton btn_eight = new JButton("Fun Fact 8");
	JButton btn_nine = new JButton("Fun Fact 9");
	JButton btn_ten = new JButton("Fun Fact 10");
	JButton btn_eleven = new JButton("Fun Fact 11");
	JButton btn_twelve = new JButton("Fun Fact 12");
	
	// override constructor
	public cswing(){
		
		JFrame f = new JFrame("a5 Example");
		f.setSize(600,600);
		f.setLocation(0,0);
		f.setLayout(null);
		f.setResizable(false);
		// f.setLocationRelativeTo(null); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonListener listener = new ButtonListener();
		
		btn_one.setBounds(10,10,100,50);
		btn_one.addActionListener(listener);
		f.add(btn_one);		
		
		btn_two.setBounds(110,10,100,50);
		btn_two.addActionListener(listener);
		f.add(btn_two);
		
		btn_three.setBounds(210,10,100,50);
		btn_three.addActionListener(listener);
		f.add(btn_three);
		
		btn_four.setBounds(310,10,100,50);
		btn_four.addActionListener(listener);
		f.add(btn_four);
		
		btn_five.setBounds(410,10,100,50);
		btn_five.addActionListener(listener);
		f.add(btn_five);
		
		btn_six.setBounds(10,70,100,50);
		btn_six.addActionListener(listener);
		f.add(btn_six);
		
		btn_seven.setBounds(110,70,100,50);
		btn_seven.addActionListener(listener);
		f.add(btn_seven);
		
		btn_eight.setBounds(210,70,100,50);
		btn_eight.addActionListener(listener);
		f.add(btn_eight);
		
		btn_nine.setBounds(310,70,100,50);
		btn_nine.addActionListener(listener);
		f.add(btn_nine);
		
		btn_ten.setBounds(410,70,100,50);
		btn_ten.addActionListener(listener);
		f.add(btn_ten);
		
		btn_eleven.setBounds(10,140,100,50);
		btn_eleven.addActionListener(listener);
		f.add(btn_eleven);
		
		btn_twelve.setBounds(110,140,100,50);
		btn_twelve.addActionListener(listener);
		f.add(btn_twelve);
		
		
		lab_user_message.setBounds(10, 500, 600, 20);
		lab_user_message.setForeground(Color.red);
		lab_user_message.setText("Click a fun fact to learn something new!");
		f.add(lab_user_message);
		
		f.setVisible(true); 
	
	}
	
	public static void main(String args[]) {
		new cswing();
	}
	
	
		// let's get the clicks.
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn_one) {
				lab_user_message.setText("7% of American adults believe that chocolate milk comes from brown cows.");
				lab_user_message.setForeground(Color.blue);
			} 	else if (e.getSource() == btn_two) {
				lab_user_message.setText("A lion's roar can be heard from 5 miles away.");
				lab_user_message.setForeground(Color.red);
			}
				else if (e.getSource() == btn_three) {
				lab_user_message.setText("You burn more calories sleeping than you do watching TV.");
				lab_user_message.setForeground(Color.green);			
		}
				else if (e.getSource() == btn_four) {
				lab_user_message.setText("A single cloud can weigh more than 1 million pounds.");
				lab_user_message.setForeground(Color.magenta);			
		}
				else if (e.getSource() == btn_five) {
				lab_user_message.setText("The average person walks the equivalent of 3 times around the world in a lifetime.");
				lab_user_message.setForeground(Color.pink);			
		}
				else if (e.getSource() == btn_six) {
				lab_user_message.setText("Men are 6 times more likely to be struck by lightning than women.");
				lab_user_message.setForeground(Color.gray);			
		}
				else if (e.getSource() == btn_seven) {
				lab_user_message.setText("Coca-Cola would be green if coloring was not added to it.");
				lab_user_message.setForeground(Color.orange);			
		}
				else if (e.getSource() == btn_eight) {
				lab_user_message.setText("It would take a sloth one month to travel one mile.");
				lab_user_message.setForeground(Color.blue);			
		}
				else if (e.getSource() == btn_nine) {
				lab_user_message.setText("10% of the world's population is left handed.");
				lab_user_message.setForeground(Color.red);			
		}
				else if (e.getSource() == btn_ten) {
				lab_user_message.setText("Avocados are poisonous to birds. ");
				lab_user_message.setForeground(Color.magenta);			
		}
				else if (e.getSource() == btn_eleven) {
				lab_user_message.setText("Honey never spoils.");
				lab_user_message.setForeground(Color.green);			
		}
				else if (e.getSource() == btn_twelve) {
				lab_user_message.setText("The elephant is the only mammal that cannot jump.");
				lab_user_message.setForeground(Color.orange);			
		}
				
		
	}
	
	}
}
