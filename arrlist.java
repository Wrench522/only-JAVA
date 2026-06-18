import java.util.ArrayList;
public class arrlist {
    public static void main(String[]args){

   
    ArrayList<String>name=new ArrayList<>();

    name.add("john");
    name.add("KIm");
    name.add("Mary");
    name.add("Taiku");

    System.out.println(name.get(3));
    System.out.println(" ");

    name.remove(1);

     for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
}


}
