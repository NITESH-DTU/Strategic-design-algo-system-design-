import implementations.flyingrelated.flying;
import implementations.talkrelated.notalking;
import implementations.walkrelated.walking;
import interfaces.Talkhinginterface;
import interfaces.flyinginterface;
import interfaces.walkinginterface;

public class Robot {
    private  flyinginterface fly;
    private  walkinginterface wal;
    private  Talkhinginterface tal;
   
    Robot(flyinginterface f,walkinginterface w,Talkhinginterface th){
        this.fly=f;
        this.wal=w;
        this.tal=th;
    }
    void walk(){
        wal.walk();
    }
    void talk(){
        tal.talk();
    }
    void fly(){
        fly.fly();
    }
}
