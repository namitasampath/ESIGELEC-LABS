import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener {
	JTextField screen; 
	 JButton volumeup, volumedown, makecall; 
	 JButton zero, one, two, three, four, five, six, seven, eight, nine, star, htag; 
	 JRadioButton speakeron, speakeroff; 
	 ButtonGroup speakergroup; 
	int volume = 100;
	Boolean speaker ;

	public Gui() {
		
		this.setLayout(new BorderLayout());
		screen = new JTextField();
		this.add(screen, BorderLayout.NORTH);
		
		speakeron = new JRadioButton("On");speakeron.addActionListener(this);
		speakeroff = new JRadioButton("Off");speakeroff.addActionListener(this);
		speakergroup = new ButtonGroup();
		speakergroup.add(speakeron);
		speakergroup.add(speakeroff);
		
		JPanel speakerpanel = new JPanel();
		speakerpanel.setLayout(new GridLayout(2, 1));
		speakerpanel.add(speakeron);
		speakerpanel.add(speakeroff);
		
		this.add(speakerpanel, BorderLayout.EAST);
		speakerpanel.setBorder(BorderFactory.createTitledBorder( 
			BorderFactory.createEtchedBorder(), "Speaker"));   
		
		volumeup = new JButton("Up");volumeup.addActionListener(this);
		volumedown = new JButton("Down");volumedown.addActionListener(this);

		JPanel volumepanel = new JPanel();
		volumepanel.setLayout(new GridLayout(2,1));
		volumepanel.add(volumeup);
		volumepanel.add(volumedown);
		this.add(volumepanel, BorderLayout.WEST);
		volumepanel.setBorder(BorderFactory.createTitledBorder( 
		BorderFactory.createEtchedBorder(), "Volume"));   
		
		
		
		//JButton zero, one, two, three, four, five, six, seven, eight, nine, star, htag; 
		zero = new JButton("0");zero.addActionListener(this);
		one = new JButton("1"); one.addActionListener(this);
		two = new JButton("2"); two.addActionListener(this);
		three = new JButton("3"); three.addActionListener(this);
		four = new JButton("4"); four.addActionListener(this);
		five = new JButton("5"); five.addActionListener(this);
		six = new JButton("6"); six.addActionListener(this);
		seven = new JButton("7"); seven.addActionListener(this);
		eight = new JButton("8"); eight.addActionListener(this);
		nine = new JButton("9"); nine.addActionListener(this);
		star = new JButton("*"); star.addActionListener(this);
		htag = new JButton("#"); htag.addActionListener(this);



		JPanel digitspanel = new JPanel();
		digitspanel.setLayout(new GridLayout(4,3));
		digitspanel.add(zero);
		digitspanel.add(one);
		digitspanel.add(two);
		digitspanel.add(three);
		digitspanel.add(four);
		digitspanel.add(five);
		digitspanel.add(six);
		digitspanel.add(seven);
		digitspanel.add(eight);
		digitspanel.add(star);
		digitspanel.add(nine);
		digitspanel.add(htag);
		this.add(digitspanel, BorderLayout.CENTER);

		
		
		makecall = new JButton("Make a call");makecall.addActionListener(this);
		
		this.add(makecall, BorderLayout.SOUTH);
		 this.setTitle("Phone Application");
		 this.setSize(400,400);
		 this.setVisible(true);
		 this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
		 
		 
		 
	}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==zero) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"0");
	}
	if(e.getSource()==one) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"1");
	}if(e.getSource()==two) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"2");
	}if(e.getSource()==three) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"3");
	}if(e.getSource()==four) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"4");
	}if(e.getSource()==five) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"5");
	}if(e.getSource()==six) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"6");
	}if(e.getSource()==seven) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"7");
	}if(e.getSource()==eight) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"8");
	}if(e.getSource()==nine) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"9");
	}if(e.getSource()==htag) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"#");
	}if(e.getSource()==star) {
		String oldScreenValue = screen.getText();
		screen.setText(oldScreenValue+"*");
	}
	
	if (e.getSource()== makecall) {
		int n = JOptionPane.showConfirmDialog(this,"Would you like to call the number?", "Confirmation", JOptionPane.YES_NO_OPTION);
		System.out.println();
		if(n==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "Your call is being forwarded");
		}
	}
	if(e.getSource() == volumeup) {
		volume++;
		JOptionPane.showMessageDialog(this,"Volume is " + volume);
		
	}if(e.getSource() == volumedown) {
		volume--;
		JOptionPane.showMessageDialog(this,"Volume is " + volume);
	}if(e.getSource() == speakeron) {
		speaker = true;
		JOptionPane.showMessageDialog(this, "Speaker is on");
	}if(e.getSource() == speakeroff) {
		speaker = false;
		JOptionPane.showMessageDialog(this, "Speaker is off");
	}
}
	
	public static void main(String[]args) {
		
		// TODO Auto-generated method stub
		new Gui();
		
		
	}

}
