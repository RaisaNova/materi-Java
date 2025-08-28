package inheritance;

public class main {

    public static void main(String[] args) {
        enemy musuh1 = new pocong();
        enemy musuh2 = new zombie();
        enemy musuh3 = new burung();

        System.out.println("mencoba inheritance");

        musuh1.attack();
        ((pocong) musuh1).jump();
        musuh2.attack();
        ((zombie) musuh2).walk();
        musuh3.attack();
        ((burung) musuh3).fly();

    }
}
