package summerClasses.BusTicketSystem;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************************************************");
        System.out.println("                      WELCOME TO OUR BUS MANAGMENT SYSTEM                     ");
        System.out.println("Program by:- Rahul NB");
        System.out.println("******************************************************************************");
        System.out.println();


        SignUpLogin signUpLogin = new SignUpLogin();
        BusOperator busOperator = new BusOperator();
        busOperator.addBus("Bus101", "Amit travels", "Bhilwara", "Phagwara", 1200, 5);
        busOperator.addBus("Bus102", "Chirag travels", "Bhilwara", "Shikhar", 1200, 3);
        busOperator.addBus("Bus103", "Laxmi travels", "Bhilwara", "Jaipur", 1200, 2);
        busOperator.addBus("Bus104", "ZigZag travels", "Bhilwara", "Phagwara", 1200, 1);

        boolean bol=true;       //for taking input from user until user wants to exit.
        while (bol) {
            System.out.println("Press 1 for User Signup\nPress 2 for User Login\nPress 3 for Exit");
            int choice = sc.nextInt();

            if (choice == 1) {     //User Signup
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter Phone number");
                int number = sc.nextInt();
                System.out.println("Enter Email");
                String email = sc.next();
                System.out.println("Enter Street");
                String street = sc.next();
                System.out.println("Enter City");
                String city = sc.next();
                System.out.println("Enter State");
                String state = sc.next();
                System.out.println("Enter Password");
                String password = sc.next();
                System.out.println(signUpLogin.signup(name, number, email, street, city, state, password));

            }

            if (choice == 2) {      //User Login
                System.out.println("Enter Email");
                String email = sc.next();

                System.out.println("Enter Password");
                String password = sc.next();

                String Log = signUpLogin.login(email, password);
                System.out.println(Log);
                //If user login successfully then the user can see if the bus is available or not
                if (Log == "Login succesfull") {
                    boolean bol2 = true;

                    while (bol2) {
                        System.out.println("Press 4 to check bus\nPress 5 to change password\nPress 6 to go back");
                        int busDetail = sc.nextInt();

                        if (busDetail == 4) {       // to check if bus is available  or not
                            System.out.println("Enter source");
                            String source = sc.next();
                            System.out.println("Enter destination");
                            String destination = sc.next();
                            List result = busOperator.searchBus(source, destination);
                            System.out.println(result);

                            //If bus is available then user can book ticket
                            if (!result.isEmpty()) {
                                System.out.println("press 'b' for booking and 'a' to go back");
                                String book = sc.next();
                                if (book.equals("b")) {     // to book ticket
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.println("Enter Operators name which you want to book");
                                    String operator = scanner.nextLine();
                                    busOperator.busBooking(operator);
                                }
                            }
                        }
                        if (busDetail == 5) {       //If registered user wants to change his/her password
                            System.out.println("Enter new password");
                            String pass = sc.next();
                            System.out.println(signUpLogin.changePass(email, pass));
                        }

                        if (busDetail == 6) {       //Go back to main menu
                            bol2 = false;
                        }
                    }

                }
            }
                if(choice==3){  //Exit the program
                    bol=false;
                }
            }
        }
    }

