package vehiculos;

import java.util.ArrayList;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas = 0; 
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getVentas() {
        return ventas;
    }

    public void incrementarVentas() {
        this.ventas++;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante i= fabricantes.get(0);
        for(Fabricante in:fabricantes){
            if (i.ventas<in.ventas){
                i=in;
            }
        }
        return i;
    }
}