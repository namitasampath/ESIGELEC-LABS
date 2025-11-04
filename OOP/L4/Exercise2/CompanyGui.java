package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompanyGui extends JFrame implements ActionListener {
    JTextField name, address, noOfEmployees;
    JButton validate;
    Label lName, lAddress, lNoOfEmployees;
    static int current,total;

    public CompanyGui() {
        this.setLayout(new GridLayout(4, 2, 10, 10));

        lName = new Label("Name:");
        name = new JTextField();

        lAddress = new Label("Address:");
        address = new JTextField();

        lNoOfEmployees = new Label("No of Employees:");
        noOfEmployees = new JTextField();
        
        validate = new JButton("Validate");
        validate.addActionListener(this);

        this.add(lName);
        this.add(name);

        this.add(lAddress);
        this.add(address);

        this.add(lNoOfEmployees);
        this.add(noOfEmployees);

        this.add(validate);

        this.setTitle("Company");
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
@Override
public void actionPerformed(ActionEvent e) {
	if (noOfEmployees.getText().isEmpty()||name.getText().isEmpty() || address.getText().isEmpty()) {
		JOptionPane.showMessageDialog(this, "Please fill all details");

	}else {
		try {
        total = Integer.parseInt(noOfEmployees.getText());
        current = 1;
        JOptionPane.showMessageDialog(this, "Enter details for employee 1");
        this.dispose();
        new EmployeeGui();
    } 
	catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for employees");
		}
	}
}
    public static void main(String[] args) {
        new CompanyGui();
        
    }
}
