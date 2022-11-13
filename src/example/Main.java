
public class Main {

    public static void main(String[] args) {
        //виклик методу ініціалізація масиву

        Book[] bookarr = initBookArray();

        //пункт A
        String Author = "Joanne Rowling";
        showAuthorList(bookarr, Author);

        //пункт B
        String PublishingHouse= "Pearson";
        showPublishingHouseList(bookarr, PublishingHouse);


        //пункт c
        int years = 2000;
        showBookAgeList(bookarr, years);

    }

    //пункт A
    private static void showAuthorList(Book[] bookarr, String Author) {
        System.out.println("Cписок книг заданого автора " + Author + ":");
        for (Book b : bookarr) {
            if (b.getAuthor().equals(Author)) {
                System.out.println(b);
            }
        }
    }
    //пункт B
    private static void showPublishingHouseList (Book[] bookarr, String PublishingHouse ) {
        System.out.println("Cписок книг, що видані заданим видавництвом  " + PublishingHouse + ":");
        for (Book b : bookarr) {
            if (b.getPublishingHouse().equals(PublishingHouse)) {
                System.out.println(b);
            }
        }
    }
    // c пукнт
    private static void showBookAgeList  (Book[] bookarr, int Years ) {
        System.out.println("Cписок книг, що випущені після заданого року " + Years + ":");
        for (Book b : bookarr) {
            if (b.getYear() >= Years) {
                System.out.println(b);
            }
        }

    }


    private static Book[] initBookArray() {
        Book[] bookarr = new Book[10];
        Book b = new Book(1);
        b.setName("Harry Potter and the Philosopher's Stone");
        b.setAuthor("Joanne Rowling");
        b.setPublishing_house("Pearson");
        b.setYear(2001);
        b.setNumberOfPages(670);
        b.setPrice(500);
        bookarr[0] = b;

        //створюємо екземпляр класу Book з усіма заповненими полями і записуємо у другий елемент масиву і тд
        bookarr[1] = new Book(2,"Harry Potter and the Deathly Hallows","JoanneRowling","Pearson",2002,609,100 );
        bookarr[2] = new Book(3,"Romeo and Juliet","William Shakespeare","Thomson Reuters",1950,566,200 );
        bookarr[3] = new Book(4,"Oliver Twist","Charles  Dickens","McGraw-Hill Education",2001,560,400 );
        bookarr[4] = new Book(5,"Sherlock Holmes","Arthur  Doyle","McGraw-Hill Education",2020,441,505 );
        bookarr[5] = new Book(6,"Hamlet","William Shakespeare","Thomson Reuters",1809,790,300 );
        bookarr[6] = new Book(7,"Tom Sawyer","Mark Twain","HarperCollins",1890,699,400 );
        bookarr[7] = new Book(8,"Emma","Jane Austen","Hachette Livre",1996,700,600 );
        bookarr[8] = new Book(9,"Pride and Prejudice","Jane Austen","Hachette Livre",1900,331,550 );
        bookarr[9] = new Book(10,"Harry Potter and the Chamber of Secrets","Joanne Rowling","Pearson",20011,600,499 );

        return bookarr;
    }
}
