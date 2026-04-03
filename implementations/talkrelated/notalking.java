package implementations.talkrelated;
import interfaces.Talkhinginterface;
public class notalking implements Talkhinginterface{
    @Override
    public void talk(){
         System.out.println("i cant  talk");
    }
}
