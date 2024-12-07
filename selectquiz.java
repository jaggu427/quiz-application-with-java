package quizapplication;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class selectquiz extends JFrame implements ActionListener{
    JButton python,java,sql,back;
    String name;
    selectquiz(String name){
        this.name=name;
        setSize(600,350);
        setLocation(350,100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        python =new JButton("python");
        python.setBounds(250, 50, 100, 30);
        python.setBackground(new Color(30,144,254));
        python.setForeground(Color.WHITE);
        python.addActionListener(this);
        add(python);
        
        java =new JButton("java");
        java.setBounds(250, 100, 100, 30);
        java.setBackground(new Color(30,144,254));
        java.setForeground(Color.WHITE);
        java.addActionListener(this);
        add(java);
        
        sql =new JButton("sql");
        sql.setBounds(250, 150, 100, 30);
        sql.setBackground(new Color(30,144,254));
        sql.setForeground(Color.WHITE);
        sql.addActionListener(this);
        add(sql);
        
        back =new JButton("back");
        back.setBounds(250, 200, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== python){
            new Quizpython(name);
            setVisible(false);
        }else if(ae.getSource()==java){
            new Quizjava(name);
            setVisible(false);
        }else if(ae.getSource()==sql){
            new Quizsql(name);
            setVisible(false);
        }else if(ae.getSource()==back){
            setVisible(false);
            new Rules(name);
        }
    }
    public static void main(String [] args){
        new selectquiz("user");
    }
}
