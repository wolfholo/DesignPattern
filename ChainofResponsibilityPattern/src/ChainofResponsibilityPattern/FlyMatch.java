package ChainofResponsibilityPattern;

public class FlyMatch extends AbstractMatch {

    public FlyMatch(){
        this.match = AnimalSkills.f;
    }

    @Override
    protected void write() {
        System.out.println("可以参加飞行比赛!");
    }
}