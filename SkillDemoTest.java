import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void test1() {
        assertEquals("odd", SkillDemo.evenOdd(2));
    }
}
