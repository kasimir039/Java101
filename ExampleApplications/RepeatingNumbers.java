public class RepeatingNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j])
                    count++;

            }
            if (!isFind(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
            }
        }
    }
}
