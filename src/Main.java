import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String size = "";
        while (!size.equals("LARGE") && !size.equals("MEDIUM") && !size.equals("SMALL")) {
            System.out.println("What size pizza do you want: Large Medium Small? ");
            size = input.next();
            size = size.toUpperCase();
        }
        ArrayList<String> toppings = new ArrayList<>();
        while(true){
            System.out.println("Chose another topping to add say 'no' if you would like to stop ");
            String topper = input.next();
            if(topper.equals("no")){
                break;
            }
            else{
                toppings.add(topper);
            }
        }
        System.out.println("Your pizza is a "+size+" with "+toppings+ " on top");
        double price = 0d;
        if (size.equals("Large")){
            price = 13.99;
        }
        else if(size.equals("Medium")){
            price = 10.99;
        }
        else{
            price = 7.99;
        }
        int paidTops = toppings.size();

        if (paidTops >3){
            paidTops -= 2;
            price = price + (paidTops * 1.25);
        }
        else{}
        System.out.println("That will come to a total of £"+price);

    }

}
