public class Pairproject{
  public static void main(String[] args) {
    System.out.println(equalsIsNot("is is is the one two is three not is not"));
    System.out.println(equalsIsNot("not not one notnot is notnot isisisisisisis"));
    System.out.println(equalsIsNot("notootnewkdjndonoiisisisnonotnotnotnontontsisj"));
    System.out.println(equalsIsNot("This is not"));
    System.out.println(equalsIsNot("This is notnot"));
    System.out.println(equalsIsNot("noisxxnotyynotxisi"));
  }
  public static boolean equalsIsNot(String str){
    int count = 0;
    int notcount = 0;
    for(int i = 0; i < str.length()-2; i++){
      if(str.charAt(i) == 'i' && str.charAt(i+1) == 's'){
        count++;
      } else if(str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't'){
        notcount++;
      }
    } return count == notcount;
  }
}
