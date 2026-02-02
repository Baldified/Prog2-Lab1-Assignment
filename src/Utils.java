public class Utils {
    // Problem 1
    // Constraints
    static int maxHeights = 105;
    static int minHeights = 2;

    public static int findMaxContainer(int[] arr) {
        int maxContainer = 0;
        if (arr.length > minHeights && arr.length < maxHeights) {
            for (int h = 0; h < arr.length; h++) {
                for (int w = 0; w < arr.length; w++) {
                    int height = Math.min(arr[h], arr[w]);
                    int currentContainer = height * (w - h);

                    if (currentContainer > maxContainer) {
                        maxContainer = currentContainer;
                    }
                }
            }
        }
        return maxContainer;
    }


    // Problem 2
    static int closestSum;
    static int sum;
    static int diffSum = Integer.MAX_VALUE;

    // Constraints
    static int maxLength = 1000;
    static int minLength = 3;
    static int targetLimit = 104;

    public static int findClosestSum(int[] arr, int target) {
        for (int n1 = 0; n1 < arr.length; n1++) {
            for (int n2 = 0; n2 < arr.length; n2++) {
                for (int n3 = 0; n3 < arr.length; n3++) {
                    if (n1 != n2 && n1 != n3 && n2 != n3) {
                        int sum = arr[n1] + arr[n2] + arr[n3];
                        if ((target - sum) < diffSum) {

                        }

                    }


                }
            }

        }
        return closestSum;
    }
}
