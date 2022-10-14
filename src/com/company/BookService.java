package com.company;


import java.util.ArrayList;
import java.util.List;

public class BookService implements BookServiceInterface {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static final String YELLOW = "\u001B[33m";

    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    Validator validator = new Validator();
    List <Book> Books =  new ArrayList<>();

    @Override
    public void addBook() {
        String  bookId = validator.ValidateId();
        String Author = validator.validateAuthorTitle("Author");
        String Title = validator.validateAuthorTitle("Title");
        String year = validator.ValidatePublishYear();
        Book book =  new Book( bookId, Title, Author, year, "Available");
        Books.add(book);
        System.out.println(GREEN + "book added successfully" + RESET);

    }

    @Override
    public void showAllBook() {
        Boolean flag = false;
        System.out.println("\n-----------------------------------------------------------------------------------------------");
        System.out.format(CYAN+"%s%15s%15s%15s%15s", "ID","TITLE","AUTHOR","PUBLISH_YEAR","STATUS");
        System.out.println("\n-----------------------------------------------------------------------------------------------");
        for (Book book: Books){
            System.out.format("%s%15s%15s%15s%15s", book.getId(), book.getBook_Title(),book.getAuthor_Name(), book.getPublish_Year(), book.getStatus());
            System.out.println();
            flag = true;

        }
        System.out.println("\n-----------------------------------------------------------------------------------------------");
        if (flag == false) {
            System.out.println(RED+ "There is no books here" + RESET);

        }

    }

    @Override
    public void showAllAvailableBook() {
        Boolean flag = false;
        System.out.println("\n-----------------------------------------------------------------------------------------------");
        System.out.format(CYAN+"%s%15s%15s%15s%15s", "ID","TITLE","AUTHOR","PUBLISH_YEAR","STATUS" +WHITE);
        System.out.println("\n-----------------------------------------------------------------------------------------------");
        if (Books.size()>0){
            for (Book book:Books){
                if (book.getStatus().equals("Available")){
                    System.out.format("%s%15s%15s%15s%15s", book.getId(), book.getBook_Title(),book.getAuthor_Name(), book.getPublish_Year(), book.getStatus());
                    System.out.println();
                    flag = true;
                }

            }
        }else {
            System.out.println(RED+ "There is no books here" + RESET);
        }
        System.out.println(WHITE+"\n-----------------------------------------------------------------------------------------------");

        if (flag == false) {
            System.out.println(RED+ "There is no books with stats available " + RESET);

        }
    }

    @Override
    public void borrowBook() {
        String bookId = validator.ValidateId();
        Boolean flag = false;
        for (Book book:Books){
            if (book.getId().equals(bookId) && book.getStatus().equals("Available")){
                flag = true;
                System.out.println(GREEN +"Book borrowd successfully" + RESET);
                book.setStatus("notAvailable");
                System.out.println("borrowd book details" + book);
            }
        }
        if (flag== false){
            System.out.println(RED+ "This book is not available for borrow" + RESET);
        }

    }

    @Override
    public void returnBook() {
        String bookId = validator.ValidateId();
        Boolean flag = false;
        for (Book book:Books){
            if (book.getId().equals(bookId) && book.getStatus().equals("notAvailable")){
                flag = true;
                System.out.println(GREEN +"Book return successfully" + RESET);
                book.setStatus("Available");
                System.out.println("return book details" + book);
            }
        }
        if (flag== false){
            System.out.println(RED+ "we can not return this book" + RESET);
        }

    }
}
