public class MultiArrayTest {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4}, {5,6,7,8}};
        System.out.println("Row length is " + numbers.length);
        System.out.println("Column lenght of furst row is " + numbers[0].length);

        // Loop inside array
        for(int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; ++j){
                System.out.println("Element [" + i + "][" + j + "] is " + numbers[i][j]);
            }
        }
    }
}
