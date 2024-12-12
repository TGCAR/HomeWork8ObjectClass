public class Book {
    private String name;
    private Author author;
    private int year;

    //    Конструктор
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //    Геттеры и сеттеры
    public String getName() {

        return name;
    }

    public Author getAuthor() {

        return author;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }
}
