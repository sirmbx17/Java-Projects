/**********************************************************************************************************************
 * Sirak Berhane
 * #1485447
 *  Utilize showMessageDialog to output the message shown in the sample at the bottom.
 *  A random color should be output with each run  Upon clicking OK  Create a JFrame window
 *  Set the background and label text color as shown in sample below
 *  Include a label asking to enter name (see sample) o Include a textfield to get input for name (see sample)
 *  Upon hitting “Enter” on the keyboard, output thank you message to include the name entered as per sample at bottom
 *  Use an inner class for the listener
 *  Mimic the same session precisely.
 *  Pay attention to colors of the window and label.
 ***********************************************************************************************************************/



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class LiFiUnit7Ch17 {

    private static Color colors[]={Color.RED,Color.WHITE,Color.YELLOW,Color.GREEN,Color.BLUE}; // sets color choices

    static class MyFrame extends JFrame
    {

        MyFrame(Color c)
        {
            setBounds(300,0,700,300); // sets the parameters for frame size
            this.setTitle("Color changing frame");
            this.setBackground(c);
            this.getContentPane().setBackground(c);
            JLabel b=new JLabel(); // sets box for user input
            b.setText("What is your name?");
            if(c==Color.GREEN)
                b.setForeground(Color.BLUE); // sets background color based on color
            else if(c==Color.RED)
                b.setForeground(Color.WHITE);
            else if(c==Color.WHITE)
                b.setForeground(Color.BLACK);
            else if(c==Color.BLUE)
                b.setForeground(Color.WHITE);
            else if(c==Color.YELLOW)
                b.setForeground(Color.BLACK);
            this.setLayout(new GroupLayout(this.getContentPane()));
            b.setBounds(200,20,200,30); // sets parameters for
            this.getContentPane().add(b);

            JTextField textF=new JTextField(); // creates a text field
            textF.setBounds(350,20,200,30);
            this.getContentPane().add(textF);

            textF.addActionListener(new ActionListener() { // set event handler for input


                public void actionPerformed(ActionEvent e) {
                    textF.setVisible(false);
                    b.setBounds(250,20,200,30);
                    b.setText("Thanks for playing "+textF.getText());

                }
            });
        }
    }


    public static void main(String[] args) {
        Random r=new Random();
        int n=Math.abs(r.nextInt()%5);// randomize color and get random color
        String Colorname[]={"Red","White","Yellow","Green","Blue"};
        JOptionPane.showMessageDialog(null,"The Folowing window color will be randomly choosen from\nRed,White,Yellow,Green,Blue\nEvery time the button is pressed.\n\nYour color will be: "+Colorname[n],"Message",1); // displays prompt
        java.awt.EventQueue.invokeLater(() -> new MyFrame(colors[n]).setVisible(true));

    } // end of main


} // end of class
