package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton next,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("welcome "+name+" to simple minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. Choose the quiz you want to attempt" + "<br><br>" +
                "2. you have only 15 sec to attempt a question" + "<br><br>" +
                "3. you have 50:50 life line you can use it only once" + "<br><br>" +
                "4. submit button will only be visible after the completion of questions" + "<br><br>" +
                "5. If you are done with the visible question then click on next question" + "<br><br>" +
                "6. questions will be of sequential mode" + "<br><br>" +
                "7. if you are ready click on ready button" +  "<br><br>" +
            "<html>"
        );
        add(rules);
        
       
        
        back =new JButton("back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
         
        next =new JButton("next");
        next.setBounds(400, 500, 100, 30);
        next.setBackground(new Color(30,144,254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        setSize(700,600);
        setLocation(300,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==next){
            setVisible(false);
            new selectquiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("user");
    }
}
