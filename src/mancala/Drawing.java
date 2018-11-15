package mancala;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;

public class Drawing {
    private static Graphics2D g;
    private static Mancala mainClassInst;
    private static boolean selectedMode;
    private static boolean begun;
    private static boolean continuous;
    private static boolean capture;
    private static boolean theft;
    private static boolean onePlayer;

    public static void Init(){
        selectedMode = false;
        continuous = false;
        capture = false;
        theft = false;
        onePlayer = true;
        begun = false;
    }
    public static void setDrawingInfo(Graphics2D _g,Mancala _mainClassInst) 
    {
        g = _g;
        mainClassInst = _mainClassInst;
    }
////////////////////////////////////////////////////////////////////////////////
     public static void drawImage(Image image,int xpos,int ypos,double rot,double xscale,double yscale,int width,int height) 
    {
//         = image.getWidth(mainClassInst);
//         = image.getHeight(mainClassInst);
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,-width/2,-height/2,width,height,mainClassInst);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
    public static void drawScreen()
    {
        //CHANGE TO GRASS
        g.setColor(new Color(98,53,18));
        g.fillRect(Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2());
        
        g.setColor(Color.white);
        g.fillRect(Window.getX(395),Window.getY(400),150,50);
        g.fillRect(Window.getX(250),Window.getY(195),450,50);
        g.fillRect(Window.getX(325),Window.getY(265),300,50);
        
        //Ready
        g.setColor(new Color(54,134,40));
        g.fillRect(Window.getX(400),Window.getY(405),140,40);
        
        //Modes 
        if(capture)
            g.setColor(new Color(20,49,15));
        g.fillRect(Window.getX(255),Window.getY(200),140,40);
        g.setColor(new Color(54,134,40));
        if(continuous)
            g.setColor(new Color(20,49,15));
        g.fillRect(Window.getX(405),Window.getY(200),140,40);
        g.setColor(new Color(54,134,40));
        if(theft)
            g.setColor(new Color(20,49,15));
        g.fillRect(Window.getX(555),Window.getY(200),140,40);
        g.setColor(new Color(54,134,40));
        //Decide Player
        if(onePlayer)
            g.setColor(new Color(20,49,15));
        g.fillRect(Window.getX(330),Window.getY(270),140,40);
        g.setColor(new Color(54,134,40));
        if(!onePlayer)
            g.setColor(new Color(20,49,15));
        g.fillRect(Window.getX(480),Window.getY(270),140,40);
        
        g.setColor(Color.white);
        g.setFont(new Font("Times New Roman",Font.ITALIC,50));
        g.drawString("ANIMACALA",Window.getX(100),Window.getY(150));
        g.setFont(new Font("Times New Roman",Font.ITALIC,30));
        g.drawString("READY",Window.getX(425),Window.getY(435));
        
        g.drawString("Capture",Window.getX(270),Window.getY(230));
        g.drawString("Continuous",Window.getX(405),Window.getY(230));
        g.drawString("Theft",Window.getX(590),Window.getY(230));
        
        g.drawString("1 Player",Window.getX(350),Window.getY(300));
        g.drawString("2 Player",Window.getX(500),Window.getY(300));
    }
    public static void drawAnimals(boolean tip){
        if(!tip){
            g.drawImage(Animal.Panda,Window.getX(100),Window.getY(60),115,103, mainClassInst);
//            Drawing.drawImage(Animal.Panda, Window.getX(100), Window.getY(60), 0, 1, 1, 115, 103);
//            g.drawImage(Animal.Chicken,400,60,110,110, (ImageObserver) this);
//            Drawing.drawImage(Animal.Chicken, Window.getX(400), Window.getY(60), 0, 1, 1, 110, 110);
//            g.drawImage(Animal.Giraffe,700,40,117,156, (ImageObserver) this);
//            Drawing.drawImage(Animal.Giraffe, Window.getX(700), Window.getY(40), 0, 1, 1, 117, 156);
        }
        else{
            int num = (int)(Math.random()*3+1);
    //giraffe            
            if(num ==1){
//                g.drawImage(Animal.Panda,100,60,115,103, mainClassInst);
//                Drawing.drawImage(Animal.Panda, Window.getX(100), Window.getY(60), 0, 1, 1, 115, 103);
//                g.drawImage(Animal.Chicken,400,60,110,110, mainClassInst);
//                Drawing.drawImage(Animal.Chicken, Window.getX(400), Window.getY(60), 0, 1, 1, 110, 110);
//                g.drawImage(Animal.Giraffe,400,600,117,156, (ImageObserver) this);
//                Drawing.drawImage(Animal.Giraffe, Window.getX(400), Window.getY(600), 0, 1, 1, 117, 156);
            }

    //chicken           
            if(num ==2){
//                g.drawImage(Animal.Panda,100,60,115,103, (ImageObserver) this);
//                g.drawImage(Animal.Chicken,400,600, 110,110, (ImageObserver) this);
//                g.drawImage(Animal.Giraffe,700,40,117,156, (ImageObserver) this);
            }

    //panda            
            if(num ==3){
//                g.drawImage(Animal.Panda,400,600,   115,103, (ImageObserver) this);
//                g.drawImage(Animal.Chicken,400,60,110,110, (ImageObserver) this);
//                g.drawImage(Animal.Giraffe,700,40,117,156, (ImageObserver) this);
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////
    public static void checkReady(int x,int y)
    { 
        if(x >= Window.getX(255) && x <= Window.getX(395) && y >= Window.getY(200) && y <= Window.getY(240)){
            selectedMode = true;
            capture = true;
            continuous = false;
            theft = false;
        }
        else if(x >= Window.getX(405) && x <= Window.getX(545) && y >= Window.getY(200) && y <= Window.getY(240)){
            selectedMode = true;
            continuous = true;
            theft = false;
            capture = false;
        }
        else if(x >= Window.getX(555) && x <= Window.getX(695) && y >= Window.getY(200) && y <= Window.getY(240)){
            selectedMode = true;
            theft = true;
            continuous = false;
            capture = false;
        }
        else if(x >= Window.getX(330) && x <= Window.getX(470) && y >= Window.getY(270) && y <= Window.getY(310)){
            onePlayer = true;
        }
        else if(x >= Window.getX(480) && x <= Window.getX(620) && y >= Window.getY(270) && y <= Window.getY(310)){
            onePlayer = false;
        }
        else if(x >= Window.getX(400) && x <= Window.getX(540) && y >= Window.getY(405) && y <= Window.getY(445)){
            if(selectedMode)
                begun = true;
            else
                begun = false;
        }
//        begun = true;
    }
////////////////////////////////////////////////////////////////////////////////
    public static boolean getBegun(){
        return begun;
    }
    public static boolean getCapture(){
        return capture;
    }
    public static boolean getContinuous(){
        return continuous;
    }
    public static boolean getTheft(){
        return theft;
    }
    public static boolean getPlayers(){
        return onePlayer;
    }
}
