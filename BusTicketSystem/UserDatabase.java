package summerClasses.BusTicketSystem;
import java.sql.*;

public class UserDatabase {
    public static String name;
    public static int number;
    public static String email;
    public static String street;
    public static  String city;
    public static String state;
    public static String password;


    public UserDatabase(String name, int number, String email,String street, String city,String state, String password){
        this.name=name;
        this.email=email;
        this.street=street;
        this.city=city;
        this.state=state;
        this.password=password;
        this.number=number;
    }

    public static void main(String[] args) throws SQLException {

            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus", "postgres", "9874");

                PreparedStatement preparedStatement = connection.prepareStatement("insert into detail values(?,?,?,?,?,?,?)");

                    preparedStatement.setString(1,name);
                    preparedStatement.setInt(2, number);
                    preparedStatement.setString(3, email);
                    preparedStatement.setString(4,street );
                    preparedStatement.setString(5, city);
                    preparedStatement.setString(6, state);
                    preparedStatement.setString(7, password);

                    preparedStatement.executeUpdate();

//            Statement statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery("select * from student");
//            System.out.println("INSIDE");
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2));
//            }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                connection.close();
            }


        }
    }

