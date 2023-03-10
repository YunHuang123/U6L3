import java.util.Arrays;

public class ArrayAlgorithmTester
{
    public static void main(String[] args)
    {
        /*String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));

        // original array NOT modified
        System.out.println(Arrays.toString(strings));

        System.out.println("----");

        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));

        // original array NOT modified
        System.out.println(Arrays.toString(strings2));

        System.out.println("----");

        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));

        // original array NOT modified
        System.out.println(Arrays.toString(strings3));

        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.makeUppercase(words);

        // original word list IS modified
        System.out.println(Arrays.toString(words));

        int[] nums = {-6, -4, 0, -3, 1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums);
        System.out.println(positive);

        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));

        System.out.println("----");

        int[] nums2 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums2);
        System.out.println(positive2);

        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums2));

        String[] stringsOne = {"hello", "hole", "Adam", "Apple", "why?"};
        boolean hasStr = ArrayAlgorithms.containsString(stringsOne, "y");
        System.out.println(hasStr);

        // original array NOT modified
        System.out.println(Arrays.toString(stringsOne));

        System.out.println("----");

        boolean hasStr2 = ArrayAlgorithms.containsString(stringsOne, "LE");
        System.out.println(hasStr2);

        boolean hasStr3 = ArrayAlgorithms.containsString(stringsOne, "ap");
        System.out.println(hasStr3);

        boolean hasStr4 = ArrayAlgorithms.containsString(stringsOne, "hola");
        System.out.println(hasStr4);

        String[] stringsTwo = {"HELLO", "Hole", "Adam", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(stringsTwo);
        System.out.println(Arrays.toString(lower));

        // original array NOT modified
        System.out.println(Arrays.toString(stringsTwo));

        int[] arr1= {2, 5, 6, 1, 0};
        int[] arr2 = {1, 7, 6, -2, 8};
        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);
        System.out.println(Arrays.toString(maximums));

        // original arrays NOT modified
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String[] strings = {"hello!", "!!!whoa", "sad", "Adam!", "What! No way", "Why?!"};
        int numExclamations = ArrayAlgorithms.endsInExclamations(strings);
        System.out.println(numExclamations);

        // original array NOT modified
        System.out.println(Arrays.toString(strings));

        int[] nums = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums);
        System.out.println(numDoubles);

        // original array NOT modified
        System.out.println(Arrays.toString(nums));

        int[] nums = {5, 1, 3, 4, 7};
        int[] shiftedLeftArr = ArrayAlgorithms.shiftLeft(nums);
        System.out.println(Arrays.toString(shiftedLeftArr));

        // original array NOT modified
        System.out.println(Arrays.toString(nums));

        int[] nums = {5, 1, 3, 4, 7};
        ArrayAlgorithms.shiftLeftModify(nums);

        // original array IS modified
        System.out.println(Arrays.toString(nums));*/

        int[] nums = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.shiftNumLeftModify(nums, 2);

        // original array IS modified; all elements shifted left 2
        System.out.println(Arrays.toString(nums));

        int[] sameNums = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.shiftNumLeftModify(sameNums, 4);

        // original array IS modified; all elements shifted left 4
        System.out.println(Arrays.toString(sameNums));

        int[] moreNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.shiftNumLeftModify(moreNums, 8);

        // original array IS modified; all elements shifted left 8
        System.out.println(Arrays.toString(moreNums));

        int[] moreNumsAgain = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.shiftNumLeftModify(moreNumsAgain, 10);

        // original array IS modified; all elements shifted left 10
        System.out.println(Arrays.toString(moreNumsAgain));




    }
}
