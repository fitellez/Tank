import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Muro muro = new Muro();
        addObject(muro,97,21);
        Muro muro2 = new Muro();
        addObject(muro2,105,56);
        muro2.setLocation(97,50);
        muro.setLocation(82,18);
        muro2.setLocation(82,47);
        Muro muro3 = new Muro();
        addObject(muro3,89,81);
        Muro muro4 = new Muro();
        addObject(muro4,92,122);
        Muro muro5 = new Muro();
        addObject(muro5,89,161);
        Muro muro6 = new Muro();
        addObject(muro6,242,189);
        Muro muro7 = new Muro();
        addObject(muro7,301,130);
        Muro muro8 = new Muro();
        addObject(muro8,285,76);
        Muro muro9 = new Muro();
        addObject(muro9,176,117);
        Muro muro10 = new Muro();
        addObject(muro10,188,231);
        Muro muro11 = new Muro();
        addObject(muro11,394,310);
        Muro muro12 = new Muro();
        addObject(muro12,438,310);
        Muro muro13 = new Muro();
        addObject(muro13,419,310);
        Muro muro14 = new Muro();
        addObject(muro14,409,187);
        Muro muro15 = new Muro();
        addObject(muro15,438,160);
        Muro muro16 = new Muro();
        addObject(muro16,446,129);
        Muro muro17 = new Muro();
        addObject(muro17,486,126);
        Muro muro18 = new Muro();
        addObject(muro18,455,194);
        Muro muro19 = new Muro();
        addObject(muro19,443,196);
        Muro muro20 = new Muro();
        addObject(muro20,441,194);
        Muro muro21 = new Muro();
        addObject(muro21,297,218);
        Muro muro22 = new Muro();
        addObject(muro22,355,257);
        Muro muro23 = new Muro();
        addObject(muro23,441,280);
        Muro muro24 = new Muro();
        addObject(muro24,461,282);
        Muro muro25 = new Muro();
        addObject(muro25,437,262);
        Muro muro26 = new Muro();
        addObject(muro26,326,257);
        Muro muro27 = new Muro();
        addObject(muro27,271,293);
        muro3.setLocation(82,76);
        muro4.setLocation(82,105);
        muro9.setLocation(111,105);
        muro5.setLocation(140,105);
        muro8.setLocation(169,105);
        muro6.setLocation(241,117);
        muro6.setLocation(203,106);
        Pozo pozo = new Pozo();
        addObject(pozo,265,45);
        muro6.setLocation(169,130);
        pozo.setLocation(280,27);
        muro7.setLocation(275,66);
        muro14.setLocation(303,66);
        muro15.setLocation(332,66);
        muro16.setLocation(333,42);
        muro16.setLocation(333,38);
        muro17.setLocation(333,14);
        muro20.setLocation(275,95);
        muro19.setLocation(275,122);
        muro18.setLocation(275,151);
        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,534,44);
        Enemigo2 enemigo2 = new Enemigo2();
        addObject(enemigo2,172,32);
        Enemigo3 enemigo3 = new Enemigo3();
        addObject(enemigo3,34,39);
        muro10.setLocation(130,189);
        muro21.setLocation(246,64);
        muro21.setLocation(374,184);
        muro6.setLocation(198,105);
        muro10.setLocation(198,134);
        muro21.setLocation(198,163);
        muro26.setLocation(275,180);
        muro22.setLocation(304,180);
        muro27.setLocation(332,180);
        muro25.setLocation(361,180);
        muro23.setLocation(540,98);
        muro24.setLocation(540,127);
        muro12.setLocation(540,155);
        muro13.setLocation(540,184);
        muro11.setLocation(540,213);
        Muro muro28 = new Muro();
        addObject(muro28,215,286);
        Muro muro29 = new Muro();
        addObject(muro29,352,289);
        Muro muro30 = new Muro();
        addObject(muro30,380,302);
        Muro muro31 = new Muro();
        addObject(muro31,284,338);
        Muro muro32 = new Muro();
        addObject(muro32,224,334);
        Muro muro33 = new Muro();
        addObject(muro33,78,320);
        Muro muro34 = new Muro();
        addObject(muro34,116,291);
        Muro muro35 = new Muro();
        addObject(muro35,228,277);
        Muro muro36 = new Muro();
        addObject(muro36,364,300);
        Muro muro37 = new Muro();
        addObject(muro37,468,315);
        Muro muro38 = new Muro();
        addObject(muro38,496,308);
        Muro muro39 = new Muro();
        addObject(muro39,492,289);
        Muro muro40 = new Muro();
        addObject(muro40,481,352);
        Muro muro41 = new Muro();
        addObject(muro41,393,344);
        Muro muro42 = new Muro();
        addObject(muro42,393,344);
        muro35.setLocation(198,192);
        muro28.setLocation(275,209);
        muro32.setLocation(198,221);
        muro31.setLocation(82,133);
        muro34.setLocation(15,144);
        muro33.setLocation(15,173);
        muro29.setLocation(16,203);
        muro29.setLocation(6,203);
        muro29.setLocation(4,203);
        muro33.setLocation(3,173);
        muro34.setLocation(4,144);
        muro33.setLocation(4,173);
        muro36.setLocation(6,116);
        muro36.setLocation(4,116);
        muro42.setLocation(6,87);
        muro42.setLocation(6,87);
        muro42.setLocation(5,87);
        enemigo3.setLocation(48,42);
        muro30.setLocation(3,60);
        muro42.setLocation(4,87);
        muro30.setLocation(3,58);
        muro30.setLocation(3,60);
        muro42.setLocation(3,87);
        muro36.setLocation(3,116);
        muro41.setLocation(3,32);
        muro37.setLocation(468,315);
        muro37.setLocation(468,315);
        muro37.setLocation(468,315);
        muro37.setLocation(468,315);
        muro37.setLocation(4,5);
        muro40.setLocation(33,3);
        muro40.setLocation(33,4);
        muro39.setLocation(62,8);
        muro39.setLocation(62,5);
        muro.setLocation(90,5);
        muro2.setLocation(90,33);
        muro40.setLocation(33,5);
        muro3.setLocation(90,63);
        muro4.setLocation(90,92);
        muro9.setLocation(111,155);
        muro31.setLocation(90,120);
        muro5.setLocation(119,63);
        muro8.setLocation(148,63);
        muro9.setLocation(177,63);
        muro6.setLocation(206,63);
        muro10.setLocation(206,91);
        muro21.setLocation(206,119);
        muro35.setLocation(207,147);
        muro35.setLocation(206,147);
        muro32.setLocation(206,174);
        muro31.setLocation(90,119);
        muro34.setLocation(3,144);
        muro33.setLocation(3,173);
        muro29.setLocation(3,201);
        MoverObjetos a=new Tanque_Jugador();
        addObject(a,225,380);
        a.turn(270);
        Muro muro43 = new Muro();
        addObject(muro43,396,187);
        muro43.setLocation(390,180);
        enemigo1.setLocation(342,249);
        Enemigo3 enemigo32 = new Enemigo3();
        addObject(enemigo32,215,281);
        Enemigo2 enemigo22 = new Enemigo2();
        addObject(enemigo22,276,283);
        enemigo32.setLocation(213,263);
        enemigo22.setLocation(270,262);
        enemigo1.setLocation(342,284);
        muro17.setLocation(362,14);
        muro16.setLocation(362,39);
        muro15.setLocation(362,65);
        muro14.setLocation(333,67);
        muro14.setLocation(336,65);
        muro14.setLocation(334,65);
        muro7.setLocation(305,66);
        pozo.setLocation(325,24);
        muro7.setLocation(305,65);
        muro20.setLocation(305,93);
        muro19.setLocation(305,120);
        muro18.setLocation(305,148);
        muro22.setLocation(304,177);
        muro22.setLocation(306,177);
        muro22.setLocation(305,177);
        muro27.setLocation(334,177);
        muro25.setLocation(363,176);
        muro25.setLocation(363,177);
        muro43.setLocation(392,177);
        muro26.setLocation(90,148);
        muro28.setLocation(90,177);
        enemigo1.setLocation(342,106);
        removeObject(enemigo3);
        enemigo32.setLocation(386,103);
        Enemigo2 enemigo23 = new Enemigo2();
        addObject(enemigo23,62,49);
        Enemigo2 enemigo24 = new Enemigo2();
        addObject(enemigo24,173,109);
        enemigo23.setLocation(51,48);
        enemigo24.setLocation(174,101);
        Enemigo2 enemigo25 = new Enemigo2();
        addObject(enemigo25,540,317);
        enemigo25.setLocation(537,312);
        Enemigo2 enemigo26 = new Enemigo2();
        addObject(enemigo26,498,33);
        enemigo26.setLocation(494,28);
    }
    
    /**Crea el tanque del jugador en la posicion X,Y seleccionados
       *Junto con una rotacion establecida*/
   public void creaJugador(){
       MoverObjetos a=new Tanque_Jugador();
        addObject(a,225,380);
        a.turn(270);
       
    }
}
