package rentavehiculos;

/**
 *
 * @author josearangos
 */
public class Customer {

private int id;
private String name;
private String gender;
private String type;// VIP standar

    public Customer(int id, String name, String gender, String type) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.type = type;
    }

    public Customer() {
    }

    Customer(String id, String name, String gender, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    
 


    
}
