package rentavehiculos;

import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josearangos
 */
public class AppRentaVehiculoSingleton {

    private static AppRentaVehiculoSingleton UnicaAppRentaVehiculo;

    public static Customer customer;
    public static CarFactory fabricaCar = new CarFactory();
    public static Car carroDeportivo1 = fabricaCar.createCar(CarFactory.carType.SportCar);
    public static RentaTransaction rentaTransaction;
    public static Car carroFamiliar = fabricaCar.createCar(CarFactory.carType.FamiliarCar);
    public static Car carroStandar = fabricaCar.createCar(CarFactory.carType.StandarCar);
    public static Car car;

    public static void inicializarCarros() {

        carroDeportivo1.setColor("Rojo");
        carroDeportivo1.setCilindraje("50 C.C");
        carroDeportivo1.setMarca("BMW");
        carroDeportivo1.setNumeroPuestos(5);
        carroDeportivo1.setPlaca("EFG345");
        carroDeportivo1.setSeguro("Standar");
        carroDeportivo1.setStock(15);
        carroDeportivo1.setValorHora(25000);
        carroDeportivo1.setTransmicion("Automatica");

        carroFamiliar.setColor("Azul");
        carroFamiliar.setCilindraje("80 C.C");
        carroFamiliar.setMarca("Ferrari");
        carroFamiliar.setNumeroPuestos(7);
        carroFamiliar.setPlaca("PPP345");
        carroFamiliar.setSeguro("Standar");
        carroFamiliar.setStock(100);
        carroFamiliar.setValorHora(77000);
        carroFamiliar.setTransmicion("Automatica");

        carroStandar.setColor("Azul marino");
        carroStandar.setCilindraje("200 C.C");
        carroStandar.setMarca("Toyota");
        carroStandar.setNumeroPuestos(6);
        carroStandar.setPlaca("TYT345");
        carroStandar.setSeguro("Standar");
        carroStandar.setStock(75);
        carroStandar.setValorHora(114000);
        carroStandar.setTransmicion("Automatica");

    }

    private AppRentaVehiculoSingleton() {
    }

    public static void Menu() throws ParseException {

        boolean salir = false;
        int opcion;
        Scanner teclado = new Scanner(System.in);

        while (!salir) {

            System.out.println("1. Crear usuario");
            System.out.println("2. Rentar vehiculo");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        AppRentaVehiculoSingleton.crearUsuario();

                        break;
                    case 2:
                        AppRentaVehiculoSingleton.RentarVehiculo();
                        System.out.println("Renta exitosa!!!!");
                        break;
                    case 3:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }

        }

    }

    public static AppRentaVehiculoSingleton getAppRentaVehiculo() {
        if (UnicaAppRentaVehiculo == null) {
            UnicaAppRentaVehiculo = new AppRentaVehiculoSingleton();
        }
        return UnicaAppRentaVehiculo;

    }

    public static void crearUsuario() {
        Scanner teclado = new Scanner(System.in);
        int id;
        String name;
        String gender;
        String type;
        System.out.println("Ingrese Id del cliente: ");
        id = Integer.valueOf(teclado.nextLine());
        System.out.println("Ingrese el nombre del cliente: ");
        name = teclado.nextLine();
        System.out.println("Ingrese el genero del cliente (Masculino/Femenino): ");
        gender = teclado.nextLine();
        System.out.println("Ingrese el tipo de cliente (Standar/VIP): ");
        type = teclado.nextLine();// VIP standar
        customer = new Customer(id, name, gender, type);

    }

    public static void RentarVehiculo() throws ParseException {
        Date fecha = new Date();
        String pickUpDate = "";
        String fechaCreacionRenta = fecha.toString();
        String returnDate = "";
        String typeCar = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Debes crear un cliente primero");

        AppRentaVehiculoSingleton.crearUsuario();

        System.out.println("Que tipo de carro desea rentar (F:Familiar/D:Deportivo/S:Standar)");
        typeCar = teclado.nextLine();

        switch (typeCar) {
            case "F":
                car = carroFamiliar;
                break;
            case "D":
                car = carroDeportivo1;
                break;
            case "S":
                car = carroStandar;
                break;
            default:

                System.out.println("Error este tipo de vehiculo no existe");
        }

        if (car.getStock() == 0) {
            System.out.println("No hay unidades de vehiculo para la renta");
        } else {
            System.out.println("Ingrese pickUpDate con el formato yyyy-MM-dd: ");
            pickUpDate = teclado.nextLine();
            System.out.println("Ingrese returnDate con el formato yyyy-MM-dd: ");
            returnDate = teclado.nextLine();

            rentaTransaction = new RentaTransaction(fechaCreacionRenta, pickUpDate, returnDate, customer, car);

        }

    }

}
