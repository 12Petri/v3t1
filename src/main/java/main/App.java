package main;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String defaultPin = "0000";
        Safe newSafe = new Safe(defaultPin);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Aseta PIN-koodi\r\n" + //
                                "2) Lisää tietoja kansioon\r\n" + //
                                "3) Listaa tiedot kansiosta\r\n" + //
                                "0) Lopeta ohjelma");
                                
        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);
                                
        switch (i) {
            case 1:
                System.out.print("Anna uusi PIN-koodi: ");
                String newPin = sc.nextLine();
                newSafe.changePin(newPin);
                break;
            case 2:
                System.out.print("Anna kansioon lisättävä tieto: ");
                String data = sc.nextLine();
                newSafe.addData(data);
                break;
            case 3:
                System.out.print("Anna PIN-koodi: ");
                String pin = sc.nextLine();
                ArrayList<String> datalList = newSafe.listData(pin);
                if (datalList != null) {
                    for (String stuff : datalList) {
                        System.out.println(stuff);
                    }
                }
                break;
            case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                break;
            default:
                System.out.println("Syöte oli väärä");
                break;
            }
        }

    }
    sc.close();
    }
}
