import java.util.HashSet;
import java.util.Scanner;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<Integer>();
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                selectionMenu();
                int selectedChoice = input.next().charAt(0);
                selectedChoice = Character.toLowerCase(selectedChoice);
                if (selectedChoice == 'a') {
                    System.out.println("");
                    System.out.print("Enter a number you want to add? ");
                    int number = input.nextInt();
                    System.out.println("");
                           if (numberSet.contains(number) ){
                                System.out.println("ERROR!  Number Already Exist in the HashSet");
                                System.out.println("");
                           }else{
                                numberSet.add(number);
                                System.out.println("Number " + number + " is successfully added to the Set\n");
                           }

                } else if (selectedChoice == 'b') {
                    System.out.println("\nEnter a number to remove: ");
                    int numbersToRemove = input.nextInt();
                    if (numberSet.contains(numbersToRemove)) {
                        numberSet.remove(Integer.valueOf(numbersToRemove));
                        System.out.println("REMOVED SUCCESSFULLY!");
                    } else {
                        System.out.println("Number does not exist");
                    }
                } else if (selectedChoice == 'c') {
                    System.out.println("Your Number List: " + numberSet);
                } else if (selectedChoice == 'd') {
                    numberSet.clear();
                    System.out.println("The list has now been cleared");
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






