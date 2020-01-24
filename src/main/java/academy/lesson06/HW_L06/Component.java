package academy.lesson06.HW_L06;

public class Component {
    private String name;
    private String color;

    public Component(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void draw(){
        System.out.println("Графический компонет "+name);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Component {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
