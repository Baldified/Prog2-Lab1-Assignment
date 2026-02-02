import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        // Problem 1
//        System.out.print("Enter array size: Between 2 and 105");
//        int n = sc.nextInt();
//        if (n >= QuestionOne.minHeights && n <= QuestionOne.maxHeights)
//            QuestionOne.height = new int[n];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            QuestionOne.height[i] = sc.nextInt();
//        }
//
//        QuestionOne.findMaxContainer();
//
//        // Problem 2
//        System.out.print("Enter array size: Between");
//        n = sc.nextInt();
//        if (n >= QuestionOne.minHeights && n <= QuestionOne.maxHeights)
//            QuestionOne.height = new int[n];


        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}; // Choose your array

        if (arr.length >= Utils.minHeights && arr.length <= Utils.maxHeights) { // Constraints
            System.out.println("Biggest area of water is: " + Utils.findMaxContainer(arr));
        }
    }
}