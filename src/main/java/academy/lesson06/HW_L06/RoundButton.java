package academy.lesson06.HW_L06;

public class RoundButton extends Button {

    private int radius;

    public RoundButton(String name, String color, int sizeA, int sizeB, int radius) {
        super(name, color, sizeA, sizeB);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Это круглая кнопка");
        System.out.println("Название компонета: "+this.getName()+","+
                " Цвет компонента: "+ this.getColor()+","+
                " Размер А: "+ this.getSizeA()+","+
                " Размер B: "+ this.getSizeB()+","+
                " Размер B: "+ radius);
        System.out.println();
    }

    @Override
    public String toString() {
        return "RoundButton {" +
                "name=" + this.getName() + '\''+
                ", color='" + getColor() + '\''+
                ", sizeA=" + getSizeA() +
                ", sizeB=" + getSizeB() +
                ", radius=" + radius +
                '}';
    }
}
