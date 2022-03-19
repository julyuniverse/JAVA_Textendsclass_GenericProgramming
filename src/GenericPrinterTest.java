public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter plasticPrinter = new GenericPrinter<>(); // GenericPrinter 타입을 명시하지 않을 수도 있다. 하지만 밑에 코드에서 get을 할 때 타입이 Object로 변환되어 있기 때문에 다운 캐스팅을 하고 꺼내야 한다.
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);

        Plastic p2 = (Plastic) plasticPrinter.getMaterial(); // (Plastic): 다운 캐스팅
        System.out.println(p2.toString());
        p2.complete();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(p.toString());
        p.complete();

        /**
         * GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
         *
         * Water 클래스는 Material 클래스를 상속받지 않았기 때문에 GenericPrinter에서 T으로 사용할 수 없다.
         */

        // 결과
        // 재료는 Plastic입니다.
        // 3D 프린트 작업이 끝났습니다.
        // 재료는 Powder입니다.
        // 3D 프린트 작업이 끝났습니다.
    }
}
