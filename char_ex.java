//character extraction
public class char_ex {
   public static void main(String[] args) {
       String string="Hello sister good evening";
       char ch[]=new char[4];
       byte b[]=string.getBytes();
       char c[]=string.toCharArray();
       string.getChars(1,3,ch,2);
       System.out.println(string.charAt(3));//charAt()
       System.out.println(ch);//getChars()
       System.out.println(b);//getBytes
       for(char chr : c){
       System.out.println(chr);
       }
   } 
}
