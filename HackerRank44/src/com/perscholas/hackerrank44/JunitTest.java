package com.perscholas.hackerrank44;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    List<String> testcaseListSolution1 = new ArrayList<String>();
    List<String> testcaseListSolution2 = new ArrayList<String>();
    List<String> testcaseListSolution3 = new ArrayList<String>();
    List<String> testcaseListSolution4 = new ArrayList<String>();
    List<String> testcaseListSolution5 = new ArrayList<String>();
    List<String> testcaseListSolution6 = new ArrayList<String>();
    List<String> testcaseListSolution7 = new ArrayList<String>();

    @Before
    public void setUp() {
        //add(expectedOutput,input)
        //region Solution1
        testcaseListSolution1.add("4,2.3,1.9");
        testcaseListSolution1.add("8,2.34,5.7");
        testcaseListSolution1.add("1204485,433718.08,770767.45");
        testcaseListSolution1.add("918158,508519.51,409639.11");
        testcaseListSolution1.add("820401,106768.51,713633.23");
        //endregion
        //region Solution2
        testcaseListSolution2.add("3,3,1");
        testcaseListSolution2.add("2,3,2");
        testcaseListSolution2.add("1,3,3");
        testcaseListSolution2.add("16808,16808,282475250");
        testcaseListSolution2.add("622650074,622650074,984943659");
        //endregion
        //region Solution3
        testcaseListSolution3.add("E L,APPLE");
        testcaseListSolution3.add("E G,ORANGE");
        //endregion
        //region Solution4
        testcaseListSolution4 = addTestcaseFilePathList(testcaseListSolution4, 4);
        //endregion
        //region Solution5
        testcaseListSolution5 = addTestcaseFilePathList(testcaseListSolution5, 5);
        //endregion
        //region Solution6
        testcaseListSolution6.add("0,32");
        testcaseListSolution6.add("1,77");
        testcaseListSolution6.add("0,90998");
        //endregion
        //regionSolution7
        testcaseListSolution7.add("2,abcab");
        testcaseListSolution7.add("3,abcabc");
        testcaseListSolution7.add("3,bbeadcebfp");
        testcaseListSolution7.add("2,bfadhbhoeg");
        testcaseListSolution7.add("981,afcbdgigdrfacaafgbgeecadajadadebbofbdcaaidacacbdflbcfdbgaaidoaaafacaaiccdafhkcgaeeffebchbbaebfhiciabeaaabbmaefbagaabcafccbbaqdefaggddnjdafdibbeahjcjgebeddbababdgaegcbdcfbgabfhccecdibdccchbhbaccaebcbadbcecefcefcbdildkebngadeekasbbgfcafcfhbcafaaibcbcbickaaedafiaedbbccgpdedaccccclbggcoccaepbdaadgdfdbdbdfacbcacdaaabafadcibcbcbeehbffagibbabbcagbccbdcdddccdcdeahaafamngadgbcaaceeheabfcbedcfbbcbfacdagdaboddagfbaeagcbbclbcibcibhejceabdacbejfcdfbebccaggbcabdgiglcceaagaacchddacicacacgcbdffbogafcaacigdgcafcagbcaccbabecacahcdcgbhbgdcdcedagbaibbdadbkhcahbeaaaacbacagbaagbjcfaeadboakcaiacdaggfdgchacdjjpbalhadbbcfiaacdbeaidbeccebgajbifacblbbbcccebbemfancibbcdcdbbbadmlioqkccchcaiebacdaiddedgdbhifaccfaaaaebdffbbgdcbdefbhaabecdahfdjbfadaaabffdghhlabbabeaqdflkfcbbaaeeaeamocagaadabcdheafihbbgjhameiagdcjaahkadcibaafbacaadodakkdacgbdbffdbjmbbbafgddebihcaaaaeahhbhbbabhhdfdefcfeecadbgagicbebcambebcdeaaakgnbaacaafgfjagbbdeebgebdgbabdadgageachajedabcfekbebccgaacbfbfddbhaafdgmachacgdadaebgbadlbacjddbcbcaccbbjancdd");
        //endregion
    }

    StringBuilder appendLines(List<String> list, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(list.get(i)).append("\n");
        }
        return result;
    }

    List<String> addTestcaseFilePathList(List<String> testcaseListSolution, int solutionNumber) {
        String path = System.getProperty("user.dir") + "/test/Solution" + solutionNumber;
        File folder = new File(path);
        // Get an array of File objects representing files and subdirectories
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    testcaseListSolution.add(path + "/" + listOfFiles[i].getName());
                }
            }
        }
        return testcaseListSolution;
    }

    void displayResult(Object input, Object expectedOutput, Object ActualOutput) {
        System.out.println("Input: \n" + input.toString());
        System.out.println("Your Output: \n" + ActualOutput.toString());
        System.out.println("Expected Output: \n" + expectedOutput.toString());
        if (ActualOutput.toString().equals(expectedOutput.toString())) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
        System.out.println();
    }

    @Test
    public void test_solution1() {
        System.out.println("Running test_solution1");
        Solution1 solution1 = new Solution1();
        for (String item : testcaseListSolution1) {
            int expectedOutput = Integer.parseInt(item.split(",")[0]);
            float input1 = Float.parseFloat(item.split(",")[1]);
            float input2 = Float.parseFloat(item.split(",")[2]);
            int actualOutput = solution1.addNumbers(input1, input2);
            displayResult(input1 + "\n" + input2, expectedOutput, actualOutput);
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void test_solution2() {
        System.out.println("Running test_solution2");
        Solution2 solution2 = new Solution2();
        for (String item : testcaseListSolution2) {
            int expectedOutput = Integer.parseInt(item.split(",")[0]);
            int input1 = Integer.parseInt(item.split(",")[1]);
            int input2 = Integer.parseInt(item.split(",")[2]);
            int actualOutput = solution2.jumps(input1, input2);
            displayResult(input1 + "\n" + input2, expectedOutput, actualOutput);
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void test_solution3() {
        System.out.println("Running test_solution3");
        Solution3 solution3 = new Solution3();
        for (String item : testcaseListSolution3) {
            String expectedOutput = item.split(",")[0];
            String input = item.split(",")[1];
            String actualOutput = solution3.lastLetters(input);
            displayResult(input, expectedOutput, actualOutput);
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void test_solution4() throws IOException {
        System.out.println("Running test_solution4");
        Solution4 solution4 = new Solution4();
        for (String item : testcaseListSolution4) {
            List<String> allLines = Files.readAllLines(Paths.get(item));
            int numberOfInputs = Integer.parseInt(allLines.get(0));

            StringBuilder input = appendLines(allLines, 1, numberOfInputs);
            List<String> inputList = new ArrayList<>();
            for (int i = 1; i <= numberOfInputs; i++) {
                inputList.add(allLines.get(i));
            }

            StringBuilder expectedOutput = appendLines(allLines, numberOfInputs + 1, numberOfInputs * 2);

            StringBuilder actualOutput = new StringBuilder();
            for (int i = 0; i < inputList.size(); i++) {
                Boolean booleanString = inputList.get(i).matches(solution4.regularExpression);
                String booleanStringWithFirstCapitalLetter = booleanString.toString().substring(0, 1).toUpperCase()
                        + booleanString.toString().substring(1);
                actualOutput.append(booleanStringWithFirstCapitalLetter).append("\n");
            }
            displayResult(input, expectedOutput, actualOutput);
            assertEquals(expectedOutput.toString(), actualOutput.toString());
        }
    }

    @Test
    public void test_solution5() throws IOException {
        System.out.println("Running test_solution5");
        Solution5 solution5 = new Solution5();
        for (String item : testcaseListSolution5) {
            List<String> allLines = Files.readAllLines(Paths.get(item));
            int numberOfInputs = Integer.parseInt(allLines.get(0));

            int input = numberOfInputs;

            StringBuilder expectedOutput = appendLines(allLines,1, numberOfInputs);

            StringBuilder actualOutput = solution5.fizzBuzz(input);

            displayResult(input, expectedOutput, actualOutput);
            assertEquals(expectedOutput.toString(), actualOutput.toString());
        }
    }

    @Test
    public void test_solution6() {
        System.out.println("Running test_solution6");
        Solution6 solution6 = new Solution6();
        for (String item : testcaseListSolution6) {
            int expectedOutput = Integer.parseInt(item.split(",")[0]);
            int input = Integer.parseInt(item.split(",")[1]);
            int actualOutput = solution6.fourthBit(input);
            displayResult(input, expectedOutput, actualOutput);
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void test_solution7() {
        System.out.println("Running test_solution7");
        Solution7 solution7 = new Solution7();
        for (String item : testcaseListSolution7) {
            int expectedOutput = Integer.parseInt(item.split(",")[0]);
            String input = item.split(",")[1];
            int actualOutput = solution7.getMinDeletions(input);
            displayResult(input, expectedOutput, actualOutput);
            assertEquals(expectedOutput, actualOutput);
        }
    }
}
