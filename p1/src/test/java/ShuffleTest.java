import junit.framework.TestCase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShuffleTest extends TestCase {

    public void testSolution() throws Exception {
        assertThat(Shuffle.solution(5, 3, -1, 5),is(14));
        assertThat(Shuffle.solution(5, 5, 5, 5),is(0));
    }
}