package model;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;

//Class for brick objects
public class Brick extends Entity {

		
	public Brick(Position position, EntityManager manager) {
		super(position, manager);
		image = new ImageIcon("image/brick.jpg").getImage();
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(image, position.getX(), position.getY(), WIDTH, HEIGHT, null);
			
			

			
			
			
			
			
			
	}




}
