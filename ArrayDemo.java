public class arrayDemo{
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int[][] arr2D = {{1, 2}, {3}, {3, 2, 4}};
    int[][] arr2D1 = {{0, 2, 3}, {3, 2}, {0, 0}};
    int[][] arr2D2 = {{-1, 3, 2}, {-5, -4, 2, -4}};
    int[][] copy = copy(arr2D2);
    System.out.println(arrToString(arr));
    System.out.println(arrToString(arr2D));
    System.out.println(countZeros2D(arr2D));
    System.out.println(countZeroes2D(arr2D1));
    replaceNegative(copy);
    System.out.println(arrToString(copy));
    System.out.println(arrToString(arr2D2));
  }
  public static String aToString(int[][] arr){
    String str = "{";
    for(int i =0; i < arr.length; i++){
      str += "{";
      for(int j=0; j<arr[i].length; j++){
        str += arr[i][j];
        if(j< arr[i].length-1){
          str += ", ";
        }
      } str += "}";
      if (i < arr.length-1){
        str += ", ";
      }
    } str += "}";
    return str;
  }
  public static int countZeros2D(int[][] nums){
    int numzeros = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0){
          numzeros ++;
        }
      }
    } return numzeros;
  }
  public static void replaceNegative(int[][] vals){
    for(int i =0; i < vals.length; i++){
      for(int j =0; j < vals[i].length; j++){
        if (vals[i][j] < 0){
          if(i == j){
            vals[i][j] = 1;
          } else{
            vals[i][j] = 0;
          }
        }
      }
    }
  }
  public static int[][] copy(int[][] nums){
    int[][] arr2 = new int[nums.length];
    for(int i =0; i < nums.length; i++){
      for(int j =0; j < nums[i].length; j++){
        arr2[i][j] = nums[i][j];
      }
    } return arr2;
  }
}
