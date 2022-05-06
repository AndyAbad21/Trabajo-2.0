/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
/**
 *
 * @author ASUS
 */
public class ControlPais
{
    Pais pais;
    public Pais crearPais(String nPa, int aFPa, int nPPa, String pPa)
    {
        if(validarFormatoLetras(nPa)&&validarAnioFundacion(2022, aFPa))
        {
            pais=new Pais(nPa, aFPa, nPPa, pPa);
            return pais;
        }
        throw new IllegalArgumentException("El anio o el nombre del pais ingresados "
                + "son incorrectos");
    }
    public Provincia crearProvincia(String nPr, String gPr, int nCPr, int nHPr, int aFPr)
    {
        return pais.crear(nPr, gPr, nCPr, nHPr, aFPr);
    }
    
    public Pais listar()
    {
        return pais;
    }
    public Provincia eliminarProvincia(int c)
    {
        return pais.eliminar(c);
    }
    public Provincia modificarProvincia(String nPr, String gPr, int nCPr, int nHPr, int aFPr, int c)
    {
        return pais.modificar(nPr, gPr, nCPr, nHPr, aFPr, c);
    }
    private boolean validarFormatoLetras(String cadena)
    {
        boolean llave=true;
        for(char c: cadena.toCharArray())
        {
            if(!((c >= 'a'&& c <= 'z') || (c >= 'A'&& c <= 'Z') || c == ' '))
                llave=false;
        }
        return llave;
    }
    private boolean validarAnioFundacion(int anio, int aFPa)
    {
        boolean llave;
        if(aFPa<anio)
        {
            llave=true;
        }else{
            llave=false;
        }
        return llave;
    }
}
