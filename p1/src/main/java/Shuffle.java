/**
 * Created by aakhmerov on 07/10/14.
 */
public class Shuffle {

    public static int solution(int A, int B, int C, int D) {

        // write your code in C90

        int max =0;
        if (A==B && B==C && C==D) {
            return 0;
        }
        int[][] permutations = new int [][]{
                new int[] {A, B, C, D},
                new int[] {A, B, D, C},
                new int[] {A, C, B, D},
                new int[] {A, C, D, B},
                new int[] {A, D, B, C},
                new int[] {A, D, C, B},

                new int[] {B, A, C, D},
                new int[] {B, A, D, C},
                new int[] {B, C, A, D},
                new int[] {B, C, D, A},
                new int[] {B, D, A, C},
                new int[] {B, D, C, A},

                new int[] {C, A, B, D},
                new int[] {C, A, D, B},
                new int[] {C, B, A, D},
                new int[] {C, B, D, A},
                new int[] {C, D, A, B},
                new int[] {C, D, B, A},

                new int[] {D, A, B, C},
                new int[] {D, A, C, B},
                new int[] {D, B, A, C},
                new int[] {D, B, C, A},
                new int[] {D, C, A, B},
                new int[] {D, C, B, A}
        };
        for (int i = 0; i <permutations.length; i++) {
            int[] S = permutations[i];
            int value = Math.abs(S[0]-S[1]) + Math.abs(S[1]-S[2]) + Math.abs(S[2]-S[3]);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
