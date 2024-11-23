package Program;

public class Main {
    public static void main(String[] args) {
        BookcaseWithLivadniy vrn = new BookcaseWithLivadniy("Современная библиотека", "Борт 618");
        BookcaseWithPushkin bk = new BookcaseWithPushkin("d", "3");

        BookHandler handler = new BookHandler();

        try{
            handler.book(vrn);
            vrn.info();
            bk.info();
        } catch(LibraryException | ShelfException e){
            System.out.println(e.getMessage());
        }
    }
}