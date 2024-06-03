package com.perscholas.hackerrank44;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Solution8 {
    /*
     * Complete the 'minimumSteps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY loggedMoves as parameter.
     */

    public static int minimumSteps(List<String> loggedMoves) {

        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int loggedMovesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> loggedMoves = IntStream.range(0, loggedMovesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int result = minimumSteps(loggedMoves);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
