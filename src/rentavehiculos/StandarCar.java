
package rentavehiculos;

/**
 *
 * @author josearangos
 */
public class StandarCar implements Car{
    
    String placa;
    String cilindraje;
    String marca;
    String color;
    String transmicion;
    int numeroPuestos;
    
    float valorHora ;
    String seguro;// standar, todoRiesgo
    long stock; 


    public StandarCar() {
    }
    

      @Override
    public float getValorHora() {
        return valorHora;
    }

    @Override
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    @Override
    public String getSeguro() {
        return seguro;
    }

    @Override
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    @Override
    public long getStock() {
        return stock;
    }
    
    @Override
    public void setStock(long stock) {
        this.stock = stock;
    }
    
    
    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa=placa;
    }

    @Override
    public String getCilindraje() {
        return this.cilindraje;
    }

    @Override
    public void setCilindraje(String cilindraje) {
            this.cilindraje=cilindraje;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getTransmicion() {
        return this.transmicion;
    }

    @Override
    public void setTransmicion(String transmicion) {
        this.transmicion=transmicion;
    }

    @Override
    public int getNumeroPuestos() {
        return this.numeroPuestos;
    }

    @Override
    public void setNumeroPuestos(int numeroPuestos) {
           this.numeroPuestos=numeroPuestos;
    }
    
    
}
