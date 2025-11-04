package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeGui extends JFrame implements ActionListener{
    JTextField name, age;
    JButton bankAccount;
    Label lName, lAge;

    public EmployeeGui() {
        this.setLayout(new GridLayout(3, 2, 10, 10)); 

        lName = new Label("Name:");
        name = new JTextField();

        lAge = new Label("Age:");
        age = new JTextField();

        bankAccount = new JButton("Bank Account");
        bankAccount.addActionListener(this);

        this.add(lName);
        this.add(name);

        this.add(lAge);
        this.add(age);
        
        this.add(bankAccount);

        this.setTitle("Employee");
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {


    	if(name.getText().isEmpty()||age.getText().isEmpty()) {
    		  JOptionPane.showMessageDialog(this, "Please fill all details");
        } else {
            try {
                Integer.parseInt(age.getText());
                this.dispose();
                new BankAccountGui();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Age must be a number");
            }
    	}
    }
}
