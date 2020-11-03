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
        System.out.println("Конветер градусов Цельсия в градусы по Фаренгейту");
        System.out.println("Введите градусы по цельсию");
        double gradusqCelsija = scanner.nextDouble();
        System.out.println("Вычисляем градусы по фаренгейту");
        double gradusqFarengeit = gradusqCelsija * 1.8 + 32;
        System.out.println("Градусы по Фаренгейту: " + gradusqFarengeit);
    }
}
