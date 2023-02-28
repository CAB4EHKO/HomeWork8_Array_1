import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1.");
        int[] nums = new int[3];
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

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }
        double[] numsDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < numsDouble.length; i++) {
            if (i == numsDouble.length - 1) {
                System.out.println(numsDouble[i]);
                break;
            }
            System.out.print(numsDouble[i] + ", ");
        }
        String[] months = {
                "Январь",
                "Февраль",
                "Март"
        };
        for (int i = 0; i < months.length; i++) {
            if (i == months.length - 1) {
                System.out.println(months[i]);
                break;
            }
            System.out.print(months[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Task 3.");
        int[] nums = new int[3];
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = i + 1;
            if (i == 0) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }
        double[] numsDouble = {1.57, 7.654, 9.986};
        for (int i = numsDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numsDouble[i]);
                break;
            }
            System.out.print(numsDouble[i] + ", ");
        }

        String[] months = {
                "Январь",
                "Февраль",
                "Март"
        };
        for (int i = months.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(months[i]);
                break;
            }
            System.out.print(months[i] + ", ");
        }
    }
}