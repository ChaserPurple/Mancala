package mancala;

import java.awt.*;
public class Marbles {
    private Color color;
<<<<<<< HEAD
    private int value;
=======
<<<<<<< HEAD
=======
>>>>>>> 2f08a9aeb2743e55631d5788bde57385dccb09eb
   
>>>>>>> 9db1122a8d024b5ebc9d69e292302c6406ff558f
    
    Marbles(Color _color){
        color = _color;
        value = 4;
    }
    
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
<<<<<<< HEAD
        int value = 0;
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta,ydelta);   
<<<<<<< HEAD
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,45));
        g.drawString("" + value,300,175); 
                

=======
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
>>>>>>> 9db1122a8d024b5ebc9d69e292302c6406ff558f
=======
<<<<<<< HEAD
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta/4,ydelta/4);   
    }    
    public Color getColor(){
        return (color);
    }
=======
        int value = 0;
        g.setColor(color); 
        g.fillOval(Window.getX(column*xdelta),Window.getY(row*ydelta),xdelta,ydelta);   
        g.setFont(new Font("Arial",Font.PLAIN,30));
        g.drawString("" + value,Window.getX(column*xdelta+34),Window.getY(row*ydelta+50));            
>>>>>>> 2f08a9aeb2743e55631d5788bde57385dccb09eb
    }    
    

    public Color getColor(){
        return (color);
    }
    
>>>>>>> 9db1122a8d024b5ebc9d69e292302c6406ff558f
}