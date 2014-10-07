import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by aakhmerov on 07/10/14.
 */
public class Heavy {

    public static int solution(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (testHeavy(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static boolean testHeavy(int A) {
        int sum = 0;
        int digitCount = 1;
        while (A > 9) {
            sum += A % 10;
            A = A / 10;
            digitCount++;
        }
        sum += A;
        if (((sum * 1.0) / digitCount) > 7)
            return true;
        return false;
    }

}
