import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void testSolution() throws Exception {
        assertThat(StringReverse.solution("abcdefg"),is("gfedcba"));
    }
}