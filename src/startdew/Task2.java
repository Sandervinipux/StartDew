/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdew;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class Task2 {
   public void run(){
       System.out.println("Угадай задуманное число.");
       System.out.println("-------------------------");
       int min = 0;
       int max = 20;
       Random random = new Random();
       int myNumber = random.nextInt(max-min+1)+min;
       System.out.println("Задумано число от "+min+" до "+max+". Угадай!");
       Scanner scanner = new Scanner(System.in);
       int attempt = 1;
       do{
           int gamerNumber = scanner.nextInt();
           if(myNumber == gamerNumber) {
               System.out.println("Ты выиграл!");
               break;
           }else{
               if(attempt < 3){
                   System.out.println("Не угадал, попробуй ещё: ");
                   if(myNumber > gamerNumber){
                       System.out.println("(Задуманное число больше)");
                   }else {
                       System.out.println("(Задуманное число больше)");
                   }
               }else{
                   System.out.println("Ты проиграл. Задуманное число: "+myNumber);
                   break;
               }
           }
           attempt++;
       }while(true);
   }
}
