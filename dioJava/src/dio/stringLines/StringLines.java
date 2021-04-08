package dio.stringLines;

import java.util.stream.Collectors;

public class StringLines {
    public static void main(String[] args) {
        String html = "<html>\n<head>\n<body>\n<body>\n<head>\n<html>";


        System.out.println(html);
        System.out.println(html.lines().map(linha -> "[TAG]:: "+linha).collect(Collectors.toList()));



    }


}
