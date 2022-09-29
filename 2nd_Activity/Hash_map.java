import java.util.HashMap;
import java.util.Scanner;

public class Hash_map {
     public static boolean isPrime(int in) {
        if (in < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(in); i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> hashmapList = new HashMap<Integer, String>();
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                selectionMenu();
                int selectedChoice = input.next().charAt(0);
                selectedChoice = Character.toLowerCase(selectedChoice);
                if (selectedChoice == 'a') {
                     System.out.println("Key: ");
                        int number = input.nextInt();
                        System.out.println("Value: ");
                        String value = input.next();
                        while (true) {
                            if (isPrime(number)) {
                                System.out.println("Your Input is a Prime Number!\n");
                                System.out.println("Input a key number and value to add: ");
                                System.out.println("Key: ");
                                number = input.nextInt();
                                System.out.println("Value: ");
                                value = input.next();
                            } else {

                                hashmapList.put(number, value);
                                System.out.println("\nKey: " + number + " and Value: " + value + "|| ADDED SUCCESSFULLY!");
                                break;
                            }
                    }

                } else if (selectedChoice == 'b') {
                    System.out.println("\nEnter a number to remove: ");
                        int remove = input.nextInt();
                        hashmapList.remove(Integer.valueOf(remove));
                        System.out.println("REMOVED SUCCESSFULLY!");
                } else if (selectedChoice == 'c') {
                    System.out.println("HashMap: " + hashmapList);
                } else if (selectedChoice == 'd') {
                    hashmapList.clear();
                    System.out.println("The HashMap List has now been cleared");
                } else if (selectedChoice == 'e') {
                    System.out.println("Application has been closed!");
                    break;
                } else{
                    System.out.println("Not in the choices! Enter other option.\n");
}
            }
        }
        
    }

    private static void selectionMenu() {
        System.out.println("========================================");
        System.out.println("Selection Menu\n");
        System.out.print("A.) Add number \n");
        System.out.print("B.) Remove number\n");
        System.out.print("C.) Display numbers \n");
        System.out.print("D.) Clear numbers\n");
        System.out.print("E.) Exit\n");
         System.out.println("========================================");
        System.out.print("\nEnter Your Choice: ");
        
    }
}




