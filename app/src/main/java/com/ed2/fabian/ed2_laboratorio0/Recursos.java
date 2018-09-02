package com.ed2.fabian.ed2_laboratorio0;

import java.util.HashMap;
import java.util.Map;

public class Recursos {

    Map<String,Cancion> biblioteca = new HashMap<>();

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

    }

    public Cancion search(String llave){
        return biblioteca.get(llave);
    }

}
