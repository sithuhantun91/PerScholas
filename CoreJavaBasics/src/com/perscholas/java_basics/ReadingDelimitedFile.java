package com.perscholas.java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingDelimitedFile {
}

class ScanDelimitedFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //String location = "C:/Users/Downloads/cars.csv";
            String location = "./resources/cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (input.hasNextLine()) {
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                data.add(splitedLine);
            }
            for (String[] line : data) {
                //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" +
                //line[3] + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
                System.out.println("Car Name :" + line[0]);
                System.out.println("MPG :" + line[1]);
                System.out.println("Cylinder :" + line[2]);
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}

class course {
    private String code, course_name, instructor_name;
    public course (String code, String name, String instructor) {
        this.code = code;
        this.course_name = name;
        this.instructor_name = instructor;
    }
    public course () {
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public String getInstructor_name() {
        return instructor_name;
    }
    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}

class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //----- change file path, as per your file location
            //String location = "C:/Users/Downloads/CourseData.csv";
            String location = "./resources/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<course> data = new ArrayList<course>();
            while (input.hasNextLine()) {
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                // course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name( splitedLine[1]);
                cObj.setInstructor_name(splitedLine[2]);
                data.add(cObj);
            }
            for (course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + "|"
                        + c.getInstructor_name());
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}