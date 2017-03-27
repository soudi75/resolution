/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
import java.util.Scanner;
/**
 
 * @author admin
 */
public class Tableau1 {
   public static void main(String []args) {  
       int[]tab={12,15,13,10,8,9,13,14};
       int n; 
       boolean estLa=false; 
        Scanner sc=new Scanner(System.in);
       System.out.println("Entrer_le_nombre_a_checher");
         n=sc.nextInt();
       for(int i=0; i<tab.length; i++){
           if(tab[i] == n){  
               estLa=true;
           }}if(estLa){ 
         System.out.println("Le nombre est dans le tableau");
     } else{ 
          System.out.println("Le nombre n'est pas dans le tableau");
     }
   }
   } 

