package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,850,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,710);
        add(image);
        JLabel text=new JLabel("Please Select Your Transaction");
        text.setBounds(220,230,600,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        deposit=new JButton("Deposit");
        deposit.setBounds(160,317,140,30);
        deposit.addActionListener(this);
        image.add(deposit);
        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(373,317,140,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(160,350,140,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        ministatement=new JButton("Mini Statement");
        ministatement.setBounds(373,350,140,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(160,383,140,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(373,383,140,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        exit=new JButton("Exit");
        exit.setBounds(373,416,140,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){
            
            new MiniStatement(pinnumber).setVisible(true);
        }
    }

    
    public static void main(String args[]) {
        new Transactions("").setVisible(true);
       
    }
}
