package Day014;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day014 {
    public static void main(String[] args){
        /*
            类体{
                实例变量；
                实例方法；

                静态变量；
                静态方法；

                构造方法；

                局部变量

                静态代码块；
                实例语句块；
            }

            继承：extend
                作用：代码复用   ——---》方法覆盖和多态机制
                特性：
                    1，B类继承A类，
                        A类称为超类（父类，基类）
                        B类称为子类（派生类，扩展类）
                    2，java中的继承只支持单继承，不支持多继承，C++中支持多继承，
                        Java中不支持这样写：class B extends A ,C
                    3,java中，规定：子类继承父类，除构造方法不能继承之外，其他都可以继承。但是私有的属性无法在子类中直接访问。
                    4，java中的类没有显示的继承任何类，默认继承object类，object类是java中的根类，
                        object类是所有类的超类，
                    5，缺点：代码耦合度高，父类修改，子类受影响
             方法重载  overload
                当同一个类中，功能相似，可以将方法名称定义的一样
                    条件：在同一个类中、方法名相同、参数列表不同（个数、类型、顺序）
             方法覆盖：方法重写    Override
                结论：当子类对父类继承过来的方法重写之后，相当于将父类的方法覆盖了，调用该方法的时候，执行子类中的方法
                条件：
                    1，两个类有继承关系
                    2，重写之后的方法和从父类中继承的方法：
                            相同的返回值类型
                            相同的方法名
                            相同的形式参数列表
                    3，访问权限不能更低，可以更高
                    4，重写之后的方法不能比之前的方法抛出更多的异常，可以更少
                注意：
                    1，方法覆盖只是针对方法，和属性无关
                    2，私有方法无法覆盖
                    3，构造方法不能被继承，所以也不能覆盖
                    4，方法覆盖只是针对实例方法，静态方法覆盖无意义

                多态：父类型引用指向子类型对象，
                    包括编译阶段和运行阶段
                    编译阶段，静态绑定父类方法
                    运行阶段，动态绑定子类型对象的方法

                    向上转型：子类指向父类   （类似自动类型转换）
                    向下转型  父类指向子类  （类似强制类型转换，需要有强制类型转换符）
                        语法：
                            子类名 变量名 = （子类名）父类变量名；
                        有风险：
                            报错：java.lang.ClassCastException  类型转换异常
                            解决方案：
                            运算符： instanceof
                                1，instanceof可以在运行阶段动态判断引用指向对象的类型
                                2，语法： （引用 instanceof 类型）
                                3，运算结果只能是true或者false
                                4，引用（即变量名）
                    注意：
                        1，java中允许向上转型和向下转型
                        2，无论是向上转型还是向下转型，两个类之间必须有继承关系
                  多态在开发中的作用
                    降低程序的耦合度，提高程序的扩展力

                    开发原则：OCP（对扩展开放，对修改闭合）

use-a:依赖关系
new Data() = 构造器---构造一个新对象
        ps.setBoolean("isClosed",new Boolean(true));
        ps.setBoolean("isClosed",new Boolean(true));
        ps.setBoolean("isClosed",new Boolean(true));
        ps.setBoolean("isClosed",new Boolean(true));
        ps.setBoolean("isClosed",new Boolean(true));
        ps.setBoolean("isClosed",new Boolean(true));


         */
    }
}
