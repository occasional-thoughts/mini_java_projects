import java.util.*;

class Book {
    int id;
    String title, author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. View Books\n3. Search Book\n4. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, title, author));
                    break;

                case 2:
                    for (Book b : books) {
                        System.out.println(b.id + " | " + b.title + " | " + b.author);
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String search = sc.nextLine();
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(search)) {
                            System.out.println("Found: " + b.id + " | " + b.title + " | " + b.author);
                        }
                    }
                    break;
            }
        } while (choice != 4);
    }
}
