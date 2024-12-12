public class Author {
    private String surName;
    private String firstName;

    //Конструктор
    public Author(String surName, String firstName) {
        this.surName = surName;
        this.firstName = firstName;
    }

    //Геттеры и Сеттеры
    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + surName;
    }
}
