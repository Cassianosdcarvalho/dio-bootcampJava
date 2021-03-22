package dio.data;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ClassDate {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat formatarData = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss:mmm");
        SimpleDateFormat formatarData2 = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:MMM");
        String dataFormatada = formatarData.format(date);
        String dataFormatada2 = formatarData2.format(date);
        System.out.println(dataFormatada);
        System.out.println(dataFormatada2);
    }
}
