public class GenericPrinter<T extends Material> { // T 타입은 Material 추상화 클래스를 상속받은 타입이어야 한다. (T 타입의 제한)
    // 멤버 변수
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
