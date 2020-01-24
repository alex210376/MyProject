package academy.lesson04;

public class ButtonDemo {
    public static void main(String args[]){
        Button button1 = new Button("Login");
        Button button2 = new Button("Login", "red", 5);
        button1.color = "RED";
        button1.setHeight (25);
        button1.setHeight (-100);
        System.out.println(button1.getText());
        System.out.println(button1.getHeight());
        System.out.println(button2.getText());
        System.out.println(button2.getHeight());
    }
}
