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
        g.setColor(new Color(18,69,10));
        g.fillRect(Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2());
        
        g.setColor(Color.white);
        g.fillRect(Window.getX(350),Window.getY(400),150,50);
        
        g.setColor(new Color(34,38,85));
        g.fillRect(Window.getX(355),Window.getY(405),140,40);
        
        g.setColor(Color.red);
        g.setFont(new Font("Arial",Font.PLAIN,50));
        g.drawString("SPACESHIP",Window.getX(100),Window.getY(150));
        g.setFont(new Font("Arial",Font.PLAIN,40));
        g.drawString("PLAY",Window.getX(375),Window.getY(440));
        
    }
}
