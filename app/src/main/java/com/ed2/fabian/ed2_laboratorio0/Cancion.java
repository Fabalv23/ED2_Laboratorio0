package com.ed2.fabian.ed2_laboratorio0;

public class Cancion {

    private String nombre;
    private int duracion;
    private String album;
    private String artista;


    public Cancion(String nombre, int duracion, String album, String artista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.album = album;
        this.artista = artista;
    }

    public Cancion(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
