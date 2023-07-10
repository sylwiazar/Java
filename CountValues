import java.util.HashMap;
import java.util.Map;

public final class CountValues {
    public static void main(String[] args) {
        
        /*Function counts each value in given tab*/

        int[] numbers = new int[] {1,2,2,3,3,3,4,4,4,4};
        
        Map<Integer, Integer> countValues = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            if(countValues.containsKey(numbers[i])){
                countValues.put(numbers[i], countValues.get(numbers[i]) + 1);
            }
            else {
                countValues.put(numbers[i], 1);
            }
        }

        for (Integer i : countValues.keySet()) {
            System.out.println("Number " + i + " occours " + countValues.get(i) + " times.");
        }

    }
}
