package Program;

class BookcaseWithPushkin extends OldLibrary {
    private String pushkinBook;

    public BookcaseWithPushkin(String library, String pushkinBook) {
        super(library);
        this.pushkinBook = pushkinBook;
    }

    public String getPushkinBook() {
        return pushkinBook;
    }

    public void setPushkinBook(String pushkinBook) {
        this.pushkinBook = pushkinBook;
    }

    private void isPushkinBookNull(String pushkinBook) throws ShelfException {
        if (pushkinBook == null){
            throw new ShelfException("Полки не существует.");
        }
    }

    @Override
    public void info() throws ShelfException {
        super.info();
        isPushkinBookNull(pushkinBook);
        System.out.println("Произведение Пушкина: " + pushkinBook);
    }

    @Override
    public void library() {
        System.out.println("Вы выбрали библиотеку классики с Пушкиным");
    }
}