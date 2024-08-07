package com.perscholas.java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MiniHackathon1Ver2 {
    //Regex to ignore comma inside double quotes
    private static final String REGEX = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();
        List<SalesRep> salesRepList = new ArrayList<>();
        String choice = "";
        try {
            //Read data from csv files
            String location = "./miniHackathon1/Company.csv";
            companyList = getCompanyList(location);
            location = "./miniHackathon1/SalesReps.csv";
            salesRepList = getSalesRepList(location);

            //find Sales Person by last name
            Scanner sc = new Scanner(System.in);
            do {
                //get Sales Person's Last name from user input
                System.out.println("Enter Sales Person's Last name to search company data: ");
                String lastName = sc.nextLine().toLowerCase();

                //find Sales Person
                List<SalesRep> salesReps = new ArrayList<>();
                salesReps = salesRepList.stream()
                        .filter(sr -> sr.getLastName().toLowerCase().equals(lastName))
                        .collect(Collectors.toList());
                System.out.println(salesReps.size() + " SalesRep found");
                System.out.println();

                //find associated companies for each sales person
                for (SalesRep sr : salesReps) {
                    System.out.println("Name: " + sr.getFirstName() + " " + sr.getLastName());
                    List<Company> companies = new ArrayList<>();
                    companies = companyList.stream()
                            .filter(company -> company.getSalesRepId().equals(sr.getUserId()))
                            .collect(Collectors.toList());
                    for (Company company : companies) {
                        System.out.println(company.toString());
                    }
                    System.out.println();
                }

                //Ask user want to continue search again or not
                System.out.println("Do you want to continue? (Y/N)");
                choice = sc.nextLine().toLowerCase();
                System.out.println();
            } while (choice.equals("yes") || choice.equals("y"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    //Read data from Company.csv file
    private static List<Company> getCompanyList(String filePath) throws Exception {
        List<Company> companyList = new ArrayList<>();
        File file = new File(filePath);
        Scanner input = new Scanner(file);
        input.nextLine();
        while (input.hasNextLine()) {
            String Line = input.nextLine();
            String[] splitedLine = Line.split(REGEX);
            Company company = new Company();
            company.setIndex(Integer.parseInt(splitedLine[0]));
            company.setOrganizationId(splitedLine[1]);
            company.setSalesRepId(splitedLine[2]);
            company.setName(splitedLine[3]);
            company.setWebsite(splitedLine[4]);
            company.setCountry(splitedLine[5]);
            company.setDescription(splitedLine[6]);
            company.setFounded(splitedLine[7]);
            company.setIndustry(splitedLine[8]);
            company.setNumberOfEmployees(Integer.parseInt(splitedLine[9]));
            companyList.add(company);
        }
        return companyList;
    }

    //Read data from SalesReps.csv file
    private static List<SalesRep> getSalesRepList(String filePath) throws Exception {
        List<SalesRep> salesRepList = new ArrayList<>();
        File file = new File(filePath);
        Scanner input = new Scanner(file);
        input.nextLine();
        while (input.hasNextLine()) {
            String Line = input.nextLine();
            String[] splitedLine = Line.split(REGEX);
            SalesRep salesRep = new SalesRep();
            salesRep.setUserId(splitedLine[0]);
            salesRep.setFirstName(splitedLine[1]);
            salesRep.setLastName(splitedLine[2]);
            salesRep.setEmail(splitedLine[3]);
            salesRep.setPhone(splitedLine[4]);
            salesRep.setDateOfBirth(splitedLine[5]);
            salesRepList.add(salesRep);
        }
        return salesRepList;
    }
}

class Company {
    private int index;
    private String organizationId;
    private String salesRepId;
    private String name;
    private String website;
    private String country;
    private String description;
    private String founded;
    private String industry;
    private int numberOfEmployees;

    @Override
    public String toString() {
        return "Organization Id: " + this.organizationId
                + "\nCompany Name: " + this.name
                + "\nCountry: " + this.country
                + "\nIndustry: " + this.industry
                + "\nNumber of Employees: " + this.numberOfEmployees;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(String salesRepId) {
        this.salesRepId = salesRepId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}

class SalesRep {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}