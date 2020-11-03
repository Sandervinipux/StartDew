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
        System.out.println("--------Задача2-------");
        System.out.println("Загадано число от 5 до 10: ");
        int min = 5;
        int max = 10;
        System.out.println("Отгадай: ");
        Random random = new Random();
        int Mynumber = random.nextInt(max-min+1)+min;
        Scanner scanner = new Scanner (System.in);
        int atempt = 1;
        
        int gamerNumber = scanner.nextInt();
        if(Mynumber == gamerNumber){
            System.out.println("Ты выиграл");
        }if(Mynumber > gamerNumber){
            System.out.println("Ты проиграл");
        }
            
        System.out.println("Konec");
    }
}
    

    