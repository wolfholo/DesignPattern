package ChainofResponsibilityPattern;

public class SwimMatch extends AbstractMatch {

    public SwimMatch(){
        this.match = AnimalSkills.s;
    }

    @Override
    protected void write() {
        System.out.println("可以参加游泳比赛!");
    }
}