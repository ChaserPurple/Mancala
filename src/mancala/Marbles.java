package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
   
    
    Marbles(Color _color){
        color = _color;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta,ydelta);   
<<<<<<< HEAD
        
=======
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
<<<<<<< HEAD
>>>>>>> 5555325f97c07c4ceecb3585437c2541cb13d655
=======
>>>>>>> 5555325f97c07c4ceecb3585437c2541cb13d655
    }    
    

    public Color getColor(){
        return (color);
    }
    
}