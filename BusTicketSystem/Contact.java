package summerClasses.BusTicketSystem;

public class Contact {
    private String name;
    private int Phone;
    private String email;

    public Contact(){

    }
    public Contact(String name,int Phone_number, String email){
        this.name=name;
        this.Phone=Phone_number;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", Phone=" + Phone +
                ", email='" + email + '\'' +
                '}';
    }
}


