package main.dosw.semana_2.pokemon;

import java.util.Objects;

public class Pokemon {
    private Long id;
    private String nombre;
    private String tipo;
    private int nivel;
    private double poderCombate;
    private String region;
    private boolean legendario;
    
    //Atributo extra utilizado para Ejercicio 8
    private boolean puedeEvolucionar;

    //CONSTRUCTORES

    //Usado para Ejercicio 1
    public Pokemon(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //Usado para varios Ejercicios
    public Pokemon (String nombre, String tipo, int nivel){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    //Usado para Ejercicio 8
    public Pokemon(String nombre, boolean puedeEvolucionar){
        this.nombre = nombre;
        this.puedeEvolucionar = puedeEvolucionar;
    }

    public Pokemon(long id, String nombre, String tipo, int nivel, double poderCombate, String region, boolean legendario){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.poderCombate = poderCombate;
        this.region = region;
        this.legendario = legendario;
    }

    public Long getId(){return id;}
    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public int getNivel (){return nivel;}
    public double getPoderCombate(){return poderCombate;}
    public String getRegion(){return region;}
    public boolean Eslegendario() {return legendario;}
    
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
