//SignUp Form 1

package bank.management.system;
import java.awt.*;
import javax.swing.*; //contains JFrame class
import java.util.*;//to use random package
import com.toedter.calendar.JDateChooser; //to use calendar for Date of Birth
import java.awt.event.*;//to implement actionlistener interface 
public class SignupOne extends JFrame implements ActionListener //to use size location and visibility methods
{
    long random;
    JTextField nametextfield,fnametextfield,emailtextfield,addresstextfield,citytextfield,statetextfield,pincodetextfield;
    JButton next;
    JRadioButton male,female,others,married,unmarried,other;
    JDateChooser datechooser;
    SignupOne()
   {
       setLayout(null);//by default the setBounds is centred Layout . We need to null it
       Random ran=new Random();//to generate random form nos .
       random=Math.abs((ran.nextLong()%9000L)+1000L);//Since at first form nos were random alphanumeric keys , we will apply method .nextLong which will give val in Long. Long vals are giving very long values to cut short them we will mod it with 9000L and then add 1000L into it . Stil it is giving a negative val so we wll use math.abs which will give absolute val terminating the negative character from the No generated 
       JLabel formno=new JLabel("APPLICATION FORM NO. "+random);//creating a label for Applc No and passing the value of random into it
       formno.setFont(new Font("Raleway",Font.BOLD,38));//formatting the formno
       formno.setBounds(140,20,600,40);//postining of formno
       add(formno);
       
       JLabel PersonalDetails=new JLabel("Page 1: Personal Details");//creating a label for personal details 
       PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));//formatting the Label
       PersonalDetails.setBounds(290,80,400,30);//postining of label
       add(PersonalDetails);
       
       JLabel name=new JLabel("Name:");//creating a label for name 
       name.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       name.setBounds(100,140,100,30);//postining of label
       add(name);
       
       nametextfield=new JTextField(); //Creating object for adding textfield to the label
       nametextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       nametextfield.setBounds(300,140,400,30);
       add(nametextfield);
       
       JLabel fname=new JLabel("Father's Name:");//creating a label for Father's name 
       fname.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       fname.setBounds(100,190,200,30);//postining of label
       add(fname);
       
       fnametextfield=new JTextField(); //Creating object for adding textfield to the label
       fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       fnametextfield.setBounds(300,190,400,30);
       add(fnametextfield);
       
       JLabel dob=new JLabel("Date of Birth:");//creating a label for DOB
       dob.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       dob.setBounds(100,240,200,30);//postining of label
       add(dob);
       
       datechooser=new JDateChooser();//object creation for date chooser
       datechooser.setBounds(300,240,400,30);//Formatting datechooser
       add(datechooser);
       
       JLabel gender=new JLabel("Gender:");//creating a label for Gender
       gender.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       gender.setBounds(100,290,200,30);//postining of label
       add(gender);
       
       male=new JRadioButton("Male");//to set Value for RadioButton
       male.setBounds(300,290,120,30);//positioning the Radio Button
       male.setBackground(Color.WHITE);
       add(male);
       
       female=new JRadioButton("Female");//to set Value for RadioButton
       female.setBounds(450,290,120,30);//positioning the Radio Button
       female.setBackground(Color.WHITE);
       add(female);
       
      
       
       others=new JRadioButton("Others");//to set Value for RadioButton
       others.setBounds(600,290,120,30);//positioning the Radio Button
       others.setBackground(Color.WHITE);
       add(others);
       
       ButtonGroup gendergroup=new ButtonGroup(); //to group radio buttons to avoid redundancy while selecting an option
       gendergroup.add(male);
       gendergroup.add(female);
       gendergroup.add(others);
       
       JLabel email=new JLabel("Email Address:");//creating a label for Email ID 
       email.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       email.setBounds(100,340,200,30);//postining of label
       add(email);
       
       emailtextfield=new JTextField(); //Creating object for adding textfield to the label
       emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       emailtextfield.setBounds(300,340,400,30);
       add(emailtextfield);
       
       JLabel marital=new JLabel("Marital Status:");//creating a label for Marital Status
       marital.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       marital.setBounds(100,390,200,30);//postining of label
       add(marital);
       
       married=new JRadioButton("Married");//to set Value for RadioButton
       married.setBounds(300,390,100,30);//positioning the Radio Button
       married.setBackground(Color.WHITE);
       add(married);
       
      
       
       unmarried=new JRadioButton("Unmarried");//to set Value for RadioButton
       unmarried.setBounds(450,390,100,30);//positioning the Radio Button
       unmarried.setBackground(Color.WHITE);
       add(unmarried);
       
       other=new JRadioButton("Others");//to set Value for RadioButton
       other.setBounds(600,390,100,30);//positioning the Radio Button
       other.setBackground(Color.WHITE);
       add(other);
       
       ButtonGroup maritalgroup=new ButtonGroup(); //to group radio buttons to avoid redundancy while selecting an option
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);
       
       JLabel address=new JLabel("Address:");//creating a label for Address
       address.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       address.setBounds(100,440,200,30);//postining of label
       add(address);
       
       addresstextfield=new JTextField(); //Creating object for adding textfield to the label
       addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       addresstextfield.setBounds(300,440,400,30);
       add(addresstextfield);
       
       JLabel city=new JLabel("City:");//creating a label for City
       city.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       city.setBounds(100,490,200,30);//postining of label
       add(city);
       
       citytextfield=new JTextField(); //Creating object for adding textfield to the label
       citytextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       citytextfield.setBounds(300,490,400,30);
       add(citytextfield);
       
       JLabel state=new JLabel("State:");//creating a label for State
       state.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       state.setBounds(100,540,200,30);//postining of label
       add(state);
       
       statetextfield=new JTextField(); //Creating object for adding textfield to the label
       statetextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       statetextfield.setBounds(300,540,400,30);
       add(statetextfield);
       
       JLabel pincode=new JLabel("Pin Code:");//creating a label for Pin code
       pincode.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       pincode.setBounds(100,590,200,30);//postining of label
       add(pincode);
       
       pincodetextfield=new JTextField(); //Creating object for adding textfield to the label
       pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       pincodetextfield.setBounds(300,590,400,30);
       add(pincodetextfield);
       
       next=new JButton("Next");// Creating a Button to submit the details and move to next page
       next.setBackground(Color.BLACK);//setting bg color of button
       next.setForeground(Color.WHITE);//setting fg color of button
       next.setFont(new Font("Raleway",Font.BOLD,14));//formatting the button
       next.setBounds(620, 660,80,30);//positioning the button
       next.addActionListener(this);//to get action on clicking next button
       add(next);
       
       getContentPane().setBackground(Color.WHITE);//getcontentPane gives the whole pane and allows modification in the whole frame using various other methods
       setSize(850,800); //setting size for the frame of signup page
       setLocation(350,10);//to set the location of SignupOne
       setVisible(true);//visibility is false bydefault . we need to make it true
   }
    public void actionPerformed(ActionEvent ae)//overriding method so that event can be liststened by Actionlistener and action can be performed
    {
        String formno=""+random; //since formno is a long val we add "" and concat it to convert it into string
        String name=nametextfield.getText();//to get the values out of the nametextfield
        String fname=fnametextfield.getText();//to get the values out of the fnametextfield
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected())
        {
            gender="Male";
        }   else if(female.isSelected())
                {
                    gender="Female";
        }
        else if(others.isSelected())
        {
            gender="Others";
        }
        String email=emailtextfield.getText();
        String marital=null;
        if(married.isSelected())
        {
            marital="Married";
        }
        else if(unmarried.isSelected())
        {
            marital="Unmarried";
        }
        else if(other.isSelected())
        {
            marital="Other";
        }
        String address=addresstextfield.getText();
        String city=citytextfield.getText();
        String state=statetextfield.getText();
        String pincode=pincodetextfield.getText();
        
        try
        {
           if(name.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Name is Required"); //popup message incase textfield is empty
               
           }
           else if(fname.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Father's Name is Required"); //popup message incase textfield is empty
           }
           else if(email.equals(""))
                   {
                       JOptionPane.showMessageDialog(null,"Email is Required"); //popup message incase textfield is empty
                   }
           else if(address.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Address is Required"); //popup message incase textfield is empty
           }
           else if(city.equals(""))
           {
              JOptionPane.showMessageDialog(null,"City Name is Required"); //popup message incase textfield is empty 
           }
           else if(state.equals(""))
           {
              JOptionPane.showMessageDialog(null,"State Name is Required"); //popup message incase textfield is empty  
           }
           else if(pincode.equals(""))
           {
                JOptionPane.showMessageDialog(null,"Pin Code is Required"); //popup message incase textfield is empty  
           }
           else{
               Conn c= new Conn();
               String query= " insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
               c.s.executeUpdate(query);//DML command to pass rhee query so that it can be executed this way queries will run in mysqlS
               setVisible(false);//closes 
               new SignupTwo(formno).setVisible(true);
           }
        }
        catch(Exception e)
        {
            
        }
        
    }
public static void main(String args[])
{
new SignupOne();
}
}

