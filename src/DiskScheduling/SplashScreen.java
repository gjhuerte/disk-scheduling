/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiskScheduling;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Zero
 */
public class SplashScreen extends JWindow {
    // SplashScreen.java
// A simple application to show a title screen in the center of the screen
// for the amount of time given in the constructor.  This class includes
// a sample main() method to test the splash screen, but it's meant for use
// with other applications.
//
  private int duration;
  public SplashScreen(int d) {
    duration = d;
  }

  // A simple little method to show a title screen in the center
  // of the screen for the amount of time given in the constructor
  public void showSplash() {
    JPanel content = (JPanel)getContentPane();
    content.setBackground(Color.white);

    // Set the window's bounds, centering the window
    int width = 450;
    int height =115;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    setBounds(x,y,width,height);

    // Build the splash screen
    JLabel copyrt = new JLabel("Disk Scheduling", JLabel.CENTER);
    copyrt.setFont(new Font("Times New Roman", Font.BOLD,40));
	JLabel copyrt2 = new JLabel("A Project in Operating System", JLabel.CENTER);
    copyrt2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    content.add(copyrt, BorderLayout.CENTER);
    content.add(copyrt2, BorderLayout.SOUTH);
    Color oraRed = new Color(0,51,51);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

    // Display it
    setVisible(true);

    // Wait a little while, maybe while loading resources
    try { Thread.sleep(duration); } catch (Exception e) {}

  }

  public void showSplashAndExit() {
    showSplash();
    dispose();
  }
}
   
