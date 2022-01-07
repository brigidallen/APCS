public class ArrayDemo{
  public static void main(String[] args) {
    int[] anArray;
    anArray=new int[10];
    for(int i = 0; i < anArray.length; i++){
      anArray[i] = (i * 100);
} for (int k = 0; k < anArray.length; k++){
  System.out.println(anArray[k]);
}
}
}
