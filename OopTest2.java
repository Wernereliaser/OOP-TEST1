/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptest2;

import java.util.ArrayList;

/**
 *
 * @author 218086113
 */
public class OopTest2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        University u = new University();
         ArrayList<Faculty> faculty = new ArrayList();
         Faculty fac = new Faculty("FCI",4," Computing Informatics","NUST",477); //Usage of empty constracot
         faculty.add(fac);
        faculty.add(new Faculty("SEH",5,"Geoinformatics ","NUST",688) ); // usage of full constarator
         faculty.add(new Faculty("BAC",5,"Bachelor of Science","NUST",4777) );
        
        
        
        System.out.println(faculty.toString());     //Diaplay of all fuculty contents
    
    
     
    }

  
    
     
     
    
    
 
}

