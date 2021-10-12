package chapter12;

// Fruit 과 Eatable 을 상속받은 형만 입력 가능하며 Box<T>를 상속받는다
public class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}
