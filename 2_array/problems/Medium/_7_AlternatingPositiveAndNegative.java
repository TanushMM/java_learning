import java.util.*;
public class _7_AlternatingPositiveAndNegative {
    public static void equalNumberOfPositiveAndNegative(int[] array) {
        int positive = 0;
        int negative = 1;
        int[] answer = new int[array.length];
        for(int i =0; i < array.length; i++) {
            if(array[i] > 0) {
                answer[i] = array[positive];
                positive+=2;
            } else {
                answer[i] = array[negative];
                negative+=2;
            }
        }
        for(int i: answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void nonEqualNumberOfPositiveAndNegative(int[] array) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] answer = new int[array.length];
        int k = 0;
        for(int i : array) {
            if (i < 0){
                negative.add(i);
            } else {
                positive.add(i);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int i =0; i < array.length; i++) {
            if (i == 0 || i%2 == 0) {
                answer[k] = positive.get(posIndex);
                posIndex++; k++;
            } else {
                answer[k] = negative.get(negIndex);
                negIndex++; k++;
            }
        }
        while (k < array.length) {
            answer[k] = positive.get(posIndex);
            posIndex++; k++;
        }
        while (k < array.length) {
            answer[k] = negative.get(negIndex);
            negIndex++; k++;
        }
        for(int i: answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array_1 = {3,1,-2,-5,2,-4};
        int[] array = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        equalNumberOfPositiveAndNegative(array_1);
        nonEqualNumberOfPositiveAndNegative(array);
    }
}
