package academy.lesson06.HW_L06;

public class ArrayPolymorph {

      public static void main(String[] args) {
          //Создание массива графических компонентов
          Component[] components = new Component[10];
          components[0] = new Label("Label_1", "Red", 2, 30);
          components[1] = new Button("Button_1", "Black", 10, 20);
          components[2] = new List("List_1", "Blue", 5, 100);
          components[3] = new CheckBox("CheckBox_1", "Red", 10, 10, 10);
          components[4] = new CheckBox("CheckBox_2", "Magenta", 5, 5, 5);
          components[5] = new Label("Label_2", "Green", 10, 300);
          components[6] = new Button("Button_2", "White", 55, 55);
          components[7] = new RoundButton("RoundButton_1", "Black", 10, 20, 2);
          components[8] = new Button("Button_3", "Green", 15, 15);
          components[9] = new RoundButton("RoundButton_2", "White", 10, 20, 3);

          for(int i=0; i<components.length; i++){
              System.out.println(components[i]);
          }

          System.out.println("*****************************");
          for (int i = 0; i < components.length; i++) {
              if(components[i] instanceof Button)
                  System.out.println("Позиция "+i+": "+components[i]);
          }

          System.out.println("*****************************");
          for(int i=0; i<components.length; i++){
              components[i].draw();
          }

        }
}
