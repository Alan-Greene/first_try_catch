package first_try_catch;

public class Main {

    public static void main(String[] args) {
        int[] test_arr = {1, 2, 3, 4, 5};

        try {
            System.out.println("Inside try");
            System.out.println(test_arr[-1]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Inside exception");
            e.printStackTrace(System.out);
        }

        System.out.println("continue...");
    }
}
