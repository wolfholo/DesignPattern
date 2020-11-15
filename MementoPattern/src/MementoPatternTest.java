
import MessageBoard.*;
import java.util.Scanner;

public class MementoPatternTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        String str;
        String mes;
        var n = 0;
        boolean flag = true;
        System.out.println("这里是动物留言板!\n输入1进行留言\n输入2查看留言\n输入Q退出");
        while (flag) {
            System.out.println("选择指令:");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    System.out.println("留言内容:");
                    sc = new Scanner(System.in);
                    mes = sc.nextLine();
                    originator.setState(mes);
                    careTaker.add(originator.saveStateToMemento());
                    n++;
                }break;
                case "2": {
                    if(n==0) {
                        System.out.println("留言板为空!写下留言吧!");
                    }
                    else{
                        for(var i = 0;i < n;i++){
                            originator.getStateFromMemento(careTaker.get(i));
                            System.out.println(originator.getState());
                        }
                    }
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