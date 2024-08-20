package Lambda.LambdaThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWindowNew {
    public static void main(String[] args) {

        //window : object of JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());



        //Create button and add jframe

        JButton button = new JButton("Click Me !!");
    // We are Using lambda Expression
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null, "Hey, Button is clicked");
        });

        frame.add(button);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
