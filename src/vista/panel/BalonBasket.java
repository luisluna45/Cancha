package vista.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import canchaBasket.Pelota;

public class BalonBasket extends JPanel {

	public BalonBasket() {
		// TODO Auto-generated constructor stub
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image imagen = new ImageIcon(Pelota.class.getResource("/img/Pelota.jpg")).getImage();
		int x = getWidth()/2 - imagen.getWidth(this)/2;
		int y = getHeight()/2 - imagen.getHeight(this)/2;
		g.drawImage(imagen, x, y, this);
		
		FontMetrics font = g.getFontMetrics();
		Font fuente = new Font("Arial", Font.BOLD, 36);
		int anchoCadena = font.stringWidth("JUEGO");
		int xCadena = getWidth()/2 - anchoCadena/2;
		int yCadena = getHeight()/2 + imagen.getHeight(this)/2 + 35;
		g.setColor(Color.BLUE);
		g.setFont(fuente);
		g.drawString("JUEGO", xCadena, yCadena);
	}
}
