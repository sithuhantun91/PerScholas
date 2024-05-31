package com.perscholas.java_basics;

public class PolymorphismAndInterfacePA {
}

interface LibraryUser {
    void registerAccount();

    void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}

class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        kidUser.age = 10;
        kidUser.registerAccount();
        kidUser.age = 18;
        kidUser.registerAccount();
        kidUser.bookType = "Kids";
        kidUser.requestBook();
        kidUser.bookType = "Fiction";
        kidUser.requestBook();

        AdultUser adultUser = new AdultUser();
        adultUser.age = 5;
        adultUser.registerAccount();
        adultUser.age = 23;
        adultUser.registerAccount();
        adultUser.bookType = "Kids";
        adultUser.requestBook();
        adultUser.bookType = "Fiction";
        adultUser.requestBook();
    }
}