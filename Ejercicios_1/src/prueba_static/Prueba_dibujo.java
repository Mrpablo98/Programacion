package prueba_static;
import javax.swing.*;
import java.awt.*;



public class Prueba_dibujo {

	public static void main(String[] args) {
		
		Frame_dibujos frame= new Frame_dibujos();

	}

}

class Frame_dibujos extends JFrame{
	
	public Frame_dibujos(){
		
		this.setTitle("prueba de dibujo");
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 200);
		Panel_dibujo panel=new Panel_dibujo();
		this.add(panel);
		
	}
	 
	 
	
	
}

class Panel_dibujo extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawRect(150, 100, 50, 100);
		
	}
	
}