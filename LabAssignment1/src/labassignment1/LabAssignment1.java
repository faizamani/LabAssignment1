/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment1;

/**
 *
 * @author My HP
 */
public class LabAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Mohd Faiz Amani Bin Hassan";
        System.out.println(name1);
        System.out.println(name1.toLowerCase());
        
        System.out.println(name1.toUpperCase());
        
        System.out.println(name1.length());
        
        
        
        
        String name2= "Mohd Faiz Amani Bin-Hassan";
        String parts [] =name2.split("-");
        
        for ( int i = 0; i<parts.length; i++){
            System.out.println("-------->"+parts[i]);
        }
        
        
        
    
    }
    
    
}
