package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int ventas = 0; 

    private static ArrayList<Pais> paises = new ArrayList<Pais>(); 

    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void incrementarVentas() {
        this.ventas++;
    }

    public static Pais paisMasVendedor() {
            Pais i= paises.get(0);
            for(Pais in:paises){
                if (i.ventas<in.ventas){
                    i=in;
                }
            }
            return i;
        }
}