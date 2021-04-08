package dio.isBlank;

public class ClassIsBlank {
    public static void main(String[] args) {

        //forma defasada
        String  espaco = "                             ";
        System.out.println(isBlank(espaco));

        //forma nova
        System.out.println(espaco.isBlank());
    }

    //formadefasada
    private static boolean isBlank(String espaco){

        return espaco == null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ');
    }
}
