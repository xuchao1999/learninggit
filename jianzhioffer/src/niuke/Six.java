package niuke;

public class Six {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                return array[i + 1];
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        Six six = new Six();
        int[] array = {2, 2, 2, 2};
        System.out.println(six.minNumberInRotateArray(array));
    }
}
