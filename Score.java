package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton back,submit;
    Score(String name,int score){
        setBounds(600,200,750,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("imagequiz/wallpaper 1.jpg"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20, 80,300, 250);
        add(image);
        
        JLabel heading=new JLabel("Thank you"+" for playing simple minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.PLAIN,26));
        add(heading);
        
        JLabel lblscore=new JLabel("your score is "+score);
        lblscore.setBounds(400, 150, 350, 30);
        lblscore.setFont(new Font("Viner Hand ITC",Font.PLAIN,30));
        add(lblscore);
        
        submit=new JButton("Play again");
        submit.setBounds(430,250,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener((ActionListener) this);
        add(submit);
        
        back=new JButton("back");
        back.setBounds(430,300,120,30);
        back.setBackground(new Color(30,144,255));
        back.setForeground(Color.WHITE);
        back.addActionListener((ActionListener) this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==submit){
            setVisible(false);
            new Login ();
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Score("user",0);
    }

    
}
