package academy.lesson06.HW_L06;

public class CheckBox extends Button {
    private int sizeC;

    public CheckBox(String name, String color, int sizeA, int sizeB, int sizeC) {
        super(name, color, sizeA, sizeB);
        this.sizeC = sizeC;
    }
    @Override
    public void draw() {
        System.out.println("Это расширенная кнопка");
        System.out.println("Название компонета: "+this.getName()+","+
                " Цвет компонента: "+ this.getColor()+","+
                " Размер А: "+ this.getSizeA()+","+
                " Размер B: "+ this.getSizeB()+","+
                " Размер B: "+ sizeC);
        System.out.println();
    }

    @Override
    public String toString() {
        return "CheckBox {" +
                "name=" + this.getName() + '\''+
                ", color='" + getColor() + '\''+
                ", sizeA=" + getSizeA() +
                ", sizeB=" + getSizeB() +
                ", sizeC=" + sizeC +
                '}';
    }
}
