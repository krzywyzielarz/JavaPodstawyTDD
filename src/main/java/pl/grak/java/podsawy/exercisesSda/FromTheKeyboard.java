package pl.grak.java.podsawy.exercisesSda;

import java.util.Scanner;

public class FromTheKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczbaInt ;
        float liczbaFloat;
        String napis;
        napis = input.nextLine();
        liczbaInt = input.nextInt();
        liczbaFloat = input.nextFloat();

        System.out.println(napis+liczbaFloat+liczbaInt);

    }
}
