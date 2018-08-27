/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentavehiculos;

/**
 *
 * @author josearangos
 */
public class CarFactory {
    
  public enum carType {
    FamiliarCar,SportCar,StandarCar 
  }

    public CarFactory() {
    }
  
  
    
  public Car createCar(carType typeCar){
      switch (typeCar) {
          case FamiliarCar:
              return  new FamiliarCar();
          case SportCar:
              return  new SportCar();
          case StandarCar:
              return new StandarCar();
          default:
        throw new IllegalArgumentException("No se tiene ese tipo de carro");
      }

  }
    
    
    
}
