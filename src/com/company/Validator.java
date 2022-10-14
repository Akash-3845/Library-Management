package com.company;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    private static final Pattern book_id_pattern = Pattern.compile("^\\d{1,4}$");
    private static final Pattern author_title_pattern = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern publish_year_pattern = Pattern.compile("^\\d{4}$");
    Scanner sc = new Scanner(System.in);

    public String ValidateId(){
        String bookId;
        while(true){
            System.out.println("enter the book id");
            bookId =  sc.nextLine();
            if (!book_id_pattern.matcher(bookId).matches()){
                System.out.println(RED + "Sorry ! please enter valid id " + RESET);
            }else{
                break;
            }
        }
        return bookId;
    }
    public String validateAuthorTitle( String input){
        String result;
        while(true){
            if (input.equals("Title")){
                System.out.println("enter the title");
            }else {
                System.out.println("enter the author name");
            }
            result =  sc.nextLine();
            if (!author_title_pattern.matcher(result).matches()){
                System.out.println(RED + "Sorry ! please enter valid "+input + RESET);
            }else{
                break;
            }
        }
        return result;
    }
    public String ValidatePublishYear(){
        String year;
        while(true){
            System.out.println("enter the publish year");
            year=  sc.nextLine();
            if (!publish_year_pattern.matcher(year).matches()){
                System.out.println(RED + "Sorry ! please enter valid publish year " + RESET);
            }else{
                break;
            }
        }
        return year;
    }



}
