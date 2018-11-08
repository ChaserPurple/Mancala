
package mancala;

import java.awt.*;
public class Scoops {  
    private final static int NUM_ROWS = 4;
    private final static int NUM_COLUMNS = 8;      
    private static Marbles board[][] = new Marbles[NUM_ROWS][NUM_COLUMNS];
    private static int numMarbles;
    private static int points;
    
    public static void Reset() {
 
        numMarbles = 0;
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
                board[zi][zx] = null;
            }
        }
    }
   
    public static int GetPoints() {
        return points;
    }
    

    public static void AddTokenPixel(int xpixel,int ypixel) {

        if (xpixel < 0 || xpixel > Window.getWidth2() || ypixel < 0 || 
           ypixel > Window.getHeight2())
            return;
        

        int currRow = 0;
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int currYVal = ydelta;
        while (ypixel > currYVal)
        {
            currRow++;
            currYVal += ydelta;
        }


        int currCol = 0;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int currXVal = xdelta;
        while (xpixel > currXVal)
        {
            currCol++;
            currXVal += xdelta;
        }

//add or modify. When the selected square is empty, then add the token like normal.
//               When the selected square is your own, then change the value.
//               When the selected square is your opponents, then remove the token and shuffle tokens down.

        int currlRow = NUM_ROWS-1;
        while(currlRow > 0 && board[currlRow][currCol] != null)
        {
            currlRow--;
        }
        

        return;
    }


//add or modify. Method already added for you.
    public static void ChangeTokenPixel(int xpixel,int ypixel) {
        if (xpixel < 0 || xpixel > Window.getWidth2() || ypixel < 0 || 
           ypixel > Window.getHeight2())
            return;
        

        int currRow = 0;
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int currYVal = ydelta;
        while (ypixel > currYVal)
        {
            currRow++;
            currYVal += ydelta;
        }
        
        int currCol = 0;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int currXVal = xdelta;
        while (xpixel > currXVal)
        {
            currCol++;
            currXVal += xdelta;
        }
    }
            
    
    public static void Draw(Graphics2D g) {
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        
 //Draw the grid.
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
                
//Draw the tokens.        
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
                if (board[zi][zx] != null)
                {
                    board[zi][zx].draw(g,zi,zx,xdelta,ydelta);
                }
            }
        } 
    }
    

    
////////    
//add or modify.  CheckWin now checks the whole board.
    public static boolean CheckWin()
    {    
        for (int row=0;row<NUM_ROWS;row++)
        {
            for (int col=0;col<NUM_COLUMNS;col++)
            {

              
            }            
            
        }
        return (false);
    }        
    
    
        
}
