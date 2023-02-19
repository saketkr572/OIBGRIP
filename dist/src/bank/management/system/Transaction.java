package bank.management.system;
import javax.swing.*;
import java.awt.*;//to use import class
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener
{
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;//declaring buttons globally so that we can use it in actionperformed
    String pinnumber;
    Transaction(String pinnumber)
    {
        this.pinnumber=pinnumber;
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//getting image from system
       Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);//scaling the image
       ImageIcon i3=new ImageIcon(i2);//passing it to ImageIcon class
       JLabel image=new JLabel(i3);//Pssing image to JLabel class to add it into the frame
       image.setBounds(0,0,900,900);//setting bounds of the image
       add(image);
       
       JLabel text=new JLabel("Please Select your Transaction");
       text.setBounds(215,300,700,35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       image.add(text);//image.text to display the text on the image
       
       deposit=new JButton("Deposit");
       deposit.setBounds(170,415,150,30);
       deposit.addActionListener(this);
       image.add(deposit);
       
       withdrawl=new JButton("Cash Withdrawl");
       withdrawl.setBounds(355,415,150,30);
       withdrawl.addActionListener(this);
       image.add(withdrawl);
       
       fastcash=new JButton("Fast Cash");
       fastcash.setBounds(170,450,150,30);
       fastcash.addActionListener(this);
       image.add(fastcash);
       
       ministatement=new JButton("Mini Statement");
       ministatement.setBounds(355,450,150,30);
       ministatement.addActionListener(this);
       image.add(ministatement);
       
       pinchange=new JButton("PIN Change");
       pinchange.setBounds(170,485,150,30);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
       balanceenquiry=new JButton("Balance Enquiry");
       balanceenquiry.setBounds(355,485,150,30);
       balanceenquiry.addActionListener(this);
       image.add(balanceenquiry);
       
       exit=new JButton("Exit");
       exit.setBounds(355,520,150,30);
       exit.addActionListener(this);
       image.add(exit);
       
       
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);//to remove above border of the frame
       setVisible(true);
       
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            System.exit(0);//to exit from the page
        }else if(ae.getSource()==deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash)
        {
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange)
        {
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement)
        {
            //setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new Transaction("");
    }
}
