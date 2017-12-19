package canchaBasket;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class canchaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					canchaPrincipal frame = new canchaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public canchaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int alto=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		int ancho=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int hv=300;
		int wv=450;
		int x= (ancho/2) - (wv/2);
		int y= (alto/2) - (hv/2);
		setBounds(x, y, wv, hv);
		//setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de ...");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnAyuda.add(mntmAcercaDe);
		
		JMenuItem mntmReglas = new JMenuItem("Reglas");
		mnAyuda.add(mntmReglas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlBotones = new JPanel();
		contentPane.add(pnlBotones, BorderLayout.NORTH);
		
		JButton btnPlay = new JButton("Play");

		pnlBotones.add(btnPlay);
		
		JButton btnPause = new JButton("Pause");
		pnlBotones.add(btnPause);
		
		final JPanel pnlJuego = new JPanel();
		contentPane.add(pnlJuego, BorderLayout.CENTER);
		pnlJuego.setLayout(new CardLayout(0, 0));
		
		Pelota pnlPresentacion=new Pelota();
		pnlJuego.add(pnlPresentacion,"Pelota");
		
		Cancha pnlCancha=new Cancha();
		pnlJuego.add(pnlCancha,"Cancha");
		
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout) pnlJuego.getLayout();
				c.show(pnlJuego, "Cancha");
			}
		});
		
	}

}
