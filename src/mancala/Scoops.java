
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
                if (zi>0 && zi<3 && zx>0 && zx<7){
                    board[zi][zx] = new Marbles(new Color(0,0,0),4);
                }
                else {
                     board[zi][zx] =null;
                }
            }
        }
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

        int currlRow = NUM_ROWS-1;
        while(currlRow > 0 && board[currlRow][currCol] != null)
        {
            currlRow--;
        }
        

        return;
    }
    public static void MoveMarble(int xpixel,int ypixel) {
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
        if (Player.getCurrentPlayer()==Player.getPlayer1()){
                int addCol = currCol;
                for (int zx = 0;zx<board[currRow][currCol].getVal();zx++)
                {  
                    if (addCol>0 && addCol<7 && currRow ==2){
                        
                        if (board[currRow][addCol] != null){
                            board[currRow][addCol].addVal();
                            
                        }
                        else if (board[currRow][addCol] == null)
                        {
                            board[currRow][addCol] = new Marbles(new Color(0,0,0), 0);
                        }
                    }
                        if (addCol>6){
                        board[currRow][addCol] = new Marbles(new Color(0,0,0), 1);
                        }
                        addCol ++;
                }
            
            }
            else {
            int addCol2 = currCol;
                for (int zx = 0;zx<board[currRow][currCol].getVal();zx--)
                {
                    
                    if (addCol2>0 && addCol2<7 && currRow ==1){
                        
                        if (board[currRow][addCol2] != null){
                        board[currRow][addCol2].addVal();
                            
                        }
                        else if (board[currRow][addCol2] == null)
                        {
                            board[currRow][addCol2] = new Marbles(new Color(0,0,0), 0);
                        }
                    }
                    if (addCol2<1){
                        board[currRow][addCol2] = new Marbles(new Color(0,0,0), 1);
                        }
                        addCol2 --;
                }
            }
        if (Player.getCurrentPlayer()==Player.getPlayer1()){
            if (currRow == 2){
                board[currRow][currCol] = null;
            }
            else {
                return;
            }
        }
        else if (Player.getCurrentPlayer()==Player.getPlayer2())
        {
            if (currRow == 1){
                board[currRow][currCol] = null;
            }
            else {
                return;
            }
            
        }
        Player.switchTurn();
            
        
    }
       
    public static void Draw(Graphics2D g) {
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        
 //Draw the grid.
//        g.setColor(Color.black);
//        for (int zi = 1;zi<NUM_ROWS;zi++)
//        {
//            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
////                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
//        }
//        
//        for (int zi = 1;zi<NUM_COLUMNS;zi++)
//        {
//            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
//                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
//        }
        for (int row=0;row<NUM_ROWS;row++)
        {
            for (int col=0;col<NUM_COLUMNS;col++)
            {
                if (board[row][col]!= null)
                    board[row][col].draw(g, row, col, xdelta, ydelta);
              
            }            
            
        }

        for (int row=0;row<NUM_ROWS;row++)
        {
            for (int col=0;col<NUM_COLUMNS;col++)
            {
                if (board[row][col]!= null)
                    board[row][col].draw(g, row, col, xdelta, ydelta);
              
            }            
            


    }
// 
//        for (int zi = 1;zi<NUM_COLUMNS;zi++)
//        {
//            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
//                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
//        }
//        for (int row=0;row<NUM_ROWS;row++)
//        {
//            for (int col=0;col<NUM_COLUMNS;col++)
//            {
//                if (board[row][col]!= null)
//                    board[row][col].draw(g, row, col, xdelta, ydelta);
//              
//           }            
//            
//
//
//    }
 
        

    }
    public static boolean CheckWin(){    
        int isDone = 0;
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
                if (zi>0 && zi<3 && zx>0 && zx<7){
                    if (board[zi][zx] == null){
                        isDone ++;
                        if (isDone == 8){
                            return true;
                        }
                    }
                }
            }

        }
        return (false);
    }        
    public static void Theft (boolean isTheft){
        if (isTheft){
            
        }
        else 
            return;
    }
    public static int GetPoints() {
        return points;
    }
}

