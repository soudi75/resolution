/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner ; 
/**
 *
 * @author admin
 */
public class Tableau2 {
    public static void main(String[]args) { 
        int[]tab={12,15,13,10,8,9,13,14} ; 
        int n;
        int indice=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le nombre a chercher");
        n=sc.nextInt();
       for(int i=0;i<tab.length;i++){  
        if(tab[i]==n) {
            indice=i; 
            
        }
    }
    if(indice!=-1){
      System.out.println("le_nombre_est_a_l'indice_");
      System.out.println(indice);
     
       }else{
        System.out.println("Le_nombre_n_est_pas_dans_le_tableau");
    }
    }
}
