public class Main {
    public static void main(String[] args) {
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] find = {'b', 'c', 'd'};
        char[] replace = {'0', '1', '2','3'};

        var result = new CharArrayReplacement(source, find, replace).replaceSequence();

        System.out.println(result);
    }
}