package summerClasses.BusTicketSystem;

public class Address {
    public String street;
    public String city;
    public String state;

    //Non Parameterized Constructor
    public Address(){

    }
    //Parameterized Constructor
    public Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
