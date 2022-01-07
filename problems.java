public class problems{
  public static void main(String[] args) {
    System.out.println(myLastIndex("hello", "l"));
    System.out.println(myLastIndex("My name is Brigid and I am sick of Raymond", "Raymond"));
    System.out.println(myUpper("fsdfSDFSSDFDSfdsfdsfsd;;;"));
  }
  public static int myLastIndex(String str, String sub){
    String rev = "";
    String sub_ = "";
    for (int i = str.length()-1; i >= 0; i--){
      rev += str.charAt(i);
    } for (int i = sub.length()-1; i >= 0; i--){
      sub_ += sub.charAt(i);
    }
    return str.length()-rev.indexOf(sub_)-sub.length();
  }
  public static String myUpper(String str) {
    String fin = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i)) && str.charAt(i) >= 97 && str.charAt(i) <= 122) {
        int up = str.charAt(i) -32;
        String upp = Character.toString(up);
        fin += upp;
      } else {
        fin += str.charAt(i);
      }
    }
    return fin;
  }
}
