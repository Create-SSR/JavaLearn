/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.27
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day011 {
    public static void main(String[] args){
        /*
            面向对象：
                对于C语言而言，是完全面向过程
                对于C++语言，一半面向过程，一半面向对象
                对于java语言，是完全面向对象的
            面向过程的开发方式：
                主要特点：实现功能的步骤
                    第一步干什么...第二步干什么...第三步干什么...
                    另外注重实现功能的因果关系
                    因为a所以b；因为b所以c；因为c所以d
            面向对象的开发方式：
                    更符合人类的思维方式；就是将现实世界分割成不同的单元，然后各个单元都是实现成对象，驱动一下，让各个对象之间协作起来
                形成一个系统；
                    采用面向对象的开发方式，耦合度低，拓展型强
            OOA：面向对象分析 Object-Oriented Analysis
            OOD：面向对象设计 Object-Oriented Design
            OOP：面向对象编程 Object-Oriented Programming

            面向对象三大特征：
               封装
               继承
               多态

            类和对象的概念
                类：
                    实际上在现实世界当中不存在，是一个抽象的概念，一个模版，是我们人类大脑中进行思考、总结、抽象的一个结果
                抽象：多个对象具有共同特征，进行思考总结抽取共同特征的过程
                对象：（实例） 实际当中存在的个体
                实例化：通过类创建对象的过程
                    例如：明星是一个类，刘德华是一个对象，属于"明星"这个类
                    在Java中，类是 一个模版：类中描述的是所有对象的共同特征信息
                            对象是通过类创造出的个体
                类---实例化--->对象---抽象--->类
                共同特征： 类 = 属性 + 方法
                    状态特征---->属性
                    动作特征---->方法

                类的定义：
                    [修饰符列表] class 类名{
                        //类体 = 属性+ 方法
                        //属性在代码上是以"变量"的形式存在  属性对应的是数据，数据只能放到变量中
                        //方法用来描述动作/行为
                    }
                    变量：
                        方法体内声明的变量：局部变量
                        方法体外声明的变量：成员变量（ 属性 ）
                        实例变量：对象又被称为实例；实例变量实际上就是 对象级别的变量
                                不能通过类名直接去访问"实例变量"

                    对于成员变量，没有手动赋值时，系统会默认赋值
                        类型        默认值
                        byte         0
                        short        0
                        int          0
                        long         0L
                        float        0.0F
                        double       o.o
                        boolean      false
                        char         \u0000
                        String       null
                    null是Java关键字，全部小写，表示空，是引用数据类型的默认值


         */
        /*
            创建对象的语法：
                语法格式： 类名 变量名 = new 类名（）；
                new 类名（）；new是运算符，负责对象的创建
                new student();就是一个对象

                重点： 凡事通过new运算符创建的对象，都存储在堆内存中。
                        new的作用就是在堆内存中开辟一块空间

                        方法调用，该方法在栈中分配内存，栈中主要存储局部变量
                        局部变量存储在栈中，对象 和 对象的实例变量 存储在堆内存中

                student      s1   = new student();
                引用数据类型    变量名        对象
                        s1保存了这个对象的内存地址，叫做引用

                实例变量的引用：
                    语法：变量名.实例变量名
                    赋值：变量名.实例变量名 = 值；

                 对象和引用的区别
                    对象是
                *** java中所有的类都是引用数据类型： String
         */
        //一个类可以创建多个实例化对象
        student student1 = new student();
        System.out.println(student1.name);
        student student2 = new student();
        student student3 = new student();




    }

}
class student{
    //学号
    int xuehao;
    //姓名
    String name;
    //年龄
    int age;
    //性别
    boolean sex;
    //住址
    String address;


}