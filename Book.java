
public class Book {
    String author;
    String title;
    double price;
    int quantity;

    Book(String a, String b, double c, int d) {
        author = a;
        title = b;
        price = c;
        quantity = d;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void disp() {
        System.out.println(author + " " + title + " " + price + " " + quantity);
    }

    public static void main(String[] args) {
        Book obj = new Book("USMAN", "Frenkonstain", 128, 12);
        obj.disp();
        obj.setAuthor("ALI");
        obj.disp();
        System.out.println(obj.getAuthor());

    }
}