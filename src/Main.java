public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1.");
        int[] nums = new int[3];
        {
            nums[0] = 1;
            nums[1] = 2;
            nums[2] = 3;
        }
        double[] numsDouble = {1.57, 7.654, 9.986};
        String[] months = {
                "Январь",
                "Февраль",
                "Март"
        };
    }

    public static void task2() {
        System.out.println("Task 2.");
        int[] nums = new int[3];
        {
            nums[0] = 1;
            nums[1] = 2;
            nums[2] = 3;
        }
        double[] numsDouble = {1.57, 7.654, 9.986};
        String[] months = {
                "Январь",
                "Февраль",
                "Март"
        };
        System.out.println(nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println(numsDouble[0] + ", " + numsDouble[1] + ", " + numsDouble[2]);
        System.out.println(months[0] + ", " + months[1] + ", " + months[2]);
    }

    public static void task3() {
        System.out.println("Task 3.");
        int[] nums = new int[3];
        {
            nums[0] = 1;
            nums[1] = 2;
            nums[2] = 3;
        }
        double[] numsDouble = {1.57, 7.654, 9.986};
        String[] months = {
                "Январь",
                "Февраль",
                "Март"
        };
        System.out.println(nums[2] + ", " + nums[1] + ", " + nums[0]);
        System.out.println(numsDouble[2] + ", " + numsDouble[1] + ", " + numsDouble[0]);
        System.out.println(months[2] + ", " + months[1] + ", " + months[0]);
    }
}