
package MouseDragged;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Mouse_moved extends JPanel implements MouseMotionListener{

int x,y;
String texto="";
public Mouse_moved(){
    addMouseMotionListener(this);
}
@Override
public void paint(Graphics g){
    ImageIcon imagen =new ImageIcon(getClass().getResource("star.png"));
    g.drawImage(imagen.getImage(), x, y,32,32,null);
    Font fuente =new Font("ARIAL",Font.BOLD,22);
    g.setFont(fuente);
    g.drawString(texto, 20, 400);
}
    public static void main(String[] args) {
JFrame f = new JFrame ("Ejemplo con Mouse_Moved");
f.getContentPane().add(new Mouse_moved());
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500, 500);
f.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x=(int)e.getPoint().getX();
        x=(int)e.getPoint().getY();
        repaint();
    }
    
}
