import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("mr. robot");
        roboto.setBehavior(new AgressiveBehavior());
      
        
        roboto.move();
       System.out.println(roboto.getName());
       roboto.move();
       Robot wally = new Robot ();
       wally.setName("mr wally");
       wally.setBehavior(new DefensiveBehavior());
       System.out.println(wally.getName());
       wally.move();
       
}
}