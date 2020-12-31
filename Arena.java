import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{
Counter scoreCounter;
level Level = new level();




    
    /**
     * Constructor for objects of class Space.
     */
    public Arena(){
        super(800, 450, 1);
        prepare();
    }
    
    public void act() {
         Naiklevel();
          
       if(Counter.value<=100){
        if(getObjects(Asteroid.class).size()<2){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
            
          }
        }

        if(Counter.value>=100 && Counter.value <=200){
            if(getObjects(Asteroid.class).size()<3){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        }
         
         
         if(Counter.value>200 && Counter.value <=300){
            if(getObjects(Asteroid.class).size()<4){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         if(Counter.value>300 && Counter.value <=400){
            if(getObjects(Asteroid.class).size()<5){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         if(Counter.value>400 && Counter.value <=500){
            if(getObjects(Asteroid.class).size()<6){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         if(Counter.value>500 && Counter.value <=6000){
            if(getObjects(Asteroid.class).size()<7){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         if(Counter.value>600 && Counter.value <=700){
            if(getObjects(Asteroid.class).size()<8){
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         if(Counter.value>800 ){
            if(getObjects(Asteroid.class).size()<10){
            addObject(new Astroid(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
                }
         }
         
         


    }
    
    public void Naiklevel(){
        if(Counter.value==100 || Counter.value==200 || Counter.value==300 || Counter.value==400 || Counter.value==500 || Counter.value==600 || Counter.value==700  ){
        if (getObjects(NaikLevel.class).size()<1 ){
             addObject(new NaikLevel(),400,200);
          }
        }
    }

    
    public void addScore(int newScore) {
        scoreCounter.add(newScore);
    }
    
    public int score() {
        return scoreCounter.getValue();
    }
    
    public void addlevel(int newlevel){
        Level.add(newlevel);
    }
    
    public int LevelNew(){
        return Level.getValue();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare() {
        level Level = new level();
        scoreCounter = new Counter();
        addObject(scoreCounter, 705, 30);
        addObject(Level, 25, 30);
        Roket roket = new Roket();
        addObject(roket, 373, 284);
        roket.setLocation(62, 288);
        //scoreCounter.setLocation(705, 50);
    }
}
