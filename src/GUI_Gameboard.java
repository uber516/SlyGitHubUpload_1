import javax.swing.*;

import javax.swing.JFrame;



public class GUI_Gameboard {




        public static void main(String s[]) {
        Maze maze = new Maze();


            JFrame frame = new JFrame("JFrame Example");
            //frame.setSize(200, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            System.out.println();

        }



    private JPanel Sly_App;
    private JPanel Sly;



}
