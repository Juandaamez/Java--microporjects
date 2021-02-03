package sitemas.usta;

//Juan David Amezquita Nuñez

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        menu_genre();

    }

    public static void menu_genre() throws InterruptedException {
        //Main_menu = genre of game
        Scanner keyboard = new Scanner(System.in);

        String kind1 = "1. adventure", kind2 = "2. action", kind3 = "3. rol";
        int option_genre = 0;

        System.out.println("Welcome to the steam store, what genre of games are you interested in?");
        System.out.println(kind1);
        System.out.println(kind2);
        System.out.println(kind3);

        Thread.sleep(2000);

        System.out.println("Press the number of the genre: ");

        option_genre = keyboard.nextInt();

        //Non exist options
        while (option_genre <= 0 || option_genre >= 4) {
            System.err.println("Sorry, this genre doesn't exist");

            Thread.sleep(2000);
            System.out.println("Press the number of the genre: ");
            option_genre = keyboard.nextInt();
        }

        if (option_genre == 1) {
            menu_1();
        }
        if (option_genre == 2) {
            menu_2();
        }
        if (option_genre == 3) {
            menu_3();
        }


    }

    public static void menu_1() throws InterruptedException {
        //Adventure games
        Scanner keyboard = new Scanner(System.in);

        String kind1 = "1. Minecraft", kind2 = "2. Ark", kind3 = "3. Uncharted",
        kind4 = "4. King Kong";
        int option = 0;

        System.out.println("Welcome to the adventure games, games available");
        System.out.println("0. Main Menu");
        System.out.println(kind1);
        System.out.println(kind2);
        System.out.println(kind3);
        System.out.println(kind3);

        Thread.sleep(2000);

        System.out.println("Press the number of the game to see de info: ");

        option = keyboard.nextInt();

        while (option < 0 || option >= 5) {
            System.err.println("Sorry, this game is unavailable");

            Thread.sleep(2000);
            System.out.println("Press the number of the game: ");
            option = keyboard.nextInt();
        }

        if (option == 0){
            menu_genre();
        }
        if (option == 1){
            System.out.println("MINECRAFT");
        }
        if (option == 2){
            System.out.println("ARK");
        }
        if (option == 3){
            System.out.println("UNCHARTED");
        }
        if (option == 3){
            System.out.println("KING KONG");
        }
    }

    public static void menu_2() throws InterruptedException {
        //Action games
        Scanner keyboard = new Scanner(System.in);

        String kind1 = "1. gta", kind2 = "2. Warzone", kind3 = "3. Tom clancy",
                kind4 = "4. Farcry";
        int option = 0;

        System.out.println("Welcome to the action games, games available");
        System.out.println("0. Main Menu");
        System.out.println(kind1);
        System.out.println(kind2);
        System.out.println(kind3);
        System.out.println(kind3);

        Thread.sleep(2000);

        System.out.println("Press the number of the game to see de info: ");

        option = keyboard.nextInt();

        while (option < 0 || option >= 5) {
            System.err.println("Sorry, this game is unavailable");

            Thread.sleep(2000);
            System.out.println("Press the number of the game: ");
            option = keyboard.nextInt();
        }

        if (option == 0){
            menu_genre();
        }
        if (option == 1){
            System.out.println("GTA");
        }
        if (option == 2){
            System.out.println("WARZONE");
        }
        if (option == 3){
            System.out.println("TOM CLANCY");
        }
        if (option == 3){
            System.out.println("FARCRY");
        }
    }

    public static void menu_3() throws InterruptedException {
        //Rol games
        Scanner keyboard = new Scanner(System.in);

        String kind1 = "1. Diablo", kind2 = "2. Dark souls", kind3 = "3. Cyberpunk",
                kind4 = "4. Crusader kings";
        int option = 0;

        System.out.println("Welcome to the rol games, games available");
        System.out.println("0. Main Menu");
        System.out.println(kind1);
        System.out.println(kind2);
        System.out.println(kind3);
        System.out.println(kind3);

        Thread.sleep(2000);

        System.out.println("Press the number of the game to see de info: ");

        option = keyboard.nextInt();

        while (option < 0 || option >= 5) {
            System.err.println("Sorry, this game is unavailable");

            Thread.sleep(2000);
            System.out.println("Press the number of the game: ");
            option = keyboard.nextInt();
        }

        if (option == 0){
            menu_genre();
        }
        if (option == 1){
            System.out.println("DIABLO");
        }
        if (option == 2){
            System.out.println("DARK SOULS");
        }
        if (option == 3){
            System.out.println("CYBERPUNK");
        }
        if (option == 3){
            System.out.println("CRUSADER KINGS");
        }
    }
}
