package Tests;

import Program.MLChecker;
import Program.MLChecker2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModernLibraryTest {

    @Test
    void info_validLibrary_printsLibraryInfo() {
        MLChecker library = new MLChecker("New Library");
        String expectedOutput = "New Library";
        String actualOutput = library.getLibName();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void info_nullLibrary_printsLibraryInfo() {
        MLChecker library = new MLChecker(null);
        String actualOutput = library.getLibName();
        assertNull(actualOutput);
    }
}
class OldLibraryTest{
    @Test
    void info_validOldLibrary_printsLibraryInfo() {
        MLChecker2 library = new MLChecker2("New Library");
        String expectedOutput = "New Library";
        String actualOutput = library.getLibName();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void info_nullOldLibrary_printsLibraryInfo() {
        MLChecker2 library = new MLChecker2(null);
        String actualOutput = library.getLibName();
        assertNull(actualOutput);
    }
}