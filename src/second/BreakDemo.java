package second;

/**
 * @Describe break:跳出本层循环,当包含多层循环的时候，break只能跳出内层循环，无法跳出外层循环
 */
public class BreakDemo {
    public static void main(String[] args) {
        int count = 0;
        while(true){
            int i = (int)(Math.random()*101);

            if(i==88){
                break;
            }
            count++;
            System.out.println(count+"--"+i);
        }
    }
}
