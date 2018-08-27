package rentavehiculos;

import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josearangos
 */
public class main {

    

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) throws ParseException {

        AppRentaVehiculoSingleton appRentaVehiculoSingleton = AppRentaVehiculoSingleton.getAppRentaVehiculo();
        appRentaVehiculoSingleton.Menu();
        
        
      
    }
    
    
   
    
}
