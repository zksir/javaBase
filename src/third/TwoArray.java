package third;

/**
 * @Describe 二维数组可以称作数组的数组
 * 定义二维数组的时候一定需要注意，必须要给定数组的长度
 */
public class TwoArray {

    public static void main(String[] args) {

        int[] arr = new int[6];
        int[][] arr2 = new int[3][];
        //创建二维数组的对象
        arr2[0] = new int[5];
        arr2[1] = new int[4];
        arr2[2] = new int[3];
        //赋值
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[0][3] = 4;
        arr2[0][4] = 5;
    }
}
