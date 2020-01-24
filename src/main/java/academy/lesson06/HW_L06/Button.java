package academy.lesson06.HW_L06;

public class Button extends Component {
    private int sizeA;
    private int sizeB;

    public Button(String name, String color, int sizeA, int sizeB) {
        super(name, color);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    public int getSizeA() {
        return sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

   @Override
    public void draw() {
        System.out.println("Это кнопка");
        System.out.println("Название компонета: "+this.getName()+","+
                " Цвет компонента: "+ this.getColor()+","+
                " Размер А: "+ sizeA+","+
                " Размер B: "+ sizeB);
       System.out.println();
    }

    @Override
    public String toString() {
        return "Button {" +
                "name=" + this.getName() + '\''+
                ", color='" + getColor() + '\''+
                ", sizeA=" + sizeA +
                ", sizeB=" + sizeB +
                '}';
    }
}
