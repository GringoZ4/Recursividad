/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB05-MAQ18
 */
public class RecursiboSumaEntero {

    public static void main(String[] args) {
//System.out.println(String.valueOf(sumanenteros(5)));
     
System.out.println(String.valueOf(fibonnaciRecursivo2(1,1,5,1)));
    }

    static long sumanenteros(int s) {
        int cont = 1;
        int suma = 0;
        while (cont <= s) {
            suma =suma+ cont;
            cont++;
        }
        return suma;
    }

    static long enteroRecursivo(int n) {

        if (n == 1) {
            return 1;
        } else {
            System.out.println(n + enteroRecursivo(n-1));
            return n + enteroRecursivo(n-1);
                    
        
    
        }
        
        }
        static long fibonaccirecrusibo(int n){
            if(n==1|| n==0){
            return n;
        }else{
                return fibonaccirecrusibo(n-1)+fibonaccirecrusibo(n-2);
            }
            
        }
        
       static int fibonnaciRecursivo2(int i,int n,int piv,int fib){
           
           if(i==n){
           return fib;
       }else{
               int temp=fib;
               fib=piv+fib;
               piv=temp;
               i++;
           }
           
           return fibonnaciRecursivo2(i,n,piv,fib);
           
           
       }
        
        
    
}
