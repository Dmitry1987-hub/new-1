//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 20;
        if (age>=18) {
            System.out.println("Ты можешь водить!");
        }
        else {
            System.out.println("Ты не можещь водить");
        }
        int age1 = 19;
        boolean canNotGoSchol = age1<7 || age1>18;
        if (age1 >=18 && age1 <21){
            System.out.println("Ты достаточно взрослый, чтобы водить автомобиль, но недостаточно взрослый чтобы пить алкоголь");

        }
    if (canNotGoSchol);
    System.out.println("Я думаю что ты не ходишь в школу");
    }
}