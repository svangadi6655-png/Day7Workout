import java.util.HashMap;
public class Mobilenumber {
   public static void main(String[] args) {
    HashMap <String,String> hm= new HashMap<>();
    hm.put("alice","3425617976");
    hm.put("bob","657432178");
    hm.put("john","87654321908");
    hm.put("rahul","9878676543");
    hm.put("rani","564327689");
    System.out.println(hm);
    if(hm.containsKey("rahul")) {
            System.out.println("Rahul's Phone Number: " + hm.get("rahul"));
        } 
        else {
            System.out.println("Rahul not found in contacts");
   }
}
}