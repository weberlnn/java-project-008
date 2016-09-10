/**
 * Created by lin on 2016/8/30.
 */
/*除了刚才使用的final,final还可以应用于成员变量来创建已命名常量。如果在类变量名前使用final,它的
值在程序的生命期中间就不能被改变。当然，为变量赋初始值是允许的。例如在第6章中所示的一个名为ErrorMsg
的简单的错误管理类。该类把一个可读字符串映射到一个出错代码。这里，通过添加代表错误的final常量改进了
原来的类。现在，传递给getErrorMsg()的不再是数字2，而是一个已命名的整数常量DISKERR。*/

public class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };
    String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
class FinalD {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.INERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
/*注意在main()中是如何使用final常量的。因为它们是ErrorMsg类的成员，所以必须通过该类的对象访问。
当然，子类也可以继承它们，并且在子类中可以直接访问它们。
对于final常量，许多java程序员习惯使用大写的标识符，正如前所示。但是这不是一条必须遵守的规则。
 */