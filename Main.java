import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("abe", "sakuma", "iwamoto", "fukazawa", "watanabe", "miyadate");

//        名前を大文字で出力
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

//　　　　"a"で始まる名前を出力　
        names.stream().filter(name -> name.startsWith("a")).forEach(System.out::println);

//        "iwata"がいるか確認
        boolean hasIwata = names.stream().anyMatch(name -> name.equals("iwata"));
        System.out.println(hasIwata);


    }
}
