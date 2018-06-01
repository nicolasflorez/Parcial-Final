/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Estudiantes
 */
public class Vehiculo implements Ivehiculo{
    
    private String placa;
    private String propietario;
    private float cilindraje;
    

    public Vehiculo(String placa, String propietario, float cilindraje) 
    {
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
    }
    
    /**
     * Método para consultar la placa
     * @return  la placa del carro
     */
    public String getPlaca() 
    {
        return placa;
    }
    /**
     * Método para consultar la marca
     * @return  la marca del carro
     */
    public String getPropietario() 
    {
        return propietario;
    }

     /**
     * Método para consultar el modelo
     * @return  el modelo (año) del carro
     */
    public float getCilindraje() 
    {
        return cilindraje;
    }   

}  
    

