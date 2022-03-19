public abstract class Material { // 추상화 클래스 선언
    public abstract void doPrinting(); // 추상화 메서드 선언
    public void complete() {
        System.out.println("3D 프린트 작업이 끝났습니다.");
    }
}
