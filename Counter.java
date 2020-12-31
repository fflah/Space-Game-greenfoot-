import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor {
    public static int value;
    public int target;
    public  final Color transparent = new Color(0,0,0,0);
     
    public Counter() {
       int value = 0;
       int target = 0;
       updateImage();
    }
    
    public void act() {
        if(value < target){
            value+=5;
            updateImage();
        }else if(value > target){
            value-=value;
            updateImage();
        }
    }
    
    public void add(int points) {
        target += points;
    }
    
    public int getValue() {
        return value;
    }
    
    public void updateImage() {
        GreenfootImage background = new GreenfootImage(200, 30);
        GreenfootImage text = new GreenfootImage("Skor " + value, 22, Color.WHITE, transparent);
        background.drawImage(text, background.getWidth()/2, (background.getHeight()-text.getHeight())/2);
        setImage(background);
    }
}
