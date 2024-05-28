package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowStatements {
}

/*
 * 1. Write a program that declares 1 integer variable x, and then
 * assigns 7 to it. Write an if statement to print out “Less than 10” if x is
 * less than 10. Change x to equal 15, and notice the result (console
 * should not display anything).
 * */
class ControlFlowStatements1 {
    public static void main(String[] args) {
        int x = 7;
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }
}

/*
 * 2. Write a program that declares 1 integer variable x, and then
 * assigns 7 to it. Write an if-else statement that prints out “Less than 10”
 * if x is less than 10, and “Greater than 10” if x is greater than 10.
 * Change x to 15 and notice the result.
 */

class ControlFlowStatements2 {
    public static void main(String[] args) {
        int x = 7;
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }
}

/*
 * 3. Write a program that declares 1 integer variable x, and then
 * assigns 15 to it. Write an if-else-if statement that prints out “Less than
 * 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but
 * less than 20, and “Greater than or equal to 20” if x is greater than or
 * equal to 20. Change x to 50 and notice the result.
 * */
class ControlFlowStatements3 {
    public static void main(String[] args) {
        int x = 15;
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }
}

/*
 * 4. Write a program that declares 1 integer variable x, and then
 * assigns 15 to it. Write an if-else statement that prints “Out of range” if
 * the number is less than 10 or greater than 20 and prints “In range” if
 * the number is between 10 and 20 (including equal to 10 or 20).
 * Change x to 5 and notice the result.
 */
class ControlFlowStatements4 {
    public static void main(String[] args) {
        int x = 15;
        x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }
}

/*
 * 5. Write a program that uses if-else-if statements to print out grades
 * A, B, C, D, F, according to the following criteria:
 * A: 90-100
 * B: 80-89
 * C: 70-79
 * D: 60-69
 * F: <60
 * Use the Scanner class to accept a number score from the user to
 * determine the letter grade. Print out “Score out of range” if the score
 * is less than 0 or greater than 100.
 */
class ControlFlowStatements5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score number: ");
        int score = input.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade D");
        } else if (score < 60) {
            System.out.println("Grade F");
        }
    }
}

/*
 * 6. Write a program that accepts an integer between 1 and 7 from
 * the user. Use a switch statement to print out the corresponding
 * weekday. Print “Out of range” if the number is less than 1 or greater
 * than 7. Do not forget to include “break” statements in each of your
 * cases.
 */
class ControlFlowStatements6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int score = input.nextInt();
        switch (score) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}

/*
 * 7. Create a program that lets the users input their filing status and
 * income. Display how much tax the user would have to pay
 * according to status and income.
 * ❑ The U.S. federal personal income tax is calculated based
 * on the filing status and taxable income.
 * ❑ There are four filing statuses: Single, Married Filing Jointly,
 * Married Filing Separately, and Head of Household.
 * ❑ The tax rates for 2009 are shown below.
 * Marginal Tax Rate: 10%, 15%, 25%, 28%, 33%, 35%
 * Single:
 * $0 - $8,350
 * $8,351 - $33,950
 * $33,951 - $82,250
 * $82,251 - $171,550
 * $171,551 - $372,950
 * $372,951+
 * Married Filing Jointly or Qualifying Widow(er):
 * $0 - $16,700
 * $16,701 - $67,900
 * $67,901 - $137,050
 * $137,051 - $208,850
 * $208,851 - $372,950
 * $372,951+
 * Married Filing Separately:
 * $0 – $8,350
 * $8,351 – $33,950
 * $33,951 – $68,525
 * $68,526 –$104,425
 * $104,426 – $186,475
 * $186,476+
 * Head of Household:
 * $0 – $11,950
 * $11,951 – $45,500
 * $45,501 –$117,900
 * $117,901–$190,200
 * $190,201–$372,950
 * $372,951+
 */
class ControlFlowStatements7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Single\n" +
                "2: Married Filing Jointly or Qualifying Widow(er)\n" +
                "3: Married Filing Separately\n" +
                "4: Head of Household\n");
        System.out.print("Enter your tax filing status(1~4): ");
        int status = input.nextInt();
        System.out.print("Enter your income($): ");
        int income = input.nextInt();
        double tax = 0.0;
        switch (status) {
            case 1:
                if(income >= 0 && income <= 8350) {
                    tax = income * 0.10;
                    System.out.println("Tax rate: 10%");
                }
                else if(income >= 8351 && income <= 33950) {
                    tax = income * 0.15;
                    System.out.println("Tax rate: 15%");
                }
                else if(income >= 33951 && income <= 82250) {
                    tax = income * 0.25;
                    System.out.println("Tax rate: 25%");
                }
                else if(income >= 82251 && income <= 171550) {
                    tax = income * 0.28;
                    System.out.println("Tax rate: 28%");
                }
                else if(income >= 171551 && income <= 372950) {
                    tax = income * 0.33;
                    System.out.println("Tax rate: 33%");
                }else if(income >= 372951) {
                    tax = income * 0.35;
                    System.out.println("Tax rate: 35%");
                }
                break;
            case 2:
                if(income >= 0 && income <= 16700) {
                    tax = income * 0.10;
                    System.out.println("Tax rate: 10%");
                }
                else if(income >= 16701 && income <= 67900) {
                    tax = income * 0.15;
                    System.out.println("Tax rate: 15%");
                }
                else if(income >= 67901 && income <= 137050) {
                    tax = income * 0.25;
                    System.out.println("Tax rate: 25%");
                }
                else if(income >= 137051 && income <= 208850) {
                    tax = income * 0.28;
                    System.out.println("Tax rate: 28%");
                }
                else if(income >= 208851 && income <= 372950) {
                    tax = income * 0.33;
                    System.out.println("Tax rate: 33%");
                }else if(income >= 372951) {
                    tax = income * 0.35;
                    System.out.println("Tax rate: 35%");
                }
                break;
            case 3:
                if(income >= 0 && income <= 8350) {
                    tax = income * 0.10;
                    System.out.println("Tax rate: 10%");
                }
                else if(income >= 8351 && income <= 33950) {
                    tax = income * 0.15;
                    System.out.println("Tax rate: 15%");
                }
                else if(income >= 33951 && income <= 68525) {
                    tax = income * 0.25;
                    System.out.println("Tax rate: 25%");
                }
                else if(income >= 68526 && income <= 104425) {
                    tax = income * 0.28;
                    System.out.println("Tax rate: 28%");
                }
                else if(income >= 104426 && income <= 186475) {
                    tax = income * 0.33;
                    System.out.println("Tax rate: 33%");
                }else if(income >= 186476) {
                    tax = income * 0.35;
                    System.out.println("Tax rate: 35%");
                }
                break;
            case 4:
                if(income >= 0 && income <= 11950) {
                    tax = income * 0.10;
                    System.out.println("Tax rate: 10%");
                }
                else if(income >= 11951 && income <= 45500) {
                    tax = income * 0.15;
                    System.out.println("Tax rate: 15%");
                }
                else if(income >= 45501 && income <= 117450) {
                    tax = income * 0.25;
                    System.out.println("Tax rate: 25%");
                }
                else if(income >= 117451 && income <= 190200) {
                    tax = income * 0.28;
                    System.out.println("Tax rate: 28%");
                }
                else if(income >= 190201 && income <= 372950) {
                    tax = income * 0.33;
                    System.out.println("Tax rate: 33%");
                }else if(income >= 372951) {
                    tax = income * 0.35;
                    System.out.println("Tax rate: 35%");
                }
                break;
        }
        System.out.println("Tax: $" + Math.round(tax));
    }
}