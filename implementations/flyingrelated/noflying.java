package implementations.flyingrelated;
import interfaces.flyinginterface;
public class noflying  implements flyinginterface{
    @Override
    public void fly(){
         System.out.println("i cant  fly");
    }
}
