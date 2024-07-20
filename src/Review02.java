
public class Review02 {
    public static void main(String[] args) {
     // 1から100までの整数をループ
        for (int i = 1; i <= 100; i++) {
            // 3で割り切れ、かつ5でも割り切れる場合 "FizzBuzz" と表示
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // 3で割り切れる場合 "Fizz" と表示
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // 5で割り切れる場合 "Buzz" と表示
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // それ以外の数はそのまま表示
            else {
                System.out.println(i);
            }
        }
    }
}