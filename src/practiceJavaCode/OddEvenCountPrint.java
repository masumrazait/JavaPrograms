package practiceJavaCode;

public class OddEvenCountPrint {
    public static void main(String Args[]) {
        int[] A = {11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 19, 25, 29, 31, 55, 11, 51, 53};
        int evenCount = 0;
        int oddCount = 0;
        int[] evenArray = new int[A.length]; 
        int[] oddArray = new int[A.length];  

        for (int Num : A) {
            if (Num % 2 == 0) {
                evenArray[evenCount] = Num;
                evenCount++;
            } else {
                oddArray[oddCount] = Num;
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.print("Even numbers array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers count: " + oddCount);
        System.out.print("Odd numbers array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}
