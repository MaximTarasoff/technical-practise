package lesson_two.hw.taskSix;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Собака лает");
    }
    void fetch(){
        System.out.println("Собака приносит палку");
    }

}
