import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * La clase MoverObjetos define los movimientos del jugador,
 * los momivientos del enemigo
 */
public class MoverObjetos extends Actor
{
    private static final double velocidad = 5.0;
    /**
     * Gira 90 grados a la derecha.
     */
    public void turn()
    {
        turn(90);
    }
     /**
     * Gira la X grados dependiendo del valor que se le asigne
     */
    public void turn(int angulo)
    {
        setRotation(getRotation() + angulo);
    }
     /**
     * Mueve al objeto una posicion en la direccion actual
     */
    public void move()
    {
        move(velocidad);
    }
    
    /**
     * Muevo una direccion especifica en la direccion actual
     */
    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }
     /**
     * Este metodo verifica si existe algun muro alrededor
     * La instruccion "getNeighbours" devuelve los Objetos vecinos de una distancia
     * La distancia es 40; el True incluye las diagonales; solamente checa en la clase muro
     */
    public boolean ExisteMuro()
    {
        List list=getNeighbours(40,true, Muro.class);
        if(list.size()!=0)
            return true; //Si la lista no esta vacia,significa que hay un muro
        else
            return false; //No hay muros alrededor
    }
}
