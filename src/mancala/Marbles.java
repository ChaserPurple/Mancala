package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
    private int value;

Marbles(Color _color, int _value){
        color = _color;
        value = _value;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta)+ xdelta/2-10,Window.getY(row*ydelta)+ydelta/2+10);      
        
    }  
    public void addVal(){
       value ++;
    }

    public int getVal(){
        return value;
    }
    public Color getColor(){
        return (color);
    }
}
