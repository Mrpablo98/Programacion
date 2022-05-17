package prueba_static;
import javax.swing.*;
import java.awt.*;

public class Escribiendo_Frame {

	
		
	
	
	public static void main(String[] args) {
		
		Frame_texto miFrame=new Frame_texto();

	}

}

class Frame_texto extends JFrame{
	
	public Frame_texto() {
		
		setVisible(true);
		this.setSize(600, 450);
		this.setLocation(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Frame con texto");
		Panel panel=new Panel();
		this.add(panel);

		
	}
	
} 

class Panel extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo swing", 100, 100);
		


	}
	


	

	





}