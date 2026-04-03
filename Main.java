import implementations.flyingrelated.flying;
import implementations.talkrelated.notalking;
import implementations.walkrelated.walking;

public class Main {
     public static void main(String[] args) {
        Robot r=new Robot(new flying(),new walking(),new notalking());
        r.walk();
        r.talk();
        r.fly();
      
    }
    
}
