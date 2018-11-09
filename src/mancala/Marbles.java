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

        int value = 0;
        g.setColor(color); 

        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,45));
        g.drawString("" + value,300,175); 
                


        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            

        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
    }    
    public Color getColor(){
        return (color);
    }
 
   

                  

    }    
    

  
    

