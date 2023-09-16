import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        // -------- STREAM and PARALLEL-STREAM --------
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바", "김병렬", "람다식");

        // 순차 처리
        list.stream()
                .forEach(Stream::print);
        System.out.println();

        // 병렬 처리
        list.parallelStream()
                .forEach(Stream::print);

        System.out.println();
        System.out.println();

        // -------- 중간/최종 처리 --------
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10L),
                new Student("김병렬", 20L),
                new Student("람다식", 30L)
        );

        double avg = studentList.stream()
                // 중간 처리 (학생 객체를 점수로 매핑)
                .mapToLong(Student::getScore)
                // 최종 처리 (평균 점수)
                .average()
                .getAsDouble();

        System.out.println("평균 점수 = " + avg);
    }

    public static void print(String str) {
        System.out.println(str + ": " + Thread.currentThread().getName());
    }
}
