package Strategy;

public class AgressiveBehavior implements RobotBehavior {
    public int moveCommand(){
        return 1;
            }
            public String toString(){
                return"Agressive Behavior" + " if find another robot attack it";
            }
}
