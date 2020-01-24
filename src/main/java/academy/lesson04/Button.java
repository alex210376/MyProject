package academy.lesson04;

public class Button {
   private String text;
   String color;
   private int height;

   public Button(String text){
       this.text=text;
   }

    public Button(String text, String color, int height) {
        this.text = text;
        this.color = color;
        this.height = height;
    }

    void setHeight(int value){
       if(value>0)
       height = value;
   }
   int getHeight(){
       return height;
   }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
