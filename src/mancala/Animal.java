package mancala;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class Animal {
    Image Panda;
    Image Giraffe;
    Image Chicken;
    Animal (){
        Chicken = Toolkit.getDefaultToolkit().getImage("./Chicken.png");
        Panda = Toolkit.getDefaultToolkit().getImage("./Cartoon-Panda-Transparent-Image.png");
        Giraffe = Toolkit.getDefaultToolkit().getImage("./Giraffe.png");
    }
    public void Draw(Graphics g){
        g.drawImage(Panda,Window.getX(150)-40,Window.getY(2)+Window.getHeight2()/4,
               115,103, (ImageObserver) this);
        g.drawImage(Chicken,Window.getX(0)-40,Window.getY(2)+Window.getHeight2()/4,
                110,110, (ImageObserver) this);
        g.drawImage(Giraffe,Window.getX(250)-40,Window.getY(2)+Window.getHeight2()/4,
                117,156, (ImageObserver) this);
    }
    
}
