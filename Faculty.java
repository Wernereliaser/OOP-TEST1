/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptest2;

/**
 *
 * @author 218086113
 */
public class Faculty extends University implements FacultyInterface {    //inheritance of another class

    public String FacultyName;
    public int noOfPartnerships;
    public String departmentList;
    
    

    public Faculty(String FacultyName, int noOfPartnerships, String departmentList,String universityName, double CancellorName) { //Full constractor
        super(universityName, CancellorName);
        
        this.FacultyName = FacultyName;
        this.noOfPartnerships = noOfPartnerships;
        this.departmentList = departmentList;
    }

    public Faculty(String universityName, double CancellorName) {
        super(universityName, CancellorName);
    }
    

   

    public Faculty( ) { //Empty Constractor"

    }
     

    @Override
    public double externalFunding(double externalFunding) throws ExternalFundingException {    //External funding calculations

        if (FacultyName.equals("FCI")) {
            externalFunding = (noOfPartnerships * 1500000);
            if (externalFunding == 10000000) {
                String message = "externalFunding should not exceed 10 million annually";
                System.out.println(message);
            }
            else{
                System.out.println(externalFunding);
            }

            
            
        } else if (FacultyName.equals("FEN")) {
            externalFunding = (noOfPartnerships * 1200000);
            if (externalFunding == 10000000) {
                String message = "externalFunding should not exceed 10 million annually";
                System.out.println(message);
            }
            else{
                System.out.println(externalFunding);
            }
            
            
        } else if (FacultyName.equals("FHS")) {
            externalFunding = (noOfPartnerships * 850000);
            if (externalFunding == 10000000) {
                String message = "externalFunding should not exceed 10 million annually";
                System.out.println(message);
            }
            else{
                System.out.println(externalFunding);
            }
            
            
        } else {
            System.out.println("invalid Faculty name");
        }
        return externalFunding;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String FacultyName) {
        this.FacultyName = FacultyName;
    }

    public int getNoOfPartnerships() {
        return noOfPartnerships;
    }

    public void setNoOfPartnerships(int noOfPartnerships) {
        this.noOfPartnerships = noOfPartnerships;
    }

    public String getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(String departmentList) {
        this.departmentList = departmentList;
    }
        @Override
    public String toString() {
        return "Faculty \n" + "FacultyName : " + FacultyName + "\n noOfPartnerships : " + noOfPartnerships + "\n departmentList : " + departmentList + "\n"+
             "\nuniversityName : " + universityName + "\nCancellorName : " + CancellorName + '}';
    }



}
