package com.company;

public class Book {

    private String  id;
    private String book_Title;
    private String Author_Name;
    private String Publish_Year;
    private String Status;

    public Book(){

    }

    public Book(String  id, String book_Title, String author_Name, String publish_Year, String status) {
        this.id = id;
        this.book_Title = book_Title;
        Author_Name = author_Name;
        Publish_Year = publish_Year;
        Status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_Title() {
        return book_Title;
    }

    public void setBook_Title(String book_Title) {
        this.book_Title = book_Title;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
    }

    public String getPublish_Year() {
        return Publish_Year;
    }

    public void setPublish_Year(String publish_Year) {
        Publish_Year = publish_Year;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", book_Title='" + book_Title + '\'' +
                ", Author_Name='" + Author_Name + '\'' +
                ", Publish_Year='" + Publish_Year + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}

