package second;

import java.util.Scanner;

/**
 * @Describe 年龄比率
 * (Mac IDEA 快捷键：先new Scanner,Command + Option + V,快速抽取变量)
 * (Mac IDEA 快捷键：fori,快速for循环)
 */
public class AgeRate {

    public static void main(String[] args) {

        //定义Scanner对象
        Scanner scanner = new Scanner(System.in);
        //存储大于30岁的人数
        int ageUp = 0;
        //存储小于30岁的人数
        int ageDown = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+i+"位顾客的年龄：");
            int age = scanner.nextInt();
            if (age > 30) {
                ageUp++;
            } else {
                ageDown++;
            }
        }

        System.out.println("超过30岁的人数比率是："+(ageUp/10.0*100)+"%");
        System.out.println("小于30岁的人数比率是："+(ageDown/10.0*100)+"%");

    }

}
