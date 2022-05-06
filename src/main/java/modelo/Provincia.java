/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Provincia 
{
    private String nombre;
    private String gobernador;
    private int numCiudades;
    private int numHabitantes;
    private int anioFundacion;
    //Constructor
    public Provincia(String nombre, String gobernador, int numCiudades,
                     int numHabitantes, int anioFundacion)
    {
        this.nombre=nombre;
        this.gobernador=gobernador;
        this.numCiudades=numCiudades;
        this.numHabitantes=numHabitantes;
        this.anioFundacion=anioFundacion;
    }
    //Getters y Setters
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    public void setGobernador(String nombre)
    {
        this.nombre=nombre;
    }
    public String getGobernador()
    {
        return nombre;
    }
    
    public void setNumCiudades(int numCiudades)
    {
        this.numCiudades=numCiudades;
    }
    public int getNumCiudades()
    {
        return numCiudades;
    }
    
    public void setNumHabitantes(int numHabitantes)
    {
        this.numHabitantes=numHabitantes;
    }
    public int getNumHabitantes()
    {
        return numHabitantes;
    }
    
    public void setAnioFundacion(int anioFundacion)
    {
        this.anioFundacion=anioFundacion;
    }
    public int getAnioFundacion()
    {
        return anioFundacion;
    }
    
    public int calcularAniosDesdeFundacion(int anioActual)
    {
        int anioF;
        return anioF=anioActual-anioFundacion;
    }
    public boolean calcularLimites()
    {
        boolean llave;
        if(numHabitantes>=1000 && numHabitantes<=1000000)
        {
            llave=true;
        }else{
            llave=false;
        }
        return llave;
    }
    //Sobreescritura del metodo to String 
    @Override
    public String toString ()
    {
        return "Nombre: "+nombre+"\n"+"Gobernador: "+gobernador+"\n"+
                "Numero de ciudades: "+numCiudades+"\n"+"Numero de Habitantes: "+
                numHabitantes+"\n"+"Anio de Fundacion: "+anioFundacion+"\n";
    }
}
