package abhishek.learn;

import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame{
    checkbox(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                System.out.println("bye!!");
            }
        });
    }
    public static void main(String args[]){
        checkbox c = new checkbox();
        c.setSize(500,500);
        c.setTitle("CHECKBOX");
        c.setVisible(true);
        c.setLayout(null);
        Checkbox c1 = new Checkbox("sahi h",true);//checkbox1
        c1.setBounds(220,120,60,30);
        c.add(c1);
        Checkbox c2,c3;//checbox 2 and 3
        c2 = new Checkbox("not true");
        c2.setBounds(220,220,60,30);
        c.add(c2);
        c3 = new Checkbox("tera bhi sahi h",true);
        c3.setBounds(220,320,110,30);
        c.add(c3);
    }
}