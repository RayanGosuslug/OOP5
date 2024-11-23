package Program;

public class BookHandler {
    public void book(City city) {
        System.out.println("Взял книгу в Воронеже");
        city.library();
    }
}