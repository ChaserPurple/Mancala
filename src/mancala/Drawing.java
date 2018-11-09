package mancala;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;

public class Drawing {
    private static Graphics2D g;
    private static Mancala mainClassInst;

    public static void setDrawingInfo(Graphics2D _g,Mancala _mainClassInst) 
    {
        g = _g;
        mainClassInst = _mainClassInst;
    }
////////////////////////////////////////////////////////////////////////////
     public static void drawImage(Image image,int xpos,int ypos,double rot,double xscale,double yscale) 
    {
        int width = image.getWidth(mainClassInst);
        int height = image.getHeight(mainClassInst);
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,-width/2,-height/2,width,height,mainClassInst);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
    /////////////////////////////////////////////////////////////////////////
    public static void drawScreen()
    {
        Color clickedColor = new Color(19,89,28);
        Color unClickedColor = new Color(19,89,28);
        
        //CHANGE TO GRASS
        g.setColor(new Color(18,69,10));
        g.fillRect(Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2());
        
        g.setColor(Color.white);
        g.fillRect(Window.getX(395),Window.getY(400),150,50);
        
        
        
        //Ready
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(400),Window.getY(405),140,40);
        
        //Modes
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(255),Window.getY(200),140,40);
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(405),Window.getY(200),140,40);
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(555),Window.getY(200),140,40);
        
        //Decide Player
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(330),Window.getY(270),140,40);
        g.setColor(new Color(18,255,10));
        g.fillRect(Window.getX(480),Window.getY(270),140,40);
        
        g.setColor(Color.white);
        g.setFont(new Font("Times New Roman",Font.ITALIC,50));
        g.drawString("ANIMACALA",Window.getX(100),Window.getY(150));
        g.setFont(new Font("Times New Roman",Font.ITALIC,30));
        g.drawString("READY",Window.getX(425),Window.getY(435));
        
        g.drawString("Capture",Window.getX(270),Window.getY(230));
        g.drawString("Continuous",Window.getX(405),Window.getY(230));
        g.drawString("Theft",Window.getX(590),Window.getY(230));
        g.setColor(Color.red);
        g.setFont(new Font("Arial",Font.PLAIN,50));
        g.drawString("ANIMACALA",Window.getX(100),Window.getY(150));
        g.setFont(new Font("Arial",Font.PLAIN,40));
        g.drawString("PLAY",Window.getX(375),Window.getY(440));
        
        g.drawString("1 Player",Window.getX(350),Window.getY(300));
        g.drawString("2 Player",Window.getX(500),Window.getY(300));
    }
}
