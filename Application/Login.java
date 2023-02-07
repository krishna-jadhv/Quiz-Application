// package quize.Application;


import javax.swing.*;
// import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.event.*;
import java.awt.*;


public class Login extends JFrame implements ActionListener{

    /**
     * 
     */
    JButton rules, back;
    JTextField tfname;

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Image icon
        ImageIcon i1 = new ImageIcon("icons/login.jpeg");
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        //heading
        JLabel heading = new JLabel("Simple minds");//text
        heading.setBounds(750, 60, 300, 45);//font location
        heading.setFont(new Font("Serif", Font.BOLD, 40));//font type, font family
        heading.setForeground(new Color(30, 144, 254));//setting color
        add(heading);

        JLabel name = new JLabel("Enter Your name");//text
        name.setBounds(810, 150, 300, 20);//font location
        name.setFont(new Font("Times New Roman", Font.BOLD, 18));//font type, font family
        name.setForeground(new Color(30, 144, 254));//setting color
        add(name);


        //textfield
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 17));
        add(tfname);



        //Buttons
        // Rules button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        //Back button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 535);
        setLocation(200, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
            if(rules== ae.getSource()){
                String name = tfname.getText();
                setVisible(false);
                new Rules(name);
            }
            else if( back == ae.getSource()){
                setVisible(false);
            }
    }
    

    public static void main(String[] args) {
        new Login(); //anonmus object


    }
}
