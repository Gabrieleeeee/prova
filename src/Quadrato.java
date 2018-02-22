//modifica effettuata da gitHub


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quadrato extends JFrame implements ActionListener{
	//attributi
	private JTextField t1; //casella di testo
	private JLabel l1; //scrive sul form (es. risultato di area)
	private JLabel l2; //scrive sul form (es. risultato di area)
	private JButton b1= new JButton("Calcola l' area"); //pulsante
	
	public Quadrato() {
		
		
		
		super("Area Quadrato");
		
		Container c1= this.getContentPane();
		JPanel p1= new JPanel();
		c1.add(p1);
		
		t1= new JTextField(5);
		l1= new JLabel("L' area è: ");
		l2=new JLabel("?");
		
		p1.add(t1);
		p1.add(l1);
		p1.add(l2);
		p1.add(b1);
		b1.addActionListener(this); //ascolta il pulsante=controlla se è stato premuto
		
		setLocation(200,300); //posizione dell? angolo in alto a sinistra
		setSize(200,300);//dimensione della finestra
		setVisible(true); //visibilità della finestra
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ferma il programma
		
	}//fine costruttore

	@Override
	public void actionPerformed(ActionEvent e) {
		String nlatot;
		nlatot=t1.getText();
		int nlato=Integer.parseInt(nlatot); //converte da stringa in numero intero
		int area=nlato*nlato;
		l2.setText(String.valueOf(area)); //converte un numero intero in stringa
		
		
	}

}
