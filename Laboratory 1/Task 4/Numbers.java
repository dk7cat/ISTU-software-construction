public class Numbers {

    public int summarize(int... numbers) {
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }
}
