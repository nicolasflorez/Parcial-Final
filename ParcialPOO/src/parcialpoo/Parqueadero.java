/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;


public class Parqueadero 
{
 
 private Vehiculo[] misVehiculos = new Vehiculo[100];


  
 public boolean ingresarVehiculo(Vehiculo vehiculo) 
 {
  for (int i = 0; i < misVehiculos.length; i++) 
  {
   if (misVehiculos[i] == null)
   {
    misVehiculos[i] = vehiculo;
    return true;
   }
  }
  return false;
 }
 


  
 public boolean retirarVehiculo(String placa)
 {
  for (int i = 0; i < misVehiculos.length; i++) 
  {
   if (misVehiculos[i] != null)
   {
    if (misVehiculos[i].getPlaca().equals(placa))
    {
        
     misVehiculos[i] = null;
     return true;
    }
   }
  }
  return false;
 }
 public Vehiculo buscarVehiculo(String placa)
 {
  for (int i = 0; i < misVehiculos.length; i++) 
  {
   if (misVehiculos[i] != null)
   {
    if (misVehiculos[i].getPlaca().equals(placa))
    {
     return misVehiculos[i];
    }
   }
  }
  return null;
 }
 


} 





