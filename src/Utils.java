public class Utils {
    // Problem 1
    static int[] height;
    static int maxHeights = 105;
    static int minHeights = 2;
    static int maxContainer = 0;
    static int currentContainer = 0;

    public static void findMaxContainer() {
        for (int h = 0; h < height.length; h++) {
            for (int w = 0; w < height.length; w++) {
                if (height[h] <= height[w]) {
                    currentContainer = height[h] * (w - h);
                    if (currentContainer > maxContainer)
                        maxContainer = currentContainer;
                }
                else if (height[h] > height[w]) {
                    currentContainer = height[w] * (w - h);
                    if (currentContainer > maxContainer)
                        maxContainer = currentContainer;
                }

            }
        }
        System.out.println(maxContainer);
    }


    // Problem 2
    static int[] nums;
    static int maxLength = 1000;
    static int minLength = 3;
    static int targetLimit = 104;
    static int sum = 0;
    static int closestSum = 0;

    public static void findClosestSum(int target) {
        for (int n1 = 0; n1 < nums.length; n1++) {


            for (int n2 = 0; n2 < nums.length; n2++) {
                for (int n3 = 0; n3 < nums.length; n3++) {
                    sum = nums[n1] + nums[n2] + nums[n3];
                }
            }

        }
    }
}
