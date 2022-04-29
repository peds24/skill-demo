import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void test1() {
        assertEquals("even", SkillDemo.evenOdd(2));
    }
}
