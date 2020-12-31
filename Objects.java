import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this will be a superclass for all the objects flying around
 * in the space world
 */
public class Objects extends Actor {
    World world; 

    public Objects() {
    }

    /**
     * Tells weather the object is at the edge of the world.
     */
    public boolean atWorldEdge() {
        world = getWorld();
        if(getX() <= 1 || getX() >= world.getWidth() - 1) {
            return true;
        }
        if(getY() <= 1 || getY() >= world.getWidth() - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Tells weather 2 objects intersect.
     */
    public boolean onContact(Class cls) {
        Actor actor = getOneIntersectingObject(cls);
        if(actor != null) {
            getWorld().removeObject(actor);
            return true;
        }
        return false;
    }
    
    protected final Space getSpace() {
        return (Space)getWorld();
    }

}