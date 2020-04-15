package com.codewithme;

public class Book {

    private String bookCode;//sách nào cx có
    private String name;
    private String author;
    private float price;
    public Book(){
    }
    public Book(String bookCode,String name,String author,float price){
        this.bookCode=bookCode;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return " book  named "+ getName()+" and price is "+ getPrice()+" of "+ getAuthor();

    }
}




class ProgrammingBook extends Book{
    private String language;
    private String framework;
    public ProgrammingBook(){
    }
    public ProgrammingBook(String bookCode,String name,String author,float price,String language,String framework){
        super(bookCode, name,author,price);//chỉ đến contructor mẹ
        this.language=language;
        this.framework=framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String toString(){
        return "A programming book created with "+super.toString();
    }

}




class FictionBook extends Book{
    private String category;
    public FictionBook(){

    }
    public FictionBook(String bookCode,String name,String author,float price,String category){
        super(bookCode, name,author,price);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString(){
        return "A fiction book created "+super.toString();

    }

}
