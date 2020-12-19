public class Zadanie2 {
    public static void main(String[] args) {
        int numOne = 6;
        int numTwo = 8;
        int numThree = 14;
        int numFour = 21;

        int sumOne = numOne + numTwo;
        int sumTwo = numThree + numFour;

        if(sumOne % 2 == 0){
            System.out.println("Suma dwóch pierwszych liczb jest parzysta");
        }

        if(sumTwo % 2 == 0){
            System.out.println("Suma dwóch pozostałych liczb jest parzysta");
        }else{
            System.out.println("Suma dwóch pozostałych liczb bynajmniej nie jest parzysta");
        }
        if(sumOne % 2 == 0 && sumTwo % 2 == 0){
            System.out.println("Wszystkie liczby są parzyste");
        }else{
            System.out.println("Definitywnie nie wszystkie liczby są parzyste");
        }
    }
}
