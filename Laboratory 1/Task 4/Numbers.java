public class Numbers {

    public int summarize(int... numbers) {
        int result = 0;
//       Суммирование всех чисел numbers
        for (int number: numbers) {
            result += number;
        }
        return result;
    }
}
