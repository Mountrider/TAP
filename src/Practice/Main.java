package Practice;
    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    class Library extends Book {
        private int stock;

        public Library(String title, String author, int stock) {
            super(title, author);
            this.stock = stock;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Library book = new Library("War and Peace", "Lev Tolstoy", 5);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Stock: " + book.getStock());
        }
    }


