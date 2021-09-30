package MagazineTests;

import alexandria.Magazine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagazineSetGetTest {


    Magazine testMagazine = new Magazine("GAMESPOT", 12, 1065);
    @Test
    public void setTitleTest(){
        testMagazine.setTitle("MEN'S HEALTH");
        assertEquals("MEN'S HEALTH", testMagazine.getTitle() , "Still the same magazine");
    }
    @Test
    public void setIssueTest(){
        testMagazine.setIssue(16);
        assertEquals(16, testMagazine.getIssue() , "Still the same issue");
    }
    @Test
    public void setPagesTest(){
        testMagazine.setPages(500);
        assertEquals(500, testMagazine.getPages() , "Still the same number of pages");
    }

}
