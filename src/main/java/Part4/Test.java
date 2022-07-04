package Part4;

public class Test {
    public static void main(String[] args) {
        Phone pixel = new Phone();
        Phone iphone = new Phone();
        Phone xiaomi = new Phone();
        pixel.setNumber(502222222);
        pixel.setModel("Pixel 4Pro");
        pixel.setWeight(0.32);
        pixel.name = "Igoooor";
        iphone.setNumber(934444444);
        iphone.setModel("Iphone X");
        iphone.setWeight(0.22);
        iphone.name = "Anatoliy";
        xiaomi.setNumber(683333333);
        xiaomi.setModel("Xiaomi Mi 8");
        xiaomi.setWeight(0.33);
        xiaomi.name = "Arkadiy";
        System.out.println(pixel.getNumber() + " " + pixel.getModel() + " " + pixel.getWeight());
        System.out.println(iphone.getNumber() + " " + iphone.getModel() + " " + iphone.getWeight());
        System.out.println(xiaomi.getNumber() + " " + xiaomi.getModel() + " " + xiaomi.getWeight());

        pixel.receiveCall();
        iphone.receiveCall();
        xiaomi.receiveCall();


    }

}
