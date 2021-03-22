package dio.data;

import java.time.LocalDateTime;

public class ClassLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.of(2010,05,15, 10,00,00);
        LocalDateTime futuro = data.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(data);
        System.out.println(futuro);

    }

}
