/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import javax.swing.JOptionPane;
import static parcialpoo.Ivehiculo.cilindraje;
import static parcialpoo.Ivehiculo.propietario;

/**
 *
 * @author Estudiantes
 */
public class Control {
    
 
     
    
    Parqueadero parquea = new Parqueadero();


    public void ingresarVehiculo() 
    {
            String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
            
            if (parquea.buscarVehiculo(placa) == null) 
            {
                
                
             
                Vehiculo nuevo = new Vehiculo(placa, propietario, cilindraje);
                boolean pudoParquear = parquea.ingresarVehiculo(nuevo);
                if (pudoParquear) 
                {
                   JOptionPane.showMessageDialog(null,"El vehiculo fue parqueado exitosamente.");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"No fue posible parquear el vehiculo. Intente más tarde");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Ya hay un vehiculo parqueado con esa placa.");
            }
    }
    
    
    public void buscarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
        Vehiculo vehiculo = parquea.buscarVehiculo(placa);
        if (vehiculo == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un vehiculo con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del vehiculo son:  \n" +
                                    "Placa: "+ vehiculo.getPlaca() + "\n"+
                                    "Propietario: "+ vehiculo.getPropietario());
        }
    }

 
    public void retirarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
        boolean pudoSacar = parquea.retirarVehiculo(placa);
        if (pudoSacar) 
        {
            JOptionPane.showMessageDialog(null,"El vehiculo se retiró del parqueadero exitosamente");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un vehiculo con esa placa");
        }
    }

   
    public void menu() {
        
        int opcion=-1;
        do {
         
            String valorSeleccionado = 
            JOptionPane.showInputDialog(" ---- MENU PARQUEADERO ---  \n" +
                        "1.Parquear un carro    \n" +
                        "2.Buscar un carro  \n" +
                        "3.Sacar un carro   \n" +
                        "0.Terminar     \n\n" +
                        "Opción seleccionada: ");
            try 
            {
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                   
                    case 1: ingresarVehiculo();
                            break;
                    
                    // Opcion 2: Buscar un carro y mostrar sus datos 
                    case 2: buscarVehiculo();
                            break;
                    
                    // Opcion 3: Sacar un carro del parqueadero
                    case 3: retirarVehiculo();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opción no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser numérico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminación exitosa -");

    }
    
}
