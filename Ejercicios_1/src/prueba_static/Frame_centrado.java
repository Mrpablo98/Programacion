package prueba_static;
import javax.swing.*;
import java.awt.*;

public class Frame_centrado extends JFrame {

    public Frame_centrado(){

        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanho_p=mipantalla.getScreenSize();
        int altura=tamanho_p.height;
        int ancho=tamanho_p.width;
        this.setSize(ancho/2, altura/2);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(ancho/4, altura/4);
        this.setTitle("frame centrado");
        Image miIcono=mipantalla.getImage("src/graficos/icono.gif");
        this.setIconImage(miIcono);
    }

    public static void main(String[] args) {
        
        Frame_centrado ventana=new Frame_centrado();
    }
}
