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
    private String marca;
    private float cilindraje;
    
    /**
     *  Constructor de objetos Carro
     * @param   placa   placa que identifica cada carro
     * @param   marca   la marca del carro, ej: Renault Symbol, Mazda 2, etc.
     * @param   modelo  el modelo o año del carro, por ejemplo: 1998, 2011, etc.
     */
    public Carro(String placa, String marca, float cilindraje) 
    {
        this.placa = placa;
        this.marca = marca;
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
    public String getMarca() 
    {
        return marca;
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
    

