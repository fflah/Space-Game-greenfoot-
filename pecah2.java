import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pecah2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pecah2 extends Actor
{
    /**
     * Act - do whatever the pecah2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        
        World w = getWorld();
        setLocation(x-5,y+5);
        if (isAtEdge())
        {
        w.removeObject(this);
        }
    }    
}
