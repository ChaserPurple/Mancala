package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
    
    Marbles(Color _color){
        color = _color;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
    }    
    public Color getColor(){
        return (color);
    }
}