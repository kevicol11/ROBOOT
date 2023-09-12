package Strategy;

public class DefensiveBehavior implements RobotBehavior {
    public int moveCommand(){
        return -1;
            }
            public String toString(){
                return"Defesive Behavior" + " if find another robot run from it";
            }
}
