package sistemas.usta;

import java.util.Scanner;

public class Main {
    /*Name: Juan David Amezquita Nuñez
      Date:14/08/2020
      Description: This is a menu, the user can navigate between an options
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This is a menu simulator");
        System.out.println("Created by Juan David Amezquita Nuñez");

        int option = 0;

        do {
            f_menu();

            System.out.println("Input your option:");
            option = keyboard.nextInt();

            if (option > 4){
                System.err.println("Sorry, but you must input a valid option");
            }else{ if (option < 4 && option >= 1){

                    System.out.println("Now, input the first number:");
                    int numb1 = keyboard.nextInt();
                    System.out.println("Input the second number");
                    int numb2 = keyboard.nextInt();

                    if (option == 1){
                        f_1(numb1, numb2);
                    }else{
                        if (option == 2){
                            f_2(numb1, numb2);
                        }else{
                            if (option == 3){
                                f_3(numb1, numb2);
                            }else{
                                if (option == 4){
                                    f_4(numb1, numb2);
                                }
                            }
                        }
                    }
                }
                }
        }while (option > 0);



    }

    public static void f_menu() {
        //Description: menu
        System.out.println("Press 1: to sum two numbers");
        System.out.println("Press 2: to rest two numbers");
        System.out.println("Press 3: to multiply two numbers");
        System.out.println("Press 4: to divide two numbers");
        System.out.println("Press 0: to exit");
    }

    public static void f_1(int a, int b) {
        //Description: this is the first option: sum
        int sum = a + b;
        System.out.println("The answer is:");
        System.out.println(a+" + "+b+" = "+sum);
    }

    public static void f_2(int a, int b) {
        //Description: this is the second option: rest
        int rest = a - b;
        System.out.println("The answer is:");
        System.out.println(a+" - "+b+" = "+rest);
    }

    public static void f_3(int a, int b) {
        //Description: this is the fourth option: multiply
        int mult = a * b;
        System.out.println("The answer is:");
        System.out.println(a+" x "+b+" = "+mult);
    }

    public static void f_4(int a,int b) {
        //Description: this is the fifth option: divide
        int divide = a / b;
        System.out.println("The answer is:");
        System.out.println(a+" / "+b+" = "+divide);
    }
}
