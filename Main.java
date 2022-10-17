import java.util.Scanner;

public class Main {


    static void reservation(){
        System.out.println("Do you want to make a reservation [Y]es [N]o?  ");
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();

        if (answer.equals("Y")){
            int numOfReservations= 0;
            System.out.println("What's the first name? ");
            String firstName = userInput.nextLine();
            System.out.println("Whats's the last name? ");
            String lastName = userInput.nextLine();
            Reservations vacation = new Reservations(firstName, lastName,8, 4, 541);
            System.out.println("Can't wait for you to stay with us! Reservaiton Number: " + numOfReservations);
            System.out.println(vacation.roomNumber);

        } else {
            System.out.println("Goodbye");
        }


    }

    public static void main(String[] args) {
        int numOfReservations= 0;
        reservation();
        numOfReservations++;
    }

}

