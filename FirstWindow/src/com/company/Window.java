package com.company;

import javax.swing.*;

public class Window extends JFrame {

    public void Window(){
        setTitle("My first window");
        setSize(500, 500);
        setLocationRelativeTo(null); //to pop it on the center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stop the program at click on X

        setVisible(true); //make it visible
    }


}
