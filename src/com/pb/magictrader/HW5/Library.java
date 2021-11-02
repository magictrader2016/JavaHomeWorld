package com.pb.magictrader.HW5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("PETROV V.V.", 1, "FAC", "01.01.2001", "+0501111111");
        Reader[] readers = {reader1};

        Book book1 = new Book("ADVENTURES", "IVANOV I.I.");
        Book book2 = new Book("DICTIONARY", "SIDOROV A.V.");
        Book book3 = new Book("ENCYCLOPEDIA", "GUSEV K.V.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);

        reader1.returnBook(1);
    }

    private static void printBooks(Book[] books) {
        System.out.println("BOOKS LIST:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("READERS LIST:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
