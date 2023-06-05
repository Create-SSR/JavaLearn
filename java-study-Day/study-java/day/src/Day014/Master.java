package Day014;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Master {
    public static void main(String[] args){
        Master m = new Master();
        Pet p = new Dog();
        p = new Dog();
        m.feet(p);
        Pet p1 = new Cat();
        p1 = new Cat();
        m.feet(p1);
    }
    public void feet(Pet pet){
        pet.eat();
    }
}
class Pet{

    public void eat(){
        System.out.println("宠物在吃东西");
    }
}
class Dog extends Pet{
    public void eat(){
        System.out.println("小狗在吃骨头");
    }
}
class Cat extends Pet{
    public void eat(){
        System.out.println("小猫在吃鱼");
    }
}