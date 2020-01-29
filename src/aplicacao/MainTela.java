package aplicacao;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainTela extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JButton b5 = new JButton();
	private JButton b6 = new JButton();
	private JButton b7 = new JButton();
	private JButton b8 = new JButton();
	private JButton b9 = new JButton();
	Font fonte = new Font("Arial", Font.BOLD, 60);
	private int cont = 0;
	private String [][] tab = new String[3][3];
	
	public void actionPerformed(ActionEvent e) {	
		String vez;
		if(cont%2==0) {
			vez="X";
		}
		else{
			vez="O";
		}
		if(e.getSource() == b1) {
			tab[0][0]=vez;
			b1.setText(tab[0][0]);
			b1.setEnabled(false);
			cont++;
			
		}
		if(e.getSource() == b2) {
			tab[0][1]=vez;
			b2.setText(tab[0][1]);
			b2.setEnabled(false);
			cont++;
			
		}
		if(e.getSource() == b3) {
			tab[0][2]=vez;
			b3.setText(tab[0][2]);
			b3.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b4) {
			tab[1][0]=vez;
			b4.setText(tab[1][0]);
			b4.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b5) {
			tab[1][1]=vez;
			b5.setText(tab[1][1]);
			b5.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b6) {
			tab[1][2]=vez;
			b6.setText(tab[1][2]);
			b6.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b7) {
			tab[2][0]=vez;
			b7.setText(tab[2][0]);
			b7.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b8) {
			tab[2][1]=vez;
			b8.setText(tab[2][1]);
			b8.setEnabled(false);
			cont++;
		}
		if(e.getSource() == b9) {
			tab[2][2]=vez;
			b9.setText(tab[2][2]);
			b9.setEnabled(false);
			cont++;
		}
		
		String[] PO = new String[8];
		
		PO[0] = tab[0][0] + tab[0][1] + tab[0][2];
		PO[1] = tab[1][0] + tab[1][1] + tab[1][2];
		PO[2] = tab[2][0] + tab[2][1] + tab[2][2];
		PO[3] = tab[0][0] + tab[1][0] + tab[2][0];
		PO[4] = tab[0][1] + tab[1][1] + tab[2][1];
		PO[5] = tab[0][2] + tab[1][2] + tab[2][2];
		PO[6] = tab[0][0] + tab[1][1] + tab[2][2];
		PO[7] = tab[0][2] + tab[1][1] + tab[2][0];
		
		if(cont == 9) {
			JOptionPane.showMessageDialog(null, "EMPATE!");
			cont=0;
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			
			b1.setText(null);
			b2.setText(null);
			b3.setText(null);
			b4.setText(null);
			b5.setText(null);
			b6.setText(null);
			b7.setText(null);
			b8.setText(null);
			b9.setText(null);
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					tab[i][j]=null;
				}
			}
		}
		for(int i=0; i<8; i++) {
			if(PO[i].equals("XXX")) {
				JOptionPane.showMessageDialog(null, "JOGADOR (X) VENCEU!");
				cont=0;
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				b9.setText(null);
				
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						tab[x][y]=null;
					}
				}
			}
			
			if(PO[i].equals("OOO")){
				JOptionPane.showMessageDialog(null, "JOGADOR (O) VENCEU!");
				cont=0;
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				b9.setText(null);
				
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						tab[x][y]=null;
					}
				}
			}
		}	
	}
	
	public MainTela() {
		this.setTitle("Jogo da Velha");
		this.setSize(300, 298);
		setLocationRelativeTo(null);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b1.setFont(fonte);
		b2.setFont(fonte);
		b3.setFont(fonte);
		b4.setFont(fonte);
		b5.setFont(fonte);
		b6.setFont(fonte);
		b7.setFont(fonte);
		b8.setFont(fonte);
		b9.setFont(fonte);
		
		this.setLayout(new GridLayout(3, 3));
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new MainTela();
	}
}
