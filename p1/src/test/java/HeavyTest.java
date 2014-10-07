import junit.framework.TestCase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HeavyTest extends TestCase {

    public void testSolution() throws Exception {
        assertThat(Heavy.solution(8675, 8689),is(5));
        assertThat(Heavy.solution(0, 0),is(0));
        assertThat(Heavy.solution(0, 100),is(12));
    }
}