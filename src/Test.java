public class Test {
    public static void main(String[] args) {
        Sword <steel> Sword = new Sword <> (new steel());
        boolean isStrong = Sword.checkEndurance();
        System.out.println("Меч из этого металла" + (isStrong ? " прошел" : " не прошел") + " проверку на прочность");
    }
}
