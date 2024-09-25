package bank.management.system.proj;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2,r3,r4,r5;
    JButton Next;

    JTextField textName, textFName,textEmail,textAd,textCity,textPc,textState;

    JDateChooser dataChooser;

    Random ran = new Random();

    long first4 =(ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dataChooser = new JDateChooser();
        dataChooser.setForeground(new Color(105,105,105));
        dataChooser.setBounds(300,340,400,30);
        add(dataChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        r3 = new JRadioButton("Married");
        r3.setBackground(new Color(222,255,228));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(300,440,100,30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBackground(new Color(222,255,228));
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(420,440,100,30);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setBackground(new Color(222,255,228));
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBounds(540,440,100,30);
        add(r5);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(r3);
        group1.add(r4);
        group1.add(r5);


        JLabel labelAd = new JLabel("Address :");
        labelAd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAd.setBounds(100,490,200,30);
        add(labelAd);

        textAd = new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,14));
        textAd.setBounds(300,490,400,30);
        add(textAd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPc = new JLabel("Pin Code :");
        labelPc.setFont(new Font("Raleway",Font.BOLD,20));
        labelPc.setBounds(100,600,200,30);
        add(labelPc);

        textPc = new JTextField();
        textPc.setFont(new Font("Raleway",Font.BOLD,14));
        textPc.setBounds(300,600,400,30);
        add(textPc);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        Next = new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        Next.setBounds(620,710,80,30);
        add(Next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String DOB = ((JTextField)dataChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";

        }else if(r2.isSelected()){
            gender = "Female";

        }
        String email= textEmail.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "Married";

        }else if(r4.isSelected()){
            marital = "Unmarried";

        } else if (r5.isSelected()) {
            marital = "Other";
        }



        String address = textAd.getText();
        String city = textCity.getText();
        String pincode = textPc.getText();
        String state = textState.getText();

        try {
            if (name.isEmpty() || fname.isEmpty() || DOB.isEmpty() || gender == null || email.isEmpty() || marital == null || address.isEmpty() || city.isEmpty() || pincode.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields.");
            }else {
                Cone con1 = new Cone();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+DOB+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Signup();
            }
        });
    }
}