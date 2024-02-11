/*
 * created by Max$
 */


package lesson18_01;

public class Dog {

    private String name;

    private int jumpHeight;

    private static final int increasePerOneTraining = 10;

    private static int couterAlle;


    private int maxJumpHeight;

    static {
        couterAlle = 0;
    }


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int jump() {
        couterAlle++;
        System.out.println("Собака по имени: " + name + " Прыгнула!");
        return couterAlle;
    }


    private void training() {
        jumpHeight += increasePerOneTraining;
        // jumpHeight = (jumpHeight > maxJumpHeight) ? maxJumpHeight : jumpHeight;
        jumpHeight = Math.min(jumpHeight, maxJumpHeight);
        System.out.println("=======jump after training =========" + jumpHeight);
    }


    public boolean takeBarrier(int bariier) {
        System.out.println(name + " прыжок сейчас: " + jumpHeight + "; барьер " + bariier + " начало method takeBarier ");
        if (jumpHeight >= bariier) {
            jump();
            System.out.println("Если барьер меньше, чем умение собаки:" + name + " прыжок: " + jumpHeight +
                    "; barier " + bariier + " Я перепрыгнула этот барьер ");
            return true;
        } else {
            if (maxJumpHeight >= bariier) {
                do {
                    training();
                } while (jumpHeight < bariier);
                jump();

                System.out.println(" Возможность натренироваться: есть! Собака по имени: " +
                        name + "Теперь я прыгаю на " + jumpHeight + "; а барьер всего: " + bariier + "");
                return true;
            } else {
                System.out.println("Я не смогу так прыгнуть!");
                System.out.println(" Возможность натренироваться: нет! Собака по имени:  " + name + ". я прыгаю лишь на " +
                        jumpHeight + "; Наш барьер " + bariier + "");

                return false;
            }
        }

    }

    public static int counterAlleJump() {
        System.out.println("Всего напрыгали собаки: " + couterAlle);
        return couterAlle;
    }

    public void info() {
        System.out.println("Собака по имени: " + name + ". Прыгает лишь на: " + jumpHeight +
                " | натренироваться может до: " + maxJumpHeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 22);
        System.out.println(dog.takeBarrier(40));
        Dog dog1 = new Dog("Каштанка", 28);
        dog1.takeBarrier(45);
        System.out.println(dog1.takeBarrier(39));
        Dog dog2 = new Dog("Kawa", 42);
        dog2.takeBarrier(76);

        counterAlleJump();

    }
}