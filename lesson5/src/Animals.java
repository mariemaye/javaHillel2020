public class Animals {
private int id;
private int age;
private float weight;
private String color;

public Animals(int id, int age, float weight, String color){
    this.id = id;
    this.age = age;
    this.weight = weight;
    this.color = color;

}





    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
