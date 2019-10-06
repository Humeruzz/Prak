package Prak4;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JTextField jta = new JTextField(8);
    Font fnt = new Font("Times new roman", Font.BOLD,20);


    Window(){
        super("Text");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.BLUE);
        jta.setFont(fnt);
        setVisible(true);
    }
}
