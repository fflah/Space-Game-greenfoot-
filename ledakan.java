import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    private GreenfootImage image0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private GreenfootImage image9;
    private GreenfootImage image10;
    private GreenfootImage image11;
    private int wormsEaten;
    
    public ledakan(){
         image0 = new GreenfootImage("ledakan/ledakan0.png");
         image1 = new GreenfootImage("ledakanledakan1.png");
         image2 = new GreenfootImage("ledakanledakan2.png");
         image3 = new GreenfootImage("ledakanledakan3.png");
         image0 = new GreenfootImage("ledakanledakan4.png");
         image5 = new GreenfootImage("ledakanledakan5.png");
         image6 = new GreenfootImage("ledakanledakan6.png");
         image7 = new GreenfootImage("ledakanledakan7.png");
         image8 = new GreenfootImage("ledakanledakan8.png");
         image9 = new GreenfootImage("ledakanledakan9.png");
         image10 = new GreenfootImage("ledakanledakan10.png");
         image11 = new GreenfootImage("ledakanledakan11.png");
         setImage (image1);
         
        
    }
    
    public void act() 
    {
        // Add your action code here.
        ledakGif();
    }
    
    public void ledakGif(){
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    
}
