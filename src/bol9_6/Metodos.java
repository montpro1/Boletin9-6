package bol9_6;


import java.util.Scanner;


public class Metodos {
    Scanner sc=new Scanner(System.in);
    
    public double percent(int workers,int poors){
     return ((double)poors/(double)workers)*100;  
    }
    public void countWorkersBySalary(){
        int cont=0;
        int cont2=0;
        int cont3=0;
        int soldo;
        
        do{
            System.out.println("Introduce el sueldo del trabajador");
            soldo=sc.nextInt();
            if(soldo>0){
                
            
            if(soldo>=1000&&soldo<=1750){
                
                cont ++;
            }
            else if(soldo<1000){
                cont2 ++;
            }
            
            cont3 ++;
        }
        }while(soldo>0);
        System.out.println("Estos son los trabajadores entre 1000 y 1750 "+cont);
        System.out.println("Estos trabajadores menos de 1000 "+ this.percent(cont3, cont2));
           
    }
    
}