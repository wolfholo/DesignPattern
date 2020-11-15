package ChainofResponsibilityPattern;

public class RunMatch extends AbstractMatch {

    public RunMatch(){
        this.match = AnimalSkills.r;
    }

    @Override
    protected void write() {
        System.out.println("可以参加跑步比赛!");
    }
}