package tugas7;

import java.awt.*;  
import javax.swing.*;
import javax.swing.border.Border;

public class Aclaputra {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tugas 7 Java, M. Acla Alamsyah Putra (1922423380)");
		frame.setSize(500,400); // sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //make frame visible
		frame.setLayout(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		
		ImageIcon image = new ImageIcon("komuk.jpg");
		frame.setIconImage(image.getImage());
		
		JPanel panel = new JPanel();
		panel.setBounds(40,80,360,200);
		panel.setBackground(Color.white);
		panel.setBorder(new RoundedBorder(60));
		
		JLabel label1;
		label1 = new JLabel("Nama: M. Acla ALamsyah Putra");
		label1.setBounds(50,50,400,100);
		
		JLabel label2;
		label2 = new JLabel("NIM: 1922423380");
		label2.setBounds(50,50,400,30);

		JButton button2 = new JButton("Show more");
		button2.setBounds(130,100,100,40);
		button2.setBorder(new RoundedBorder(10));
		
		panel.add(label1);
		panel.add(label2);
		panel.add(button2);
		
		frame.add(panel);
		
	}
	
	private static class RoundedBorder implements Border {

	    private int radius;

	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }

	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }

	    public boolean isBorderOpaque() {
	        return true;
	    }

	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	
}
