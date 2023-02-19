//SignUp Form 

package bank.management.system;
import java.awt.*;
import javax.swing.*; //contains JFrame class
import java.awt.event.*;//to implement actionlistener interface 
public class SignupTwo extends JFrame implements ActionListener  //to use size location and visibility methods
{
    
    JTextField pantextfield,aadhaartextfield;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox reli,cate,occ,edu,inc;
    String formno;
    SignupTwo(String formno)
   {
       this.formno=formno;
       setLayout(null);//by default the setBounds is centred Layout . We need to null it
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");//GIVING TITLE TO THE PAGE
       
       
       JLabel AdditionalDetails=new JLabel("Page 2: Additional Details");//creating a label for additional details 
       AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));//formatting the Label
       AdditionalDetails.setBounds(290,80,400,30);//postining of label
       add(AdditionalDetails);
       
       JLabel religion=new JLabel("Religion:");//creating a label for Religion
       religion.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       religion.setBounds(100,140,100,30);//postining of label
       add(religion);
       
       String valReligion[]={"Hindu","Muslim","Sikh","Christian","Buddhist","Jain","Jew"};//CREATING AN ARRAY OF RELIGIONS TO PASS
       reli = new JComboBox(valReligion);//creating object for using combobox class for Dropdown menuu in religion
       reli.setBounds(300,140,400,30);
       reli.setBackground(Color.WHITE);
       add(reli);
      
       JLabel category=new JLabel("Category");//creating a label for Category 
       category.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       category.setBounds(100,190,200,30);//postining of label
       add(category);
       
       String valcategory[]={"General","OBC","SC","ST","Others"};
       cate=new JComboBox(valcategory);
       cate.setBounds(300,190,400,30);
       cate.setBackground(Color.WHITE);
       add(cate);
       
       JLabel income=new JLabel("Income");//creating a label for income
       income.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       income.setBounds(100,240,200,30);//postining of label
       add(income);
       
       String incomecategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
       inc=new JComboBox(incomecategory);
       inc.setBounds(300,240,400,30);
       inc.setBackground(Color.WHITE);
       add(inc);
       
       JLabel education=new JLabel("Educational");//creating a label for Gender
       education.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       education.setBounds(100,290,200,30);//postining of label
       add(education);
       
       JLabel qualification=new JLabel("Qualification:");//creating a label for qualification
       qualification.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       qualification.setBounds(100,315,200,30);//postining of label
       add(qualification);
       
       String educationvalues[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate"};
       edu=new JComboBox(educationvalues);
       edu.setBounds(300,315,400,30);
       edu.setBackground(Color.WHITE);
       add(edu);
              
       JLabel occupation=new JLabel("Occupation:");//creating a label for Marital Status
       occupation.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       occupation.setBounds(100,390,200,30);//postining of label
       add(occupation);
       
       String occupationvals[]={"Salaried","Self-Employed","Bussinessman","Student","Retired","Others"};
       occ=new JComboBox(occupationvals);
       occ.setBounds(300,390,400,30);
       occ.setBackground(Color.WHITE);
       add(occ);
       
       
       JLabel pan=new JLabel("PAN Number:");//creating a label for PAN
       pan.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       pan.setBounds(100,440,200,30);//postining of label
       add(pan);
       
       pantextfield=new JTextField(); //Creating object for adding textfield to the label
       pantextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       pantextfield.setBounds(300,440,400,30);
       add(pantextfield);
       
       JLabel aadhaar=new JLabel("Aadhaar Number:");//creating a label for Aadhar no
       aadhaar.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       aadhaar.setBounds(100,490,200,30);//postining of label
       add(aadhaar);
       
       aadhaartextfield=new JTextField(); //Creating object for adding textfield to the label
       aadhaartextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       aadhaartextfield.setBounds(300,490,400,30);
       add(aadhaartextfield);
       
       JLabel seniorcitizen=new JLabel("Senior Citizen:");//creating a label for SC
       seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       seniorcitizen.setBounds(100,540,200,30);//postining of label
       add(seniorcitizen);
       
       syes=new JRadioButton("Yes");
       syes.setBounds(300,540,100,30);
       syes.setBackground(Color.WHITE);
       add(syes);
       
       sno=new JRadioButton("No");
       sno.setBounds(450,540,100,30);
       sno.setBackground(Color.WHITE);
       add(sno);
       
       ButtonGroup sc=new ButtonGroup();
       sc.add(syes);
       sc.add(sno);
       

       
       
       JLabel existingac=new JLabel("Existing Account:");//creating a label for existing a/c
       existingac.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       existingac.setBounds(100,590,200,30);//postining of label
       add(existingac);
       
       eyes=new JRadioButton("Yes");
       eyes.setBounds(300,590,100,30);
       eyes.setBackground(Color.WHITE);
       add(eyes);
       
       eno=new JRadioButton("No");
       eno.setBounds(450,590,100,30);
       eno.setBackground(Color.WHITE);
       add(eno);
       
       ButtonGroup ea=new ButtonGroup();
       ea.add(eyes);
       ea.add(eno);
       
       
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
        //String formno=""+formno; //since formno is a long val we add "" and concat it to convert it into string
        String religion=(String)reli.getSelectedItem();//to get the values out of Religion
        String category=(String)cate.getSelectedItem();//to get the values out of the Category
        String income = (String)inc.getSelectedItem();
        String education = (String)edu.getSelectedItem();
        String occupation=(String)occ.getSelectedItem();
        String seniorcitizen=null;
    
        if(syes.isSelected())
        {
            seniorcitizen="Yes";
        }   else if(sno.isSelected())
                {
                    seniorcitizen="No";
        }
        
        String existingac =null;
        if(eyes.isSelected())
        {
            existingac="Yes";
        }
        else if(eno.isSelected())
        {
            existingac="No";
        }
        
        String aadhaar=aadhaartextfield.getText();
        String pan=pantextfield.getText();
        
        try
        {
           if(pan.equals(""))
           {
               JOptionPane.showMessageDialog(null,"PAN No is Required"); //popup message incase textfield is empty
               
           }
           else if(aadhaar.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Aadhaar No is Required"); //popup message incase textfield is empty
           }
          
           else{
               Conn c= new Conn();
               String query= " insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhaar+"','"+seniorcitizen+"','"+existingac+"')";
               
               c.s.executeUpdate(query);//DML command to pass rhee query so that it can be executed this way queries will run in mysqlS
              // signup3
              setVisible(false);
              new signupThree(formno).setVisible(true);
           }
        }
        catch(Exception e)
        {
           
        }
        
    }
public static void main(String args[])
{
new SignupTwo("");
}
}

