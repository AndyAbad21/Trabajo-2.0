/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Pais implements IPais
{
    private String nombre;
    private int anioFundacion;
    private int numProvincias;
    private String presidente;
    private final ArrayList<Provincia> provinciaList=new ArrayList();
    //Constructor
    public Pais(String nombre, int anioFundacion, int numProvincias, String presidente)
    {
        this.nombre=nombre;
        this.anioFundacion=anioFundacion;
        this.numProvincias=numProvincias;
        this.presidente=presidente;
        
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
    
    public void setAnioFundacion(int anioFundacion)
    {
        this.anioFundacion=anioFundacion;
    }
    public int getAnioFundacion()
    {
        return anioFundacion;
    }
    
    public void setNumProvincias(int numProvincias)
    {
        this.numProvincias=numProvincias;
    }
    public int getNumProvincias()
    {
        return numProvincias;
    }
    
    public void setPresidente(String presidente)
    {
        this.presidente=presidente;
    }
    public String getPresidente()
    {
        return presidente;
    }
    //Guardar la provincia en la lista
    @Override
    public Provincia crear(String nPr, String gPr, int nCPr, int nHPr, int aFPr) 
    {
        Provincia p=new Provincia(nPr, gPr, nCPr, nHPr, aFPr);
        provinciaList.add(p);
        return p;
    }
    //Listar la lista de provincias
    @Override
    public ArrayList<Provincia> listar() 
    {
        return provinciaList;
    }
    //Modificar un objeto de la lista 
    @Override
    public Provincia modificar(String nPr, String gPr, int nCPr, int nHPr, int aFPr, int c) 
    {
        Provincia provincia=new Provincia(nPr, gPr, nCPr, nHPr, aFPr);
        provinciaList.set(c, provincia);
        return provincia;
    }
    //Eliminar un objeto de la lista
    @Override
    public Provincia eliminar(int c)
    {
        Provincia provincia=provinciaList.get(c);
        provinciaList.remove(c);
        return provincia;
    }
    //Metodo para calcular cuantos hace cuantos anios fue creado
    public int calcularAniosDesdeFundacion(int anioActual)
    {
        int anioF;
        return anioF=anioActual-anioFundacion;
    }
    //Metodo para validar el Presidente
    public boolean validarPresidente(String presidenteA)
    {
        boolean llave;
        if(presidente.equals(presidenteA))
        {
            llave=true;
        }else
        {
            llave=false;
        }
        return llave;
    }
    //Sobreescritura del metodo to String 
    public String toString()
    {
        String cadena="";
        String provincia;
        for(Provincia c: provinciaList)
        {
            provincia=String.valueOf(c);
            cadena=cadena+provincia+"\n";
        }
        return "Nombre: "+nombre+"\n"+"Anio fundacion: "+anioFundacion+"\n"+
                "Numero de provincias: "+numProvincias+"\n"+"Presidente: "+
                presidente+"\n"+"\n"+cadena;
    }
}
