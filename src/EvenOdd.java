public class EvenOdd {
    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        int[] arr = {46, 47, 48, 45, 49, 50};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countEven+" "+countOdd);

    }

}


















































