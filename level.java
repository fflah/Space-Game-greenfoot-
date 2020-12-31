import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends Actor
{
    /**
     * Act - do whatever the level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int levelUp;
    public static int kurang;
    public  final Color transparent = new Color(0,0,0,0);
    
    public level(){
        int levelUp=1;
        updateImage();
    }
    
    public void act() {
        if (Counter.value<=100){
            levelUp=1;
            updateImage();
        }if (Counter.value>=100 && Counter.value <=200){
            levelUp=2;
            updateImage();
        }if(Counter.value>200 && Counter.value <=300){
            levelUp=3;
            updateImage();
        }if(Counter.value>300 && Counter.value <=400){
            levelUp=4;
            updateImage();
        }if(Counter.value>400 && Counter.value <=500){
            levelUp=5;
            updateImage();
        }if(Counter.value>500 && Counter.value <=600){
            levelUp=6;
            updateImage();
        }if(Counter.value>600 && Counter.value <=700){
            levelUp=7;
            updateImage();
        }

     
    }
    
    public void add(int levelUp){
        levelUp += kurang;
    }
    
    public int getValue() {
        return levelUp;
    }
    
    public void updateImage() {
        GreenfootImage background = new GreenfootImage(200, 30);
        GreenfootImage text = new GreenfootImage("Level : " + levelUp, 22, Color.WHITE, transparent);
        background.drawImage(text, background.getWidth()/2, (background.getHeight()-text.getHeight())/2);
        setImage(background);
    }
    }    