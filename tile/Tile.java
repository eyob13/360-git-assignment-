package Mario.tile;

import java.awt.Graphics;

import Game.Id;

public class Tile {
	public int x,y;
	public int width, height;
	
	public boolean solid;
	public int velX, vely;
public Id id;
	
	public Tile(int x, int y, int width, int height, boolean solid, Id id) {
	
		   this.x = x;
		    this.y = y;
		    this.width = width;
		    this.height = height;
		    this.solid = solid;
		    this.id = id;
		    
		}
		public void render(Graphics g) {
			
		}
		public void tick() {
			x+=velX;
			y+=vely;
		}
		
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public boolean isSolid() {
			return solid;
		}
		public void setSolid(boolean solid) {
			this.solid = solid;
		}
		public int getVelX() {
			return velX;
		}
		public void setVelX(int velX) {
			this.velX = velX;
		}
		public int getVely() {
			return vely;
		}
		public void setVely(int vely) {
			this.vely = vely;
		}
	}
