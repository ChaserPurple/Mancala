package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
<<<<<<< HEAD
    private int value;
=======

    private int value;


>>>>>>> 36924cffe05d035ff5487b8a08c0b992b7743d80

Marbles(Color _color){
        color = _color;
        value = 4;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
 


 
        int value = 0;
        g.setColor(color); 


        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   

        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   

        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,45));
        g.drawString("" + value,300,175); 
                


        g.setFont(new Font("Arial",Font.PLAIN,30));
 
 
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            

        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   


        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
<<<<<<< HEAD
        g.drawString("" + value,Window.getX(column*xdelta+xdelta/2-10),Window.getY(row*ydelta+ydelta/2+10));          
        
    }  
    public void addVal(){
       value ++;
    }
    public int getVal(){
       return value ;
    }
=======
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));          
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
 
    }    
 
      
>>>>>>> 36924cffe05d035ff5487b8a08c0b992b7743d80

    
    public Color getColor(){
        return (color);
    }
}
