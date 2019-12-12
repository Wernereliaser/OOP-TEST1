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
public class University {
    public String universityName;
    public double CancellorName;

    public University(String universityName, double CancellorName) { //full constructor
        this.universityName = universityName;
        this.CancellorName = CancellorName;
    }
    public University(){ //empty costructor
        
    }
  //  University uc = new University("Namibia University Of Science ant Technology", 78888889);

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public double getCancellorName() {
        return CancellorName;
    }

    public void setCancellorName(double CancellorName) {
        this.CancellorName = CancellorName;
    }

    @Override
    public String toString() {
        return "University{" + "universityName=" + universityName + ", CancellorName=" + CancellorName + '}';
    }
    
}
