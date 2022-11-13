package example;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private int price;

    //конструктор, який заповнює поле id
    public Book(int id) {
            this.id = id;
    }
    //конструктор що запонвнює всі поля
    public Book(int id, String name, String author, String publishingHouse,
                int Year, int numberOfPages, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = Year;
        this.numberOfPages =numberOfPages;
        this.price = price;
        }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = Name;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String Author) {
            this.author = Author;
        }
        public String getPublishingHouse() {
            return publishingHouse;
        }
        public void setPublishing_house(String PublishingHouse) {
            this.publishingHouse = PublishingHouse;
        }
        public int getYear() {return year;}
        public void setYear(int Year) { this.year = Year;}

        public int getNumberOfPages() { return numberOfPages; }
        public void setNumberOfPages(int NumberOfPages) { this.numberOfPages =NumberOfPages;}

        public int getPrice() { return price;}
        public void setPrice(int Price) { this.price = Price;}

        @Override
        public String toString() {
            return "Book{" +
                    "Name=" + name + '\'' +
                    ", author= " + author +
                    ", publishing_house = " + publishingHouse +
                    ", year=" + year +
                    ", number_of_pages " + numberOfPages +
                    ", price=" + price + '\'' +
                    '}';
        }
}

