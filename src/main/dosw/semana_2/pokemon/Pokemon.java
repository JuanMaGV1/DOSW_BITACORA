package main.dosw.semana_2.pokemon;

import java.util.Objects;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private boolean puedeEvolucionar;

    public Pokemon(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Pokemon (String nombre, String tipo, int nivel){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Pokemon(String nombre, boolean puedeEvolucionar){
        this.nombre = nombre;
        this.puedeEvolucionar = puedeEvolucionar;
    }

    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public int getNivel (){return nivel;}
    public boolean puedeEvolucionar(){return puedeEvolucionar;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pokemon pokemon = (Pokemon) obj;
        return nivel == pokemon.nivel && Objects.equals(nombre, pokemon.nombre) && Objects.equals(tipo, pokemon.tipo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, nivel);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
