package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
//Class for most basic entity properties
public abstract class Entity extends Observable {
	protected Position position;
	protected static final int WIDTH = 50;
	protected static final int HEIGHT = 50;
	protected EntityManager manager;
	protected Image image;

	public static final List<Entity> EMPTY_LIST = new Vector<>();

	//entity Constructor
	public Entity(Position position, EntityManager manager) {
		super();
		this.position = position;
		this.manager = manager;
	}

	public boolean toBeKilled() {
		return true;
	}

	//draw abstract method 
	public abstract void draw(Graphics g);

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Rectangle getBounds() {
		return new Rectangle(this.position.getX(), this.position.getY(), WIDTH, HEIGHT);
	}

	public List<Entity> getCollision() {
		return EMPTY_LIST;
	} 
	
	

}
