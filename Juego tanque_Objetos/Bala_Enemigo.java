import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bala del Enemigo
 */
public class Bala_Enemigo extends MoverObjetos
{
    private int dir; //direccion de la bala del Enemigo
    public void act() 
    {
        move();
    }    
    
    Bala_Enemigo(int direccion){
        dir=direccion; 
        setRotation(dir);
    }
}
