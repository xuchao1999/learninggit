package niuke;

public class FirstQuestion {

    public static boolean Find(int target, int [][] array) {
        int i = array[0].length - 1;
        int j = 0;
        while(i >= 0 && j < array.length){
            if(array[j][i] == target){
                return true;
            }else if(array[j][i] < target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(7, a));
    }
}
