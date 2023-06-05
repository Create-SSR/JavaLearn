package Day15super;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day015 {
    public static void main(String[] args){
        /*
        super和this

        this
            this能出现在构造方法和实例方法中；
            this的语法：this.    this()
            this不能出现在静态方法中
            this大部分情况下可以省略
            this在区分局部变量和实例变量时不能省略
                public void setName(String name){
                    this.name = name;
                }
            this(）只能出现在构造方法第一行，通过当前的构造方法去调用本类中的其他构造方法，目的：代码复用
            this可以单独使用
            super不是引用，不保存内存地址，不指向任何对象
            super只能代表当前对象内部的那一块父类型特征

            this和super不能使用在static静态方法中，只能用在实例方法


        super
            super能出现在构造方法和实例方法中；
            super 的语法：super.    super()
            super不能出现在静态方法中
            super大部分情况下可以省略
            super不能省略的情况：
                如果父类和子类中存在同名属性，在子类中访问父类的属性时，不能省略super.

            super只能出现在构造方法中第一行，通过当前的构造方法调用父类的构造方法，目的:创建子类的对象时，先出初始化父类的特征
            super（）
                表示通过子类的构造方法调用父类的构造方法

            当一个构造方法的第一行，既没有this（），又没有super（）时，默认会有一个super（）
            表示通过子类的无参构造方法调用父类的无参构造方法
            所以必须保证父类的无参构造方法时存在的

            this()和super（）不能共存，它们只能出现在构造方法的第一行

            无论怎么样，父类的构造方法一定会执行

            一个类的无参构造方法要手动写出来，没有的话，会影响子类的对象构建

            super()使用
                父类的私有属性子类无法直接访问，可以使用super()调用父类的有参构造方法
                作用：初始化当前类中对象的父类型特征

                super.属性名
                super.方法名（实参）
                super（实参）




         */
        new B();
    }
}
class A{
    /*
    //一个类中如果没有手动提供任何构造方法，系统会默认提供一个无参的构造方法。
    //一个类中如果手动构造方法，那么无参构造系统将不再提供
     */

    public A(){
        System.out.println("A类的无参构造方法");
    }
    public A(int i){
        System.out.println("A类的有参构造方法");
    }

}
class B extends A{
    public B(){
        super(123);
        System.out.println("B类的无参构造方法");
    }
}
