package Day014;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class PracticeTest {
    public static void main(String[] args){
        Musicians m = new Musicians();
        Instrument i = new Instrument();
        Erhu e = new Erhu();
        m.playInstrument(e);
        Piano p = new Piano();
        m.playInstrument(p);
        Violin v = new Violin();
        m.playInstrument(v);

    }
}
class Musicians{
    public void playInstrument(Instrument instrument){
        instrument.makeSound();
    }
}
class Instrument{
    public void makeSound(){
        System.out.println("拨动乐器发出声音");
    }
}
class Erhu extends Instrument{
    public void makeSound(){
        System.out.println("拉动二胡弹奏二泉吟月");
    }
}
class Piano extends Instrument{
    public void makeSound(){
        System.out.println("弹奏钢琴演奏命运交响曲");
    }
}
class Violin extends Instrument{
    public void makeSound(){
        System.out.println("拉小提琴弹奏给爱丽丝");
    }
}