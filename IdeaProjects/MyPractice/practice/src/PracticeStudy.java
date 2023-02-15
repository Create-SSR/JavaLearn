/**
 * @author $Create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */

import java.util.Scanner;

public class PracticeStudy {
    public static void main(String[] args) {
        // 数据类型:byte、short、char、int、double、float、long
        //byte:  占位：8、  字节：1、  范围：-128-127
        byte numByte = 127;
        //short：占位：16、 字节：2、  范围：-32768-32767
        short numShort = 32767;
        //char：占位：16、 字节：2、  范围：0-65535
        char numChar = 65535;
        //int：占位：32、 字节：4、  范围：-2147483648-2147483647
        int numInt = 2147483647;
        //double：占位：64、 字节：8、  范围：-9.223372036854776E18-9.223372036854776E18(无限大)
        double numDouble = 9.223372036854776E18;
        //float：占位：32、 字节：4、  范围：-3.4028234663852886E38-3.4028234663852886E38（无限大）
        float numFloat = 3.4028234663852886E38f;
        //long：占位：64、 字节：8、  范围：-9223372036854775808~9223372036854775807
        long numLong = 9223372036854775807L;

        System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numChar);
        System.out.println(numInt);
        System.out.println(numDouble);
        System.out.println(numFloat);
        System.out.println(numLong);

        //数据转换
        //强制类型转换: 格式：(type)value， type是要强制类型转换后的数据类型
        int numZ = (int) numLong;
        System.out.println(numZ);

        //运算符
        //算术运算符：+，-，*，/，%，++，--
        /*int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - c;
        int e = a * b;
        int f = b / a;
        int g = a % b;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);*/

        //关系运算符：> , < , >= , <=  ，== , != ， boolean
        /*
        1,逻辑运算符：
            &（且）、｜（或）、!(非)、^(异或)、&&(短路与)、||(短路或)
        2，赋值运算符
            = , += , -= , *= , /= , %=
        */

        //三目运算符
        //格式：（关系表达式）？表达式1：表达式2；
        // 如果关系表达式的结果为true，运算后的结果是表达式1；如果关系表达式的结果为false，运算后的结果是表达式2；
        int a = 10;
        int b = 20;
        int c = (a > b) ? a : b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //面试题
        int i = 23;
        double j = 78.0;
        int k = (int) ((i > j) ? i : j);
        // double k = (i>j)?i:j;
        System.out.println(k);

        //if语句

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        if (c != i) {
            if (i < j) {
                int d = i - c;
                System.out.println(d);
            } else if (i > j) {
                double f = j - i;
                System.out.println(f);
            }
        }

        //switch...case结构语句
        //实例：输入年月日求是这一年的第几天
        int sumDays = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入天数：");
        int day = scan.nextInt();
        switch (month){
            case 12:
                sumDays += 31;
            case 11:
                sumDays += 30;
            case 10:
                sumDays += 31;
            case 9:
                sumDays += 30;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 31;
            case 6:
                sumDays += 30;
            case 5:
                sumDays += 31;
            case 4:
                sumDays += 30;
            case 3:
                if ((year % 4 == 0 && year % 1 != 0) || (year % 400 != 0)) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;

            default:{
                System.out.println("请输入正确的月份或者天数");
            }
        }
        System.out.println(year +"年"+month +"月"+day +"天是这一年的第"+sumDays +"天");
    }
}


