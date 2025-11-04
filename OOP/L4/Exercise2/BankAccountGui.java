package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountGui extends JFrame implements ActionListener {
    JTextField bankAccount, balance;
    JButton save;
    Label lBank, lBalance;

    public BankAccountGui() {
        this.setLayout(new GridLayout(3, 2, 10, 10));

        lBank = new Label("Bank Account:");
        bankAccount = new JTextField();

        lBalance = new Label("Balance:");
        balance = new JTextField();

        save = new JButton("Save");
        save.addActionListener(this);

        this.add(lBank); this.add(bankAccount);
        this.add(lBalance); this.add(balance);
        this.add(save);

        this.setTitle("Bank Account (Employee " + CompanyGui.current + ")");
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bankAccount.getText().isEmpty() || balance.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all details");
        } else {
            try {
                Double.parseDouble(balance.getText()); // check valid number
                JOptionPane.showMessageDialog(this, "Bank Account saved for Employee " + CompanyGui.current);

                if (CompanyGui.current < CompanyGui.total) {
                    CompanyGui.current++;
                    this.dispose();
                    new EmployeeGui();
                } else {
                    JOptionPane.showMessageDialog(this, "All employees entered!");
                    this.dispose();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Balance must be a number");
            }
        }
    }
}
