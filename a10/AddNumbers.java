import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddNumbers extends JFrame{
	
	JLabel operationOutput = new JLabel();
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton b_oeql = new JButton("=");
	JButton b_om = new JButton("*");
	JButton b_od = new JButton("/");
	JButton b_oa = new JButton("+");
	JButton b_os = new JButton("-");
	JButton b_oc = new JButton("C");
	
	
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JButton clickec_button = (JButton)event.getSource();
	
	public static void main(String args[]) {
		new AddNumbers();
	}
	
	AddNumbers(){
		
		int butt_height = 70;
		int butt_width = 60;

		
		
		int row_spacing = 5;
		int row_one_y = row_spacing;
		int row_two_y = row_one_y + butt_height + row_spacing;
		int row_three_y = row_two_y + butt_height + row_spacing;
		int row_four_y = row_three_y + butt_height + row_spacing;
		int row_five_y = row_four_y + butt_height + row_spacing;
		
	
		int col_spacing = 5;
		int col_one_x = col_spacing;
		int col_two_x = col_one_x + butt_width + col_spacing;
		int col_three_x = col_two_x + butt_width + col_spacing;
		int col_four_x = col_three_x + butt_width + col_spacing;
		
		JFrame f = new JFrame("Button Adding Machine");
		f.setLocation(2200,200);
		f.setLayout(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int Container_w = 4 * butt_width + 5 * col_spacing;
		int Container_h = 5 * butt_height + 6 * row_spacing;
		Dimension calPerferredSize = new Dimension(400,200);
		System.out.println(" calPerferredSize:" + calPerferredSize);
		Container c = f.getContentPane();
		c.setPreferredSize(calPerferredSize);
		f.pack();
		
		f.setVisible(true);
		
		b1.setLocation(col_one_x, row_two_y);
		b2.setLocation(col_two_x, row_two_y);
		b3.setLocation(col_three_x, row_two_y);
		b4.setLocation(col_one_x, row_three_y);
		b5.setLocation(col_two_x, row_three_y);
		b6.setLocation(col_three_x, row_three_y);
		b7.setLocation(col_one_x, row_four_y);
		b8.setLocation(col_two_x, row_four_y);
		b9.setLocation(col_three_x, row_four_y);
		b0.setLocation(col_two_x, row_five_y);
		
		
		b_oc.setLocation(col_one_x, row_five_y);
		b_oa.setLocation(col_four_x, row_two_y);
		b_os.setLocation(col_four_x, row_three_y);
		b_om.setLocation(col_four_x, row_four_y);
		b_od.setLocation(col_four_x, row_five_y);
		b_oeql.setLocation(col_three_x, row_five_y);
		
		
		operationOutput.setBounds(col_one_x, row_one_y, Container_w - 2 * col_spacing, butt_height);
		operationOutput.setFont(new Font("Serif", Font.PLAIN, 15));
		operationOutput.setBorder(BorderFactory.createLineBorder(Color.black));
		operationOutput.setForeground(Color.black);
		operationOutput.setBackground(Color.WHITE);
		operationOutput.setOpaque(true);
		operationOutput.setText("---");
		f.add(operationOutput);
		
		ButtonListener listener = new ButtonListener();
		
		
		for(JButton onebutton : allbuttons){
			onebutton.addActionListener(listener);
			onebutton.setSize(butt_width, butt_height);
			onebutton.setFont(new Font("Serif", Font.PLAIN, 15));
			f.add(onebutton);
		}
	}
		}
	}
}

		
