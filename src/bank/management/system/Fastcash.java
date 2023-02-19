package bank.management.system;
import javax.swing.*;
import java.awt.*;//to use import class
import java.awt.event.*;
import java.sql.*;//to use result set
import java.util.Date;//to use date package
public class Fastcash extends JFrame implements ActionListener
{
    JButton rs100,rs500,rs1000,rs2000,rs5000,rs10000,back;//declaring buttons globally so that we can use it in actionperformed
    String pinnumber;
    Fastcash(String pinnumber)
    {
       this.pinnumber=pinnumber;
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//getting image from system
       Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);//scaling the image
       ImageIcon i3=new ImageIcon(i2);//passing it to ImageIcon class
       JLabel image=new JLabel(i3);//Pssing image to JLabel class to add it into the frame
       image.setBounds(0,0,900,900);//setting bounds of the image
       add(image);
       
       JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
       text.setBounds(215,300,700,35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       image.add(text);//image.text to display the text on the image
       
       rs100=new JButton("Rs 100");
       rs100.setBounds(170,415,150,30);
       rs100.addActionListener(this);
       image.add(rs100);
       
       rs500=new JButton("Rs 500");
       rs500.setBounds(355,415,150,30);
       rs500.addActionListener(this);
       image.add(rs500);
       
       rs1000=new JButton("Rs 1000");
       rs1000.setBounds(170,450,150,30);
       rs1000.addActionListener(this);
       image.add(rs1000);
       
       rs2000=new JButton("Rs 2000");
       rs2000.setBounds(355,450,150,30);
       rs2000.addActionListener(this);
       image.add(rs2000);
       
       rs5000=new JButton("Rs 5000");
       rs5000.setBounds(170,485,150,30);
       rs5000.addActionListener(this);
       image.add(rs5000);
       
       rs10000=new JButton("Rs 10000");
       rs10000.setBounds(355,485,150,30);
       rs10000.addActionListener(this);
       image.add(rs10000);
       
       back=new JButton("BACK");
       back.setBounds(355,520,150,30);
       back.addActionListener(this);
       image.add(back);
       
       
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);//to remove above border of the frame
       setVisible(true);
       
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else 
        {
            String amount = ((JButton)ae.getSource()).getText().substring(3);//get the amount and typecast it with button type so that it can be checked later. Substring the value by 3 charcaters so that rs and space can be cut from the string
            Conn c=new Conn();
            try{
                ResultSet rs= c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance=0;
                while(rs.next()) //next helps in getting rows one by one
                {
                    if(rs.getString("type").equals("Deposit"))
                            {
                              balance +=Integer.parseInt(rs.getString("amount"));
                            }else 
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!= back && balance<Integer.parseInt(amount))//if user has not clicked back and balance to be debited is still less than balance
                {
                   JOptionPane.showMessageDialog(null,"Insufficient Balance");
                   return;
                }
                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+ "Debited Successfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        new Fastcash("");
    }
}
