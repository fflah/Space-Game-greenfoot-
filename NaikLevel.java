import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NaikLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NaikLevel extends Actor
{
    /**
     * Act - do whatever the NaikLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int x = getX();
        int y = getY();
        World w = getWorld();
        setLocation(x,y-7);

        if (isAtEdge()){
            w.removeObject(this);
        }
    }    
}
