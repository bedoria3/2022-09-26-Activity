import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args){
        ArrayList<String> personalInfo = new ArrayList<String>();
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
        
        personalInfo.add(name);
        personalInfo.add(food);
        personalInfo.add(color);
        personalInfo.add(address);
        personalInfo.add(school);
        
        System.out.println(personalInfo);
        
        
         }
 
}