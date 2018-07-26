
public class WorkingWithStringLoop {

    public static void main() {
        String name = "Somkiat2018";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        /*
         Somkiat2018
         omkiat2018
         mkiat2018
         kiat2018
         iat2018
         at2018
         t2018
         2018
         018
         18
         8
         */
        while (name.length()>0) {      
              System.out.println(name.substring(0, 1));
              name = name.substring(1);
        }
    }
    
    
    
    
    
    
    

}
