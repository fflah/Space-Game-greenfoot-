import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Objects {
    Counter objek = new Counter();

    public Asteroid() {
    }

    public void act() {
        if (getWorld()==null)return;
        int x = getX();
        int y = getY();
        setRotation(getRotation()+1);
        
        if (Counter.value<=100){
            setLocation(x-1, y);
        }
        if (Counter.value>=100 && Counter.value <=200){
            setLocation(x-3, y);
        }
        if (Counter.value>200 && Counter.value <=300){
            setLocation(x-4, y);
        }
        if (Counter.value>300 && Counter.value <=400){
            setLocation(x-5, y);
        }
        if (Counter.value>400 && Counter.value <=500){
            setLocation(x-6, y);
        }
        if (Counter.value>500 && Counter.value <=600){
            setLocation(x-7, y);
        }
        if (Counter.value>600 && Counter.value <=700){
            setLocation(x-8, y);
        }
        if (Counter.value>800){
            setLocation(x-19, y);
        }
        
        gerak();
        AsteroidHilang();
    }

    /**
     * The movement and rotation for the astroid.
     */
    private void gerak() {
        int x = getX() - 5;
        int y = getY();
        setRotation(getRotation() + 5);
        setLocation(x, y);
    }

    public void AsteroidHilang() {
        if(atWorldEdge()) {
            world.removeObject(this);
        }
    }
}