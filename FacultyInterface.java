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
public interface FacultyInterface {
    default public double externalFunding(double g) throws ExternalFundingException {
        
        return g;
    }

   public enum facultyLocation {
       onCampus,
       offCamous;
       
   }
       

}
