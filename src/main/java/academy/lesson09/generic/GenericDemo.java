package academy.lesson09.generic;

public class GenericDemo {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setValue1("Hello!");
        pair.setValue2(123);

        String str = (String)pair.getValue1();
        int n = (int)pair.getValue2();

        PairGen<String, Integer> pairGen = new PairGen<>();
        pairGen.setValue1("Congratulation!");
        pairGen.setValue2(18);

        str = pairGen.getValue1();
        n = pairGen.getValue2();

        System.out.println("str: "+str+" n: "+n);

        PairGen<String, String> pairGen2 = new PairGen<>();
        pairGen2.setValue1("Congratulation!");
        pairGen2.setValue2("18");

        PairGenExt<String, Integer> pairGen3 = new PairGenExt<>();
        PairGenExt<String, Number> pairGen4 = new PairGenExt<>();

        PairGen<String, Number> pairGen5 = new PairGen<>();
        print(pairGen);
        print(pairGen2);
        print3(pairGen5);
    }

    private static void print (PairGen<?,?> pair) {
        System.out.println(pair);
    }
    private static void print2 (PairGen<?,? extends Number> pair) {
        System.out.println(pair);
    }
    private static void print3 (PairGen<?,? super Number> pair) { // допускаются типы родители Number и сам Number
        System.out.println(pair);
    }

}
