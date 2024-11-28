package lesson_two.hw.taskOne;

public class Rectangle {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    float calculateArea() {
        return width * height;
    }

    float calculatePerimeter() {
        return (width + height) * 2;
    }
}
