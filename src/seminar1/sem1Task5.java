package seminar1;

public class sem1Task5 {
    public static void main(String[] args) {
        String[] arr = {"котяра", "котик", "котенок"};
        String result = "";
        int min = arr[0].length();
        char temp;
        for (String item : arr) {
            if (item.length() < min) {
                min = item.length();
            }
        }
        for (int i = 0; i < min; i++) {
            temp = arr[0].charAt(i); // a,s,d,k
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].charAt(i) == temp) {
                    continue;
                } else {
                    System.out.println(result);
                    return;
                }
            }
            result += temp;
        }
        System.out.println(result);
    }
}