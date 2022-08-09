//Import All
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.awt.event.InputEvent;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class ThirteenColoniesMap extends JPanel implements MouseListener
{      
   //The variables that track the mouse's coordinates
   int mouse_x=0;
   int mouse_y=0;
   public static void main(String[] args)
   {  
      //Makes the panel/frame
      JFrame frame = new JFrame("RobotTest");
      frame.setSize(800, 800);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	   frame.setContentPane(new ThirteenColoniesMap());
      frame.setVisible(true);
      
      //Adds ThirteenColoniesMap
      ThirteenColoniesMap m = new ThirteenColoniesMap();
      
      //Adds a MouseListener
      frame.addMouseListener(m);
      
      //Adds instruction panel
      String introText = """
      Welcome to the Thirteen Colonies simulator.
      Click on each of the colonies to learn more about them.
      Click on the background to see this information again.
      Please avoid reshaping or repositioning the panel in order to ensure functionality.""";
      JOptionPane.showMessageDialog(null, introText, "Instructions", JOptionPane.PLAIN_MESSAGE);
   }
   
   //If the MouseListener hears a click, the following is executed 
   public void mouseClicked(MouseEvent e)
   {
      try 
      {
          //Initializes all the information needed to detect the color of a mouse click
          //Initializes Robot for color detection
          Robot robot = new Robot();
          //Detects mouse's x and y coordinates
          int mouse_x=e.getX();
          int mouse_y=e.getY();
          //Sets a variable equal to the detected color
          Color color = robot.getPixelColor((int)mouse_x,(int)mouse_y);
          
          //All 13 if statements for each of the colonies (each If statement creates a new popup panel)
          //Within each If statement is the code for the creation of a new object in Colony class that bears the state information
          //Georgia
          if(color.getRed()==240 && color.getGreen()==23 && color.getBlue()==23) 
          {
            Colony georgia = new Colony("""
            Founder: James Edward Ogelthorpe
            Year of Founding: 1732
            Founding Country: Spain, England
            """);
            JOptionPane.showMessageDialog(null, georgia.Info, "Georgia", JOptionPane.PLAIN_MESSAGE);
          }
          //SouthCarolina
          if(color.getRed()==23 && color.getGreen()==240 && color.getBlue()==222) 
          {
            Colony southCarolina = new Colony("""
            Founder(s): Eight Nobles with a Royal Charter from Charles II
            Year of Founding: 1633
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, southCarolina.Info, "South Carolina", JOptionPane.PLAIN_MESSAGE);
          }
          //NorthCarolina
          if(color.getRed()==23 && color.getGreen()==56 && color.getBlue()==240) 
          {
            Colony northCarolina = new Colony("""
            Founder(s): Nathaniel Batts and other colonists from Virginia
            Year of Founding: 1653
            Founding Country: England; Virginia Colony
            """);
            JOptionPane.showMessageDialog(null, northCarolina.Info, "North Carolina", JOptionPane.PLAIN_MESSAGE);
          }
          //Virginia
          if(color.getRed()==240 && color.getGreen()==23 && color.getBlue()==229)
          {
            Colony virginia = new Colony("""
            Founder(s): Walter Raleigh, John Smith
            Year of Founding: 1606
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, virginia.Info, "Virginia", JOptionPane.PLAIN_MESSAGE);
          }
          //Maryland
          if(color.getRed()==23 && color.getGreen()==240 && color.getBlue()==41)
          {
            Colony maryland = new Colony("""
            Founder(s): Lord Baltimore
            Year of Founding: 1632
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, maryland.Info, "Maryland", JOptionPane.PLAIN_MESSAGE);
          }
          //Delaware
          if(color.getRed()==11 && color.getGreen()==99 && color.getBlue()==153)
          {
            Colony delaware = new Colony("""
            Founder(s): Peter Minuit and the New Sweden Company
            Year of Founding: 1638
            Founding Country: Netherlands, Sweden
            """);
            JOptionPane.showMessageDialog(null, delaware.Info, "Delaware", JOptionPane.PLAIN_MESSAGE);
          }
          //Pennsylvania
          if(color.getRed()==11 && color.getGreen()==93 && color.getBlue()==75)
          {
            Colony pennsylvania = new Colony("""
            Founder(s): William Penn
            Year of Founding: 1682
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, pennsylvania.Info, "Pennsylvania", JOptionPane.PLAIN_MESSAGE);
          }
          //New Jersey
          if(color.getRed()==87 && color.getGreen()==19 && color.getBlue()==212)
          {
           Colony newJersey = new Colony("""
            Founder(s): Lord Berkeley and Sir George Carteret
            Year of Founding: 1664
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, newJersey.Info, "New Jersey", JOptionPane.PLAIN_MESSAGE);
          }
          //New York
          if(color.getRed()==241 && color.getGreen()==148 && color.getBlue()==19)
          {
            Colony newYork = new Colony("""
            Founder(s): Duke of York
            Year of Founding: 1664
            Founding Country: Netherlands
            """);
            JOptionPane.showMessageDialog(null, newYork.Info, "New York", JOptionPane.PLAIN_MESSAGE);
          }
          //Connecticut
          if(color.getRed()==145 && color.getGreen()==73 && color.getBlue()==145)
          {
            Colony connecticut = new Colony("""
            Founder(s): Thomas Hooker
            Year of Founding: 1636
            Founding Country: Netherlands
            """);
            JOptionPane.showMessageDialog(null, connecticut.Info, "Connecticut", JOptionPane.PLAIN_MESSAGE);
          }
          //Rhode Island
          if(color.getRed()==232 && color.getGreen()==95 && color.getBlue()==53)
          {
            Colony rhodeIsland = new Colony("""
            Founder(s): Roger Williams
            Year of Founding: 1636
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, rhodeIsland.Info, "Rhode Island", JOptionPane.PLAIN_MESSAGE);
          }
          //New Hampshire
          if(color.getRed()==123 && color.getGreen()==173 && color.getBlue()==244)
          {
            Colony newHampshire = new Colony("""
            Founder(s): John Mason
            Year of Founding: 1623
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, newHampshire.Info, "New Hampshire", JOptionPane.PLAIN_MESSAGE);
          }
          //Massachusetts
          if(color.getRed()==215 && color.getGreen()==241 && color.getBlue()==19)
          {
            Colony massachusetts = new Colony("""
            Founder(s): John Winthrop, William Bradford
            Year of Founding: 1630
            Founding Country: England
            """);
            JOptionPane.showMessageDialog(null, massachusetts.Info, "Massachusetts", JOptionPane.PLAIN_MESSAGE);
          }
          
          //Allows for clicking the background to return to the instruction panel
          if(color.getRed()==238 && color.getGreen()==238 && color.getBlue()==238)
          {
            JOptionPane.showMessageDialog(null, """
            Welcome to the Thirteen Colonies simulator.
            Click on each of the colonies to learn more about them.
            Click on the background to see this information again.
            Please avoid reshaping or repositioning the panel in order to ensure functionality.""", "Instructions", JOptionPane.PLAIN_MESSAGE);
          }
      }
      catch (Exception evt) 
      {
          System.err.println(evt.getMessage());
      }

   }
   //Creates the image and all other graphics
   public void paintComponent(Graphics g) 
   {  
      //Paints all the Graphical Components such as text, lines, and images
      ImageIcon img = new ImageIcon("13Colonies4transparent.png");
      g.drawImage(img.getImage(), 100, 40, 571, 714, null);
      g.setFont(new Font("Serif",Font.BOLD, 65));
      g.setColor(Color.BLACK);
      g.drawString("The Thirteen Colonies", 70, 60);
      g.setFont(new Font("Serif",Font.BOLD, 45));
      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial",Font.BOLD, 20));
      g.setColor(Color.RED);
      g.drawString("*Please don't reshape or reposition the panel!", 10, 750);
      g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      g.setColor(Color.GREEN.darker());
      g.setFont(new Font("Serif",Font.BOLD, 40));
      g.setColor(Color.BLACK);
   }  

   //All other unused MouseListener MouseEvents 
   public void mousePressed(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   

}