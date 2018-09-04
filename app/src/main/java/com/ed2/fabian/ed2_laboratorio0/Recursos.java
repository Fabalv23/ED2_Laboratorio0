package com.ed2.fabian.ed2_laboratorio0;

import java.util.HashMap;
import java.util.Map;

public class Recursos {

    Map<String,Cancion> biblioteca = new HashMap<>();

    //Biblioteca de canciones
    public Recursos() {
        biblioteca.put("Billie Jean",new Cancion("Billie Jean",240000,"THIS IS IT","Michael J"));
        biblioteca.put("Black Or White",new Cancion("Black Or White",120000,"THIS IS IT","Michael J"));
        biblioteca.put("Thriller",new Cancion("Thriller",300000,"THIS IS IT","Michael J"));
        biblioteca.put("Off the Wall",new Cancion("Off the Wall",210000,"THIS IS IT","Michael J"));
        biblioteca.put("You Are not Alone",new Cancion("You Are not Alone",240000,"THIS IS IT","Michael J"));
        biblioteca.put("Africa",new Cancion("Africa",300000,"TOTO IV","TOTO"));
        biblioteca.put("Take On Me",new Cancion("Take On Me",225000,"Huntig High","a-ha"));
        biblioteca.put("I Was Made For Loving You",new Cancion("I Was Made For Loving You",270000,"Greatest KISS","KISS"));
        biblioteca.put("Another Day In Paradise",new Cancion("Another Day In Paradise",318000,"But Seriusly","Phill Collins"));
        biblioteca.put("Pump It",new Cancion("Pump It",198000,"Monkey Business","Black Eyed Peas"));
        biblioteca.put("I Gotta Feeling",new Cancion("I Gotta Feeling",288000,"Monkey Business","Black Eyed Peas"));
        biblioteca.put("One Dance",new Cancion("One Dance",180000,"Views","Drake"));
        biblioteca.put("Thunder",new Cancion("Thunder",260000,"Envolve","Imagine Dragons"));
        biblioteca.put("Believer",new Cancion("Believer",310000,"Envolve","Imagine Dragons"));
        biblioteca.put("Whatever it takes",new Cancion("Whatever it takes",340000,"Envolve","Imagine Dragons"));
        biblioteca.put("Material Girl",new Cancion("Material Girl",120000,"Like a Virgin","Madonna"));
        biblioteca.put("Who can it be now?",new Cancion("Who can it be now?",400000,"Super Hits","Men at work"));
        biblioteca.put("I believe i can fly",new Cancion("I believe i can fly",370000,"The R. In","R. Kelly"));
        biblioteca.put("Boys",new Cancion("Boys",350000,"Great Hits","Sabrina"));
        biblioteca.put("Wind Of Change",new Cancion("Wind Of Change",700000,"Crazy World","Scorpions"));

    }
    //busqueda de canciones
    public Cancion search (String llave){
        return biblioteca.get(llave);
    }

}
