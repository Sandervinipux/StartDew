/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdew;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task1 {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("Конвентер градусов Цельсия в градусы по Фаренгейту");
        System.out.println("введите градусы по цельсию");
        double gradC = scanner.nextDouble();
        System.out.println("по фаренгейту это");
        double gradF = gradC * 9 / 5 +32;
        System.out.printf("%.2f%n",gradF);
    }
}
