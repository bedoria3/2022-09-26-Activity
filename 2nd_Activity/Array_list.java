import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
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
                    
                    if(number > 0){
                        numberList.add(number);
                        System.out.println("Number " + number + " is successfully added to the ArrayList\n");
                    }else{
                        System.out.println("Invalid! Your input is a negative integer.");
                    }

                } else if (selectedChoice == 'b') {
                    System.out.println("\nEnter a number to remove: ");
                    int numbersToRemove = input.nextInt();
                    if (numberList.contains(numbersToRemove)) {
                        numberList.remove(Integer.valueOf(numbersToRemove));
                        System.out.println("REMOVED SUCCESSFULLY!");
                    } else {
                        System.out.println("Number does not exist");
                    }
                } else if (selectedChoice == 'c') {
                    System.out.println("Your Number List: " + numberList);
                } else if (selectedChoice == 'd') {
                    numberList.clear();
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




