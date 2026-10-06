public class FiveException {

    public FiveException() {
    }

    public static void main(String[] args) {

        try {
            int var1 = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:" + String.valueOf(e));
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException:" + String.valueOf(e));
        }

        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException:" + String.valueOf(e)
            );
        }

        try {
            int arr = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println(
                "NumberFormatException:" + String.valueOf(e)
            );
        }

        try {
            String str = "Java";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(
                "StringIndexOutOfBoundsException:" + String.valueOf(e)
            );
        }
    }
}
