/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roman;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Roman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
     int num=0,i=0;
     
     char[] d=a.toCharArray();
    
     
     if(d[i]=='X')
         num=num+10;
     else if(d[i]=='V')
             num=num+5;
     else
         num=num+1;
             
    do
     {
         i++;
         switch(d[i])
         {
             case 'X':
                 num=num+10;
                 
                  if(d[i-1]=='I')     
                 num=num-2;
                 
                      
                break;
                 //System.out.println(""+num);
             case 'V':
                  num=num+5;
                  
                  if(d[i-1]=='I')
                num=num-2;
                  
                     
                 break;
             case 'I':
                 num=num+1;
                 break;
                 
         }
         
     }while(i<d.length-1);
     System.out.println(""+num);
   
    
    }
}
