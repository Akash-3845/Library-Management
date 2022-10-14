package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookServiceInterface service = new BookService();

        do{
            System.out.println("Welcome to the library");
            System.out.println("1. add book\n" +
                    "2. show available book\n" +
                    "3. show all books\n" +
                    "4. borrow book\n" +
                    "5. return book\n" +
                    "6. exit\n");
            System.out.println("Enter your choice!");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    service.addBook();
                    break;
                case 2:
                    service.showAllAvailableBook();
                    break;
                case 3:
                    service.showAllBook();
                    break;
                case 4:
                    service.borrowBook();
                    break;
                case 5:
                    service.returnBook();
                    break;
                case 6:
                    System.out.println("thank you for using my library");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter valid number!");
            }

        }while(true);




    }

}