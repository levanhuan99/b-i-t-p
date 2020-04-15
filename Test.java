package com.codewithme;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Book programmingBook1 = new ProgrammingBook("book1", "head first python", "van huan", 100, "python", "...");
        Book programmingBook2 = new ProgrammingBook("book2", "head first java", "van son", 50, "java", "...");
        Book programmingBook3 = new ProgrammingBook("book3", "head first C#", "le van huan", 110, "C#", "...");

        Book fictionBook1 = new FictionBook("book4", "suối nguồn tuổi trẻ", "Peter Kelder", 150, "văn học");
        Book fictionBook2 = new FictionBook("book5", "3 người thầy vĩ đại", "Robin Sharma", 80, "cách sống");
        Book fictionBook3 = new FictionBook("book6", "never eat alone", "Keith Ferrazzi", 70, "cách sông");

//        ProgrammingBook[] programmingBookStore = new ProgrammingBook[3];             //khai báo mảng chứa programming book
//        programmingBookStore[0] = programmingBook1;
//        programmingBookStore[1] = programmingBook2;
//        programmingBookStore[2] = programmingBook3;
//        FictionBook[] fictionBookStore = new FictionBook[3];                           //khai báo mảng chứa fiction book
//        fictionBookStore[0] = fictionBook1;
//        fictionBookStore[1] = fictionBook2;
//        fictionBookStore[2] = fictionBook3;
        Book[] book=new Book[6];
        book[0] =programmingBook1;
        book[1] =programmingBook2;
        book[2] =programmingBook3;
        book[3]=fictionBook1;
        book[4]=fictionBook2;
        book[5]=fictionBook3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("1.thể loại programming book.");
        System.out.println("2.thể loại fiction book .");
        System.out.println("3.exit");
        System.out.println("bạn muôn tìm thể loại sách gì? ");


        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("1.bạn biết  code của book.");
                System.out.println("2.bạn biết tên  của book.");
                System.out.println("3.bạn biết  khoảng giá của book.");
                System.out.println("4.bạn biết tên tác giả của book.");
                System.out.println("5.bạn muốn tìm  book ngôn ngữ gì?.");
                System.out.println("nhâp số bạn muôn tìm: ");
                int no = scanner.nextInt();

                switch (no) {
                    case 1:
                        System.out.println("nhâp code của book:");
                        String code = scanner.next();
                        for (int i = 0; i < book.length; i++) {
                            if (book[i].getBookCode().equals(code) ) {
//                                ProgrammingBook programmingBook =(ProgrammingBook)book[i];     //có thể cho vào 1 phương thức
                                System.out.println(book[i]);
                                break;
                            }
                        }
                    case 2:
                        System.out.println("nhập tên của book:");
                        String name=scanner.next();
                        for (int i = 0; i < book.length; i++){
                            if (book[i].getName().equals(name)){
//                                ProgrammingBook programmingBook =(ProgrammingBook)book[i];
                                System.out.println(book[i]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("nhập khoảng giá mà bạn nhớ:");
                        float price=scanner.nextFloat();
                        for (int i = 0; i < book.length; i++){
                            if (book[i].getPrice()==price){
//                                ProgrammingBook programmingBook =(ProgrammingBook)book[i];
                                System.out.println(book[i]);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("nhập tên tác giả ");
                        String authorName=scanner.next();
                        for (int i = 0; i < book.length; i++){
                            if (book[i].getName().equals(authorName)){
//                                ProgrammingBook programmingBook =(ProgrammingBook)book[i];
                                System.out.println(book[i]);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("nhập ngôn ngữ:");
                        String language=scanner.next();
                        for (int i = 0; i < 3; i++){
                                ProgrammingBook programmingBook =(ProgrammingBook)book[i];
                                for ( int j=0;j<book.length;j++){
                                    if(programmingBook[j].getLanguage().equals(language)){// muốn ép kiểu xuống ProgrammingBook để dùng getLanguage
                                        System.out.println(programmingBook[j]);
                                    }
                                }

                            }
                        }
                        break;


                }


        }
    }






//    public static boolean findBookBasedOnName(String name, Book[] arr){
//        boolean flag=false;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i].getBookCode()==name){
//               flag=true;
//            }
//        }
//        return flag;
//    }


























        //        System.out.println(programmingBook1);
//        System.out.println(programmingBook2);
//        System.out.println(programmingBook3);
//
//        System.out.println("----------");
//
//        System.out.println(fictionBook1);
//        System.out.println(fictionBook2);
//        System.out.println(fictionBook3);

//        float totalMoney =programmingBook1.getPrice()+programmingBook2.getPrice()+programmingBook3.getPrice()+
//                            fictionBook1.getPrice()+fictionBook2.getPrice()+fictionBook3.getPrice();
//        System.out.println("tổng tiền của 6 cuốn sach là :"+totalMoney);
//
//        int counter=0;
//        if (programmingBook1.getLanguage()=="java"||programmingBook2.getLanguage()=="java"||programmingBook3.getLanguage()=="java"){
//            counter++;
//





