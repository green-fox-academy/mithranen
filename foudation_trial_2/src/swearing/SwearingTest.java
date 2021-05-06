package swearing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwearingTest {

  String testContent;

  @BeforeEach
  void setUp() {
    testContent = "src/swearing/testSwearing_content";
  }

  @Test
  void swearingCleaner_getCorrectNumberOfRemovedSwearWords()
      throws AccessDeniedException, FileNotFoundException {

    int expected = 7;
    int actual = Swearing.swearingCleaner("src/swearing/testSwearing_content");
    assertEquals(expected, actual);
  }

  @Test
  void swearingCleaner_isCreateANewCleanFile() throws AccessDeniedException, FileNotFoundException {

    Swearing.swearingCleaner(testContent);
    Path path = Paths.get(this.testContent + "_without_swearing");
    assertTrue(Files.exists(path));
  }


}