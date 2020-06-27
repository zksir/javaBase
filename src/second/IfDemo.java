package second;

import java.util.Scanner;

/**
 * @Describe 分支结构
 * (Mac IDEA 快捷键：Surround With Code，Command + Option + T 包围代码(使用if,else,try,catch的等))
 * (Mac IDEA 快捷键：先new Scanner,Command + Option + V,快速抽取变量)
 */
public class IfDemo {

    public static void main(String[] args) {
//        // 例1：单分支判断,Math.random()产生数据的范围是[0,1)
//        int i = (int)(Math.random()*6);//得到0-5之间的随机数
//        if (i >3 ) {
//            System.out.println("值大于3");
//        }
//        System.out.println("number:"+i);

//        // 例2：单分支判断
//        double i = 6 * Math.random();
//        double j = 6 * Math.random();
//        double k = 6 * Math.random();
//        int count = (int)(i + j + k);
//        if (count > 15) {
//            System.out.println("值大于15");
//        }
//        if (count >= 10 && count <= 15) {//错误写法：10<count<15
//            System.out.println("大于10小于15");
//        }
//        if (count < 10) {
//            System.out.println("小于10");
//        }
//        System.out.println("count值：" + count);

//        // 双分支结构
//        // 例3：
//        int r = 1;
//        double PI = 3.14;
//        double area = PI * r * r;
//        double length = 2 * PI * r;
//        if (area >= length) {
//            System.out.println("面积大于等于周长");
//        } else {
//            System.out.println("周长大于面积");
//        }

//        //例4：Scanner
//        //创建文件扫描器对象，System.in表示的是标准输入，可以从控制台读取数据(装饰者模式)
//        //注意:每次读取回来的值都是字符串类型，需要进行类型转换
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数据");
//        String str = sc.nextLine();
//        System.out.println(str);

//        // 例5：多分支结构
//        int age = (int)(Math.random()*100);
//        if(age<10){
//            System.out.println("儿童");
//        }else if(age<20){
//            System.out.println("少年");
//        }else if(age<30){
//            System.out.println("青年");
//        }else if(age<50){
//            System.out.println("中年");
//        }else if(age<70){
//            System.out.println("老年");
//        }else{
//            System.out.println("耄耋");
//        }

//        // 例6：嵌套分支结构
//        int time = (int)(Math.random()*40);
//        if(time<20){
//            System.out.println("恭喜进入决赛");
//            String sex = ((int)(Math.random()*2))==0?"girl":"boy";
//            if(sex=="girl"){
//                System.out.println("欢迎进入女子组");
//            }else{
//                System.out.println("欢迎进入男子组");
//            }
//        }else{
//            System.out.println("成绩太差，被淘汰");
//        }

        // 例6：switch多分支结构
        /*注意：
			1、每个case模块中要添加break，防止多次匹配
			2、如果多个case中处理的逻辑代码块的功能一致，可以考虑只在最后添加一次处理
			3、default表示默认选项，当所有的case不匹配的时候，会执行此选项
			4、defult可以有，也可以没有
		*/
        int random = (int)(Math.random()*26);
        char ch = (char)('a'+random);
        switch(ch){
			/*
			case 'a':
			System.out.println("元音："+ch);
			break;
			case 'e':
			System.out.println("元音："+ch);
			break;
			case 'i':
			System.out.println("元音："+ch);
			break;
			case 'o':
			System.out.println("元音："+ch);
			break;
			case 'u':
			System.out.println("元音："+ch);
			break;
			case 'y':
			System.out.println("半元音："+ch);
			break;
			case 'w':
			System.out.println("半元音："+ch);
			break;
			default:
			System.out.println("辅音："+ch);*/
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音："+ch);
                break;
            case 'y':
            case 'w':
                System.out.println("半元音："+ch);
                break;
            default:
                System.out.println("辅音："+ch);
        }

    }
}
