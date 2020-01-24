package academy.lesson06.HW_L06;

public class Label extends Component {
    private int numberOfLines;
    private int numberOfSymbol;

    public Label(String name, String color, int numberOfLines, int numberOfSymbol) {
        super(name, color);
        this.numberOfLines = numberOfLines;
        this.numberOfSymbol = numberOfSymbol;
    }

    @Override
    public void draw() {
        System.out.println("Это метка");
        System.out.println("Название компонета: "+this.getName()+"," +
                " Цвет компонента: "+ this.getColor()+","+
                " Количество строк: "+ numberOfLines+","+
                " Количество символов: "+ numberOfSymbol);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Label {" +
                "name=" + this.getName() + '\''+
                ", color='" + getColor() + '\''+
                ", numberOfLines=" + numberOfLines +
                ", numberOfSymbol=" + numberOfSymbol +
                '}';
    }
}
