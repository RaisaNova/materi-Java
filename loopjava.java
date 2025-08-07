public class loopjava {
    public static void main(String[] args) {
        int menabung = 0;
        for (int i = 1; i <= 30; i++) {
            menabung += 1000;
            System.out.println("Menabung hari ke-" + i + " sejumlah " + menabung);
        }

    }
}
