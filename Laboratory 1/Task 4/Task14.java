import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] nums = new int[args.length];
//        Переводим все элементы args в int
        for (int i =0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        Numbers numbers = new Numbers();
        System.out.println(numbers.summarize(nums));
    }
}
