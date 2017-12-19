package canchaBasket;


import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.JugadorControl;
import vista.canchaInterfaz;


public class Cancha extends JPanel implements canchaInterfaz,Runnable{

	canchaBasket.Jugador Sujeto;
	private JLabel jugador;
	private Rectangle cancha;
	private ObjectOutputStream out;
	
	public Cancha() {
		setLayout(null);
		jugador = new JLabel();
		jugador.setIcon(new ImageIcon(Cancha.class.getResource("/img/Pelota.jpg")));
		jugador.setBounds(15, 15, 16, 16);
		add(jugador);
		JugadorControl cntrl = new JugadorControl(this);
		addKeyListener(cntrl);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Image imagen= new ImageIcon(Pelota.class.getResource("/img/cancha.jpg")).getImage();
		int x=getWidth()/2 - imagen.getWidth(this)/2;
		int y=getHeight()/2-imagen.getHeight(this)/2;
		g.drawImage(imagen, x, y,this );
		
		cancha=new Rectangle();
		if(jugador.getBounds().width==0){
			x=getWidth()/2 - 20;
			y=getHeight()/2-20;
			jugador.setBounds(x, y, 40, 40);
			Thread t=new Thread(this);
			t.start();
		}
		
	}
	
	public int getJugadorX() {
		return jugador.getX();
	}

	public int getJugadorY() {
		return jugador.getY();
	}
	public Rectangle getCancha() {
		return getCancha();
	}

	public void actualizar(int x, int y) throws IOException{
		jugador.setBounds(x, y, 40, 40);
}

	public JLabel getJugador() {		
		return null;
	}

	public void run() {
		JugadorControl control=new JugadorControl(this);
		addKeyListener(control);
		
	}
}
