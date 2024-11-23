package Program;

abstract class ModernLibrary implements City {
    private String newLibrary;

    public ModernLibrary(String libname) {
        this.newLibrary = libname;
    }

    public String getLibName() {
        return newLibrary;
    }

    public void setLibName(String libname) {
        this.newLibrary = libname;
    }

    private void isNewLibraryNull(String newLibrary){
        if (newLibrary == null){
            throw new LibraryException("Библиотеки не существует.");
        }
    }

    public void info() throws ShelfException {
        isNewLibraryNull(newLibrary);
        System.out.println("Библиотека современной литературы: " + newLibrary);
    }

    public abstract String getCityName();
}