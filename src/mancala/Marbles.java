package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
    private int value;
    Marbles(Color _color)
    {
        value = (int)(Math.random()*5+1);
        color = _color;
    }
    public int getValue() {
        
        return value;
    }
    public Color getColor()
    {
        return (color);
    }
    public int getnewValue() {
        int newVal = value;
        while (newVal == value){
            value = (int)(Math.random()*5+1);
        }
        return value;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta,ydelta);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));                     
        
    }    
}


