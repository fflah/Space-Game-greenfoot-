import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 

public class GameOver extends Actor
{    Counter scoreCounter; 
    public GameOver() {
        endGame();
    }
    
    
	 
	
    public void endGame() {
        GreenfootImage canvas = new GreenfootImage(400,200);
        GreenfootImage end = new GreenfootImage("GAME OVER!!", 32, Color.WHITE, new Color(0,0,0,0));
        canvas.setColor(Color.WHITE);
        canvas.drawRect(3, 3, canvas.getWidth()-13, canvas.getHeight()-13);
        canvas.setColor(Color.GRAY);
        canvas.fillRect(4, 4, canvas.getWidth()-14, canvas.getHeight()-14);
        canvas.setColor(Color.WHITE);
        canvas.drawString("Skor: " + Counter.value , (canvas.getWidth()/2) + -end.getWidth()/2, 100);
        canvas.drawImage(end, (canvas.getWidth()-end.getWidth())/2, 50);
        setImage(canvas);
        Greenfoot.stop();
    }
}
