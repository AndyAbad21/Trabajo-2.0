/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public interface IPais
{
    public Provincia crear(String nPr, String gPr, int nCPr, int nHPr, int aFPr);
    public ArrayList<Provincia> listar();
    public Provincia modificar(String nPr, String gPr, int nCPr, int nHPr, int aFPr, int c);
    public Provincia eliminar(int c);
}
