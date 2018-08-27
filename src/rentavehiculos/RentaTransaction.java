/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentavehiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author josearangos
 */
public class RentaTransaction {
    

    
    private int id=1;
    private String fecha; // formato "DD/MM/YYYY"
    private String pickUpDate; //formato "DD/MM/YYYY"
    private String returnDate; //formato "DD/MM/YYYY"
    private float valorHora;
    private float valorTotal;
    private Customer customer;
    private Car car;

    public int getId() {
        return id;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public RentaTransaction(String fecha, String pickUpDate, String returnDate, Customer customer, Car car) throws ParseException {
        this.id = id+1;
        this.fecha = fecha;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.car=car;
        this.customer=customer;
        this.valorHora=this.car.getValorHora();
        this.valorTotal=this.numeroDias()*this.valorTotal;
        car.setStock(car.getStock()-1);// por que ya se realizo una renta
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
   
    
    public int numeroDias() throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");      
        
        return   (int) ((dateFormat.parse(this.returnDate).getTime()-dateFormat.parse(this.pickUpDate).getTime())/86400000);
    }
    
    
}
