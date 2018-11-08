package mancala;


import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Mancala extends JFrame implements Runnable {
 
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;
//    Image Panda;
    Image Board;
//    Image Giraffe;
//    Image Chicken;
            
    boolean player1Turn;
    int mostRecentRow;
    int mostRecentCol;
    boolean win;


    public static void main(String[] args) {
        Mancala frame = new Mancala();
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Mancala() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                
   
                if (win)
                    return;
                
                if (e.BUTTON1 == e.getButton() ) {
                    e.getX();
                    e.getY();

                    Scoops.AddTokenPixel(e.getX() - Window.getX(0),
                            e.getY() - Window.getY(0));  
                    
                    win = Scoops.CheckWin();
                    if (win) {
                        Player.getOtherPlayer().addPoints(Scoops.GetPoints());
                    }
                }

                if (e.BUTTON3 == e.getButton()) {
//add or modify.  Code already added for you.
                    Scoops.ChangeTokenPixel(e.getX() - Window.getX(0),
                            e.getY() - Window.getY(0));  
                }
                repaint();
            }
        });
            

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {

        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {

        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.VK_UP == e.getKeyCode()) {
                } else if (e.VK_DOWN == e.getKeyCode()) {
                } else if (e.VK_LEFT == e.getKeyCode()) {
                } else if (e.VK_RIGHT == e.getKeyCode()) {
                } else if (e.VK_ESCAPE == e.getKeyCode()) {
                    reset();
                }
                repaint();
            }
        });
        init();
        start();
    }
    Thread relaxer;
////////////////////////////////////////////////////////////////////////////
    public void init() {
        requestFocus();
    }
////////////////////////////////////////////////////////////////////////////
    public void destroy() {
    }
////////////////////////////////////////////////////////////////////////////
    public void paint(Graphics gOld) {
        if (image == null || Window.xsize != getSize().width || Window.ysize != getSize().height) {
            Window.xsize = getSize().width;
            Window.ysize = getSize().height;
            image = createImage(Window.xsize, Window.ysize);
            g = (Graphics2D) image.getGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }
//fill background
        
        g.setColor(Color.cyan);
        g.fillRect(0, 0, Window.xsize, Window.ysize);

        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
//fill border
        g.setColor(Color.white);
        g.fillPolygon(x, y, 4);
// draw border
        g.setColor(Color.red);
        g.drawPolyline(x, y, 5);

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }

        Scoops.Draw(g);
        g.drawImage(Board,Window.getX(0)-40,Window.getY(2)+Window.getHeight2()/4,
                Window.getWidth2()+70,Window.getHeight2()/2,this);
        

            g.setColor(Color.black);
            g.setFont(new Font("Arial",Font.PLAIN,15));
            g.drawString("Player1 = " + Player.getPlayer1().getPoints(),50,60);                     
            g.drawString("Player2 = " + Player.getPlayer2().getPoints(),500,60);                     
            
            if (Player.getCurrentPlayer()== Player.getPlayer1())
            {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial",Font.BOLD,15));
            g.drawString("Player1's turn",250,60);
            }
            else {
            g.setColor(Color.black);
            g.setFont(new Font("Arial",Font.BOLD,15));
            g.drawString("Player2's turn" ,250,60);   
            }

        if (win)
        {
            g.setColor(Color.blue);
            g.setFont(new Font("Arial",Font.PLAIN,45));
            g.drawString("WIN",50,200);         
        }
        gOld.drawImage(image, 0, 0, null);
    }

////////////////////////////////////////////////////////////////////////////
// needed for     implement runnable
    public void run() {
        while (true) {
            animate();
            repaint();
            double seconds = .1;    //time that 1 frame takes.
            int miliseconds = (int) (1000.0 * seconds);
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
            }
        }
    }
    
/////////////////////////////////////////////////////////////////////////
    public void reset() {

        win = false;
        Scoops.Reset();
        Player.Reset();

    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {

        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }
            Board = Toolkit.getDefaultToolkit().getImage("./Mancala.png");
//            Chicken = Toolkit.getDefaultToolkit().getImage("./Chicken.png");
//            Panda = Toolkit.getDefaultToolkit().getImage("./Cartoon-Panda-Transparent-Image.png");
//            Giraffe = Toolkit.getDefaultToolkit().getImage("./Giraffe.png");
            
            reset();

        }

        
    }

////////////////////////////////////////////////////////////////////////////
    public void start() {
        if (relaxer == null) {
            relaxer = new Thread(this);
            relaxer.start();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void stop() {
        if (relaxer.isAlive()) {
            relaxer.stop();
        }
        relaxer = null;
    }

}




