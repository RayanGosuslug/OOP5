package Program;

class BookcaseWithLivadniy extends ModernLibrary {
    private String historyOfGalaxy;

    public BookcaseWithLivadniy(String library, String historyOfGalaxy) {
        super(library);
        this.historyOfGalaxy = historyOfGalaxy;
    }

    public String getHistoryOfGalaxy() {
        return historyOfGalaxy;
    }

    public void setHistoryOfGalaxy(String historyOfGalaxy) {
        this.historyOfGalaxy = historyOfGalaxy;
    }

    @Override
    public void info() throws ShelfException {
        super.info();
        isHistoryOfGalaxyNotNull(historyOfGalaxy);
        System.out.println("Произведение Ливадного: " + historyOfGalaxy);
    }

    @Override
    public String getCityName() {
        return null;
    }

    private void isHistoryOfGalaxyNotNull(String historyOfGalaxy) throws ShelfException {
        if (historyOfGalaxy == null){
            throw new ShelfException("Полки не существует.");
        }
    }

    @Override
    public void library() {
        System.out.println("Вы выбрали библиотеку современной литературы с Ливадным");
    }
}