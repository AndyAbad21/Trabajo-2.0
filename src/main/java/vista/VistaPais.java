/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;
import controlador.*;
/**
 *
 * @author ASUS
 */
public class VistaPais {

    public static void main(String[] args)
    {
        ControlPais cp=new ControlPais();
        cp.crearPais("Ecuador", 1987, 24, "Gillermo Lazo");
        System.out.println("Anios desde fundacion: "+
                cp.listar().calcularAniosDesdeFundacion(2022));
        System.out.println("El nombre del presidente el valido: "+cp.listar().validarPresidente("Gillermo Lazo"));
        
        cp.crearProvincia("Azuay", "Oswaldo Larriva", 9, 100000, 1577);
        cp.crearProvincia("El oro", "Pepito", 10, 85500, 1845);
        cp.crearProvincia("Pichincha", "Jose", 15, 75515, 1758);
        System.out.println(cp.listar());
        //Usar el metodo modificar
        System.out.println("Lista modificada");
        cp.modificarProvincia("Azuay", "Jorge", 10, 722254, 1577, 1);
        System.out.println(cp.listar());
        //Usar el eliminar
        System.out.println("Lista eliminada");
        cp.eliminarProvincia(1);
        System.out.println(cp.listar());
                
        
    }
}
