package Program;

abstract class OldLibrary implements City {
    private String oldLibrary;

    public OldLibrary(String libname) {
        this.oldLibrary = libname;
    }

    public String getLibName() {
        return oldLibrary;
    }

    public void setLibName(String libname) {
        this.oldLibrary = libname;
    }

    private void isOldLibraryNull(String oldLibrary){
        if (oldLibrary == null){
            throw new LibraryException("Библиотеки не существует.");
        }
    }

    public void info() throws ShelfException {
        isOldLibraryNull(oldLibrary);
        System.out.println("Библиотека Классики: " + oldLibrary);
    }
}