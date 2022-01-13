import java.util.ArrayList;
import java.util.Properties;

class javaInfo{
    public static void main(String[] args) {
    ArrayList<Properties> arrayList=new ArrayList<>();
    arrayList.add(System.getProperties());
        for (Properties string : arrayList) {
            System.out.println(string);
        }
    }
}