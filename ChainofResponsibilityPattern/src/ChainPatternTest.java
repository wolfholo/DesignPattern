
import ChainofResponsibilityPattern.*;
import java.util.Scanner;

public class ChainPatternTest {

    private static AbstractMatch getChainOfMatch(){

        AbstractMatch runMatch = new RunMatch();
        AbstractMatch swimMatch = new SwimMatch();
        AbstractMatch flyMatch = new FlyMatch();

        runMatch.setNextMatch(swimMatch);
        swimMatch.setNextMatch(flyMatch);

        return runMatch;
    }



    public static void main(String[] args) {

        String str;        boolean flag = true;
        System.out.println("这里可以查询动物能参加的比赛类型!\n输入1查看狗子\n输入2查看小鸟\n输入3查看金鱼\n输入Q退出");
        while (flag) {
            System.out.println("选择指令:");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    System.out.println("查询狗子!");
                    AnimalSkills.skill(true,true,false);
                    AbstractMatch matchChain = getChainOfMatch();
                    matchChain.matchMessage();
                }break;
                case "2": {
                    System.out.println("查询小鸟!");
                    AnimalSkills.skill(true,false,true);
                    AbstractMatch matchChain = getChainOfMatch();
                    matchChain.matchMessage();
                }break;
                case "3": {
                    System.out.println("查询金鱼!");
                    AnimalSkills.skill(false,true,false);
                    AbstractMatch matchChain = getChainOfMatch();
                    matchChain.matchMessage();
                }break;
                case "Q":
                case "q": {
                    flag = false;
                }break;
                default:{
                    System.out.println("指令不存在,输入正确指令!");
                }break;
            }
        }
    }
}
