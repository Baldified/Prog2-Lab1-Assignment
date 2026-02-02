public class QuestionOne {
    static int[] height;
    static int maxHeights = 105;
    static int minHeights = 2;
    static int maxContainer = 0;
    static int currentContainer = 0;

//    public static void setLength(int n) {
//        if (n >= minHeights && n <= maxHeights)
//            height = new int[n];
//    }

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
}
