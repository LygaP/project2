import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //---------------------------------------------------------------
        // susikurti kintamaji su miesto kuriame gyvenate pavadinimu bei jį atspausdinti konsolėje
        // susikurti kintamajį int tipo, ir jame išsaugoti dabartinius metus (2023) ir atspausdinti.
        // sugeneruoti sveikajį atsitiktinį skaičių nuo 0 iki 50 intervale bei jį atspausdinti
        // sugeneruoti sveikajį atsitiktinį skaičių nuo 20 iki 70 intervale bei jį atspausdinti


        String city = "Kaunas";
        System.out.println(city);
        city = "Vilnius";
        System.out.println(city);


        int currYear = 2023;
        System.out.println(currYear);

        int min1 = 0;
        int max1 = 50;

        int rezultatas = min1 + (int) Math.round(Math.random() * (max1 - min1));
        System.out.println(rezultatas);

        int min2 = 20;
        int max2 = 70;

        int rezultatas1 = min2 + (int) Math.round(Math.random() * (max2 - min2));
        System.out.println(rezultatas1);


        // 1.
        System.out.println("=============== uzd 1. =================");

        String firstName = "Liga";
        String lastName = "Paleckiene";
        int yearOfBirth = 1985;
        int currentYear = 2023;

        System.out.println("Aš esu " + firstName + " " + lastName + ". " + "Man yra " + (currentYear - yearOfBirth) + " metai.");


        // 2.
        System.out.println("=============== uzd 2. =================");
        int min = 0;
        int max = 4;

        int randomNumber1 = min + (int) Math.round(Math.random() * (max - min)); // 6.187 = 6;  7.958 = 7
        int randomNumber2 = min + (int) Math.round(Math.random() * (max - min)); //1.0; 3.0

        randomNumber2 = 0;

        System.out.println("pirmas random skaicius yra " + randomNumber1);
        System.out.println("antras random skaicius yra " + randomNumber2);

        if (randomNumber1 > 0 && randomNumber2 != 0) {
            if (randomNumber1 < randomNumber2) {
                System.out.println(Math.round((double) randomNumber2 / randomNumber1 * 100) / 100.0);// 4 / 3 = 1; 4.0 / 3 = 1.33333333333333333
            } else {
                System.out.println(Math.round((double) randomNumber1 / randomNumber2 * 100) / 100.0);
            }
        } else {
            System.out.println("dalyba is nulio negalima");
        }

        System.out.println("apvalinimai");
        System.out.println(4.1451);
        System.out.println(Math.round(4.1451));

        System.out.println(Math.round(4.1451 * 100));
        System.out.println(Math.round(4.1451 * 100) / 100.0);
        System.out.println((double) Math.round(4.1451 * 100) / 100);


        // 3.

        System.out.println("=============== uzd 3. =================");

        int rndNum1 = (int) (Math.random() * 26); // 14
        int rndNum2 = (int) (Math.random() * 26); // 10
        int rndNum3 = (int) (Math.random() * 26); // 18
        System.out.println(rndNum1 + " " + rndNum2 + " " + rndNum3);

        if (rndNum1 >= rndNum2 && rndNum1 <= rndNum3) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum1);
        }

        if (rndNum1 <= rndNum2 && rndNum1 >= rndNum3) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum1);
        }

        if (rndNum2 >= rndNum1 && rndNum2 <= rndNum3) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum2);
        }

        if (rndNum2 <= rndNum1 && rndNum2 >= rndNum3) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum2);
        }

        if (rndNum3 <= rndNum1 && rndNum3 >= rndNum2) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum3);
        }

        if (rndNum3 > rndNum1 && rndNum3 < rndNum2) {
            System.out.println("Kintamasis su vidutine reiksme yra " + rndNum3);
        }


        // 4.
        System.out.println("=============== uzd 4. =================");

        int min4 = 1;
        int max4 = 10;

        int a = min4 + (int) Math.round(Math.random() * (max4 - min4));
        int b = min4 + (int) Math.round(Math.random() * (max4 - min4));
        int c = min4 + (int) Math.round(Math.random() * (max4 - min4));

        if (a + b >= c && b + c >= a && a + c >= b){
            System.out.println("Trikampis yra galimas.");
        }
        else
            System.out.println("Trikampis negalimas.");


        // 5.
        System.out.println("=============== uzd 5. =================");

        int =
        int =
        int =
        int =





        // 6.

        // 7.

        // 8.





    }
}