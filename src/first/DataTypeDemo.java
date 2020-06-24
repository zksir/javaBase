package first;

/**
 * @Describe Java基本数据类型
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        // 整数类型
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        // 浮点型
//        float f1 = 234.5F;
        double d1 = 123.4D;// 后面可加d也可以不加
        float f1 = 2.1223123234123131F;
        float f2 = 2.122312331231312123F;
        System.out.println(f1==f2);
        // 字符类型
        //表示一个字符
        char a = 'A';
        //表示一个字符串，表示一个字符序列
        String str = "A";
        System.out.println(a==65);
        char ch = '\t';
        System.out.println("["+ch+"]");

    }
}
