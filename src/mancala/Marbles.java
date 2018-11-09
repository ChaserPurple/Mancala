package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
   
    
    Marbles(Color _color){
        color = _color;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        int value = 0;
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta,ydelta);   
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
    }    
    

    public Color getColor(){
        return (color);
    }
    
}