import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set {
    public static void main(String[] args){
        HashSet<String> info = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?" );
        String name = sc.nextLine();
        System.out.println("What is your favorite food");
        String food = sc.nextLine();
        System.out.println("What is your favorite color?");
        String color = sc.nextLine();
        System.out.println("Where do you live?");
        String address = sc.nextLine();
        System.out.println("Where are you studying?");
        String school = sc.nextLine();
       
        info.add(name);
        info.add(food);
        info.add(color);
        info.add(address);
        info.add(school);  
        
        System.out.println(info);
        
        
         }
}

