
public class Workshop01 {

    public static void main(String[] args) {
        int a, b, c = 0;
        a = c++; 
        b = ++a;
        c++;
        b = ++c + a++;
        a = --b + c++;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
       
    }

}
