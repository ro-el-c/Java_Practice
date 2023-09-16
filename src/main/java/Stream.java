import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바", "정경은", "람다식");

        // 순차 처리
        list.stream()
                .forEach(Stream::print);
        System.out.println();

        // 병령 처리
        list.parallelStream()
                .forEach(Stream::print);
    }

    public static void print(String str) {
        System.out.println(str + ": " + Thread.currentThread().getName());
    }
}
