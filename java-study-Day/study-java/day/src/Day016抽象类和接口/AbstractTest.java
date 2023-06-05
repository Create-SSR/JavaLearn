package Day016抽象类和接口;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class AbstractTest {
    public static void main(String[] args){
        /*
            接口：interface
                基础语法：
                    1,接口是一种引用数据类型
                    2，接口是完全抽象的，（抽象类是半抽象的），接口是特殊的抽象类
                    3，接口的定义：
                        修饰符列表 interface 接口名{}
                    4，接口支持多继承，一个接口可以继承多个接口
                    5，接口中只包含两部分：常量、抽象方法
                    6，接口中所有的元素都是public修饰，
                    7，接口中的抽象方法定义时，public abstract 关键字可以省略，
                    8，接口中的方法不能有方法体，不能加大括号，只能以；结尾
                    9，接口中的常量定义时，关键字可以省略；public static final

                接口在开发中的作用：
                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






         */
    }
}
//定义接口
interface A{

}
//接口可以被继承
interface B extends A{

}
//接口支持多继承
interface C extends A,B{

}

