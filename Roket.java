import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roket extends Objects {
    Counter counter;
    private int time = 0;
    private int count = 0;

    public void Roket() {
    }

    public void act() {
        
        time++;
        Kontrol();
        tembak();
       over();
    }

    /**
     * Moves the spaceship in up, down, left, right direction.
     */
    private void Kontrol() {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }
    }

    /**
     * Fires the Laser from the ship.
     * Does this by adding the laser Object at the spaceships
     * location.
     */
    private void tembak() {
        Laser newLaser = new Laser();
        if("space".equals(Greenfoot.getKey()) && time >= 10) {
            getWorld().addObject(newLaser, getX()+ 60, getY());
            time = 0;
        }
    }

    public void over() {
        if(onContact(Astroid.class)){
            getWorld().addObject(new EndOfGame(), getWorld().getWidth()/2, 
               getWorld().getHeight()/2);
            getWorld().removeObject(this);
        }
    }
}