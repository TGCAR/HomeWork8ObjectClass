public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Ivanov ", " Andrey");
        System.out.println("first.getFirstName() = " + firstAuthor.getFirstName());
        System.out.println("first.getSurName() = " + firstAuthor.getSurName());

        Author secondAuthor = new Author("Borisov ", " Ivan");
        System.out.println("second.firstName = " + secondAuthor.getFirstName());
        System.out.println("second.surName = " + secondAuthor.getSurName());

        Book Azbuka = new Book("Azbuka", firstAuthor, 2024);
        System.out.println("Azbuka.name = " + Azbuka.getName());
        System.out.println("Azbuka.author = " + firstAuthor);
        System.out.println("Azbuka.year = " + Azbuka.getYear());
        Azbuka.setYear(2025);
        System.out.println("Azbuka.getYear() = " + Azbuka.getYear());

        Book Literatura = new Book("Literatura", secondAuthor, 2024);
        System.out.println("Literatura.name = " + Literatura.getName());
        System.out.println("Literatura.author = " + secondAuthor);
        System.out.println("Literatura.year = " + Literatura.getYear());
        Literatura.setYear(2025);
        System.out.println("Literatura.getYear() = " + Literatura.getYear());
    }

}

