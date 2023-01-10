import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.printExclamation(words);

        System.out.println("----");

        // original word list NOT modified
        System.out.println(Arrays.toString(words));

        int[] nums = {6, 4, 0, 3, 9, -2, 5};
        int sum = ArrayAlgorithms.sum(nums);
        System.out.println(sum);

        System.out.println("----");

        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));




    }
}
