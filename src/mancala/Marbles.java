package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
private int value;

Marbles(Color _color){
        color = _color;
        value = 4;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        g.setColor(color); 
<<<<<<< HEAD
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
=======
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
>>>>>>> 3acfc92c17f79c16a7552a3d5e73208e01cdcdea
    }    
    

    public Color getColor(){
        return (color);
    }
}