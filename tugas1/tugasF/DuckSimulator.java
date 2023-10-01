/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Duck> kumppulanDuck = new ArrayList<>();
        
        kumppulanDuck.add(new DecoyDuck());
        kumppulanDuck.add(new MaraldDuck());
        kumppulanDuck.add(new ModelDuck());
        kumppulanDuck.add(new RedHeadDuck());
        kumppulanDuck.add(new RubberDuck());
        
        System.out.println("Silahkan Anda Pilih Nama Bebeknya : ");
        for (int i = 0; i < kumppulanDuck.size(); i++) {
            System.out.println((i + 1) + ". " + kumppulanDuck.get(i).getClass().getSimpleName());
        }
        int angka = scnr.nextInt();
        
        if(angka >= 1 && angka <= kumppulanDuck.size() ){
             Duck pilihDuck = kumppulanDuck.get(angka - 1);
            System.out.println("Anda memilih " + pilihDuck.getClass().getSimpleName());
            pilihDuck.display();
            pilihDuck.perfomFly();
            pilihDuck.performQuack();
            pilihDuck.swim();
        }else{
             System.out.println("Pilihan Anda Salah");
        }
        scnr.close();
    }
}
