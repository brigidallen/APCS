public class test {
  public static void main(String[] args) {
    int[][] arr = {{2, 7}, {3, 6, 1}, {7}};
    System.out.println(arr2DToString(arr));
    System.out.println(sumArray(arr));
    incrementArray(arr);
    System.out.println(arr2DToString(arr));
    int[][] ar2 = {{3, 4, 5, 6, 7}, {7, 2, 4, 5, 8, 2, 3, }, {3, 5, 7, 2, 2}};
    System.out.println(arr2DToString(ar2));
    System.out.println(sumArray(ar2));
    incrementArray(ar2);
    System.out.println(arr2DToString(ar2));
  }
  public static String arr2DToString(int[][] arr){
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
  public static int sumArray(int[][] arr){
    int sum = 0;
    for(int i =0; i < arr.length; i++){
      for(int j =0; j < arr[i].length; j++){
        sum += arr[i][j];
      }
    } return sum;
  }
  public static void incrementArray(int[][]arr){
    for(int i =0; i < arr.length; i++){
      for(int j =0; j < arr[i].length; j++){
        arr[i][j] ++;
      }
    }
  }
}
