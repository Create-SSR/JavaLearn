package Day016抽象类和接口;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */

public class Day016 {
    public static void main(String[] args) {
        /*
    一、抽象类：
        1，(abstrack)概念：
            理解： 抽象类无法实例化，无法创建对象
                  抽象类是类和类之间具有共同特征抽象成的，

        2，类型：
            抽象类属于引用数据类型。

        3，定义：
            语法：
                [修饰符列表] abstract class 类名{
                    类体
                }
        4,抽象类无法实例化，抽象类是用来被继承的

        5，final 和 abstract 不能同时使用，两个关键字互相对立
            //错误，非法的修饰符组合

        6,抽象类中没法实例化，但是有构造方法，以供子类初始化实例化对象
        
        7，抽象类关联到抽象方法，
            抽象方法表示没有实现的方法，没有方法体的方法
                public abstract void 方法名（）;

            特点：
                1，没有方法体，以分号结尾
                2，前面修饰符中有abstract关键字

        8，抽象类中不一定有抽象方法，但抽象方法一定是在抽象类中；

        9，重要结论：*****
                非抽象类继承了抽象类后，必须将抽象类中的方法实现（覆盖/重写）；

                抽象类继承抽象类时，不需要将继承的抽象方法实现


        总结：
            1，抽象类定义：在class前加abstract关键字
            2，final和abstract不能同时使用
            3，抽象类无法实例化，只能被继承
            4，抽象类的子类可以是抽象类，也可以是非抽象类
            5，抽象类无法实例化，但是有构造方法，用来供子类使用
            6，抽象类中不一定有抽象方法，但抽象方法一定是在抽象类中存在
            7，抽象方法定义：public abstract void 方法名（）；
            8，非抽象类继承抽象类，必须将抽象类中的方法实现（覆盖/重写）

        面试题：
            Java中凡是没有方法体的都是抽象方法；错误
                object类中很多方法都没有方法体；没有大括号，以；结尾

    二、接口：
        基础语法：


 */

        //多态：父类型引用指向子类型对象
        Account a = new CreditAccount(); //面向抽象编程，Account是抽象的，
        //面向抽象编程，不是面向具体编程，降低程序的耦合度，提高程序的拓展力
        a.update(); //update方法编译时是Account类的，运行的时候是CreditAccount类的


    }
}

//定义一个抽象类
abstract class Account{
    public abstract void update();

}
//抽象类的子类可以是抽象类
abstract class Card extends Account{

}
//定义一个类继承抽象类
class CreditAccount extends Account{
    public void update(){
        System.out.println("实现抽象方法");
    }
}
