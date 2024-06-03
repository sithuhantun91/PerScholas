package com.perscholas.hackerrank44;

public class Solution2 {
    /*
     * Complete the 'jumps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER flagHeight
     *  2. INTEGER bigJump
     */

    public static int jumps(int flagHeight, int bigJump) {
        if (bigJump > flagHeight) return flagHeight;
        if (bigJump == flagHeight) return 1;
        if (flagHeight % bigJump == 0) {
            return flagHeight / bigJump;
        } else {
            return (flagHeight / bigJump) + (flagHeight % bigJump);
        }
    }
}