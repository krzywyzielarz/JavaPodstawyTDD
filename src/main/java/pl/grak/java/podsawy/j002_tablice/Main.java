package pl.grak.java.podsawy.j002_tablice;

public class Main {
    public static void main(String[] args) {

        int[] tab1 = {3, 4, 2, 6, 1};
        int[] tab2 = new int[2];

        System.out.println(tab1[1]);

        for (int x = 0; x < tab1.length; x++) {
            System.out.println(tab1[x]);
        }
        System.out.println("xxxxxxxxxxx");
        for (int x = tab1.length - 1; x >= 0; x--) {
            System.out.println(tab1[x]);
        }
        int[] liczby;
        liczby = new int[3];

        String dane = "dane";
        dane.toUpperCase();
        liczby[0] = 10;
        System.out.println("dd" + liczby[0]);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("v"));

        int maxX = 5;
        int maxY = 10;
        Math.max(maxX, maxY);
        System.out.println(Math.max(maxX, maxY));


        int sqrt = 16;
        Math.sqrt(sqrt);
        System.out.println(Math.sqrt(sqrt));

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        int iw = 1;
        while (iw < 6) {
            System.out.println(iw);
            iw++;
        }

        System.out.println("***************");
        int iDo = 1;
        do {
            System.out.println(iDo);
            iDo++;
        } while
        (iDo < 6);


        System.out.println("***************");


        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i: cars){
            System.out.println(i);
        }

    }
}
