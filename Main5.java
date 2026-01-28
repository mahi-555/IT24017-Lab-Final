class Book {
    int bookId;
    String title;
    double price;

    public Book(int id, String t, double p) {
        bookId = id;
        title = t;
        price = p;
    }

    public void display() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Price: " + price);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Basics", 450),
            new Book(2, "Advanced Java", 600),
            new Book(3, "Data Structures", 700),
            new Book(4, "Algorithms", 550),
            new Book(5, "Networking", 400)
        };

        double sum = 0;
        System.out.println("Books with price > 500:");
        for(Book b : books) {
            sum += b.price;
            if(b.price > 500) {
                b.display();
            }
        }

        double avg = sum / books.length;
        System.out.println("Average price of all books: " + avg);
    }
}
