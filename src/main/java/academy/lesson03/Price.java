package academy.lesson03;

public class Price {
    public static void main(String[] args){
        String priceRaw = "4 418грн";
        System.out.println(priceRaw);
        int price;

        System.out.println(priceRaw.replaceAll(" ", "").replaceAll("грн", ""));


    }


}
