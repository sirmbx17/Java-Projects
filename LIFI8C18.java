/************************************************************************************************************
 * Sirak Berhane
 * #1485447
 *  Create a JFrame window
 *  Display 5 buttons showing 1 color each in a random order from the choices: Red, Blue, Yellow, Green, White
 *  Ensure no color name is duplicated
 *  Background color should change depending on which button was clicked and which color name was on that button
 *  I recommend a loop to NOT pick the same color for button 2 after button 1 color was chosen.
 *  The same for the remaining buttons
 *  Mimic the same session precisely. Pay attention to colors of the window and label *
 * ************************************************************************************************************/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class LiFiUnit8Ch18 {

    public static Color colors[]={Color.RED,Color.YELLOW,Color.WHITE,Color.GREEN,Color.BLUE}; // set color fields

    static class MyFrame extends JFrame
    {

        MyFrame() // creates a frame
        {
            setBounds(300,0,500,300); // set frame parameter
            this.setTitle("Color changing frame"); // set display title


            this.setLayout(new GroupLayout(this.getContentPane()));
            JButton X1=new JButton();
            X1.setText("Red");
            X1.setBounds(0,20,100,30);
            this.getContentPane().add(X1);
            X1.addActionListener(new ActionListener() {

                //set backgorund color based on selection
                @Override
                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(Color.RED);
                }
            });



            JButton X2=new JButton(); // creates a button
            X2.setText("Yellow");
            X2.setBounds(100,20,100,30);
            this.getContentPane().add(X2);
            X2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(Color.YELLOW);
                }
            });

            JButton X3=new JButton();
            X3.setText("White"); // sets button name
            X3.setBounds(200,20,100,30);
            this.getContentPane().add(X3);
            X3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(Color.WHITE);
                }
            });

            JButton X4=new JButton();
            X4.setText("Green");
            X4.setBounds(300,20,100,30); // sets scale for button frame
            this.getContentPane().add(X4);
            X4.addActionListener(new ActionListener() {

                @Override

                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(Color.GREEN);
                }//set background based on color
            });

            JButton X5=new JButton();
            X5.setText("Blue");
            X5.setBounds(400,20,100,30);
            this.getContentPane().add(X5);
            X5.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(Color.BLUE);
                }
            });

        }
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Random R =new Random(); // randomize color
                int M;
                M = Math.abs(R.nextInt()%5);
                new MyFrame().setVisible(true);
            }
        });

    } // end of main


}// end of class
