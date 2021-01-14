public class MainApp {
    public static void main(String[] args) {

        // UWAGA : KONIECZNE WYKOMENTOWANIE POZOSTAŁYCH ZADAŃ NIŻ OBECNIE PUSZCZANE

        // Ad. ZADANIE 1  

//        String[] wyrazy = {"Pierwszy", "Drugi", "Trzeci", "Czwarty", "Piąty", "Szósty"};
//
//        String first = wyrazy[0];
//        String last = wyrazy[wyrazy.length - 1];
//
//        for (String wyraz : wyrazy) {
//            System.out.println(wyraz);
//        }
//
//        wyrazy[0] = last;
//        wyrazy[wyrazy.length - 1] = first;
//
//        for (String wyraz : wyrazy) {
//            System.out.println(wyraz);
//        }

        //Ad. ZADANIE 2

//        int[] numbers = {1, 2, 3, 3, 3, 3, 3, 4, 6, 7, 7, 7, 8};
//
//        int odd = 0;
//        int even = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//
//        System.out.println("Liczby parzyste: " + even);
//        System.out.println("Liczby nieparzyste: " + odd);

        // Ad. ZADANIE 3

        int[] numbers = {2, 4, 1, 6, 0, 3, 7, 8, 10, 12, 9};
        // Docelowo: 12 10 9 8 7 6 4 3 2 1 0

        int max;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];

                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
