package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
<<<<<<< HEAD
 

    private int value;
=======
private int value;
>>>>>>> a80ffc2e0c2d3e946618ca070765d672f39d5293

Marbles(Color _color){
        color = _color;
        value = 4;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
<<<<<<< HEAD

 
        int value = 0;
        g.setColor(color); 

        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,45));
        g.drawString("" + value,300,175); 
                


        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            

        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
=======
>>>>>>> a80ffc2e0c2d3e946618ca070765d672f39d5293
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta)+ xdelta/2-20,Window.getY(row*ydelta)+ydelta/2-20,40,40);   
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));          
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
    }    
<<<<<<< HEAD
      
    public Color getColor(){
        return (color);
    }
 
   

                  

    }    
    

  
    

=======
    
    public Color getColor(){
        return (color);
    }
}
>>>>>>> a80ffc2e0c2d3e946618ca070765d672f39d5293
