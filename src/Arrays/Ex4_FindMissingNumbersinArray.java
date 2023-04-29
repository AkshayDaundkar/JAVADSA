package Arrays;
//use this formula to find out missing number in array n(n+1)/2
//n narttural numbers 1-4 -----4+3+2+1=10 n(n+1)/2
public class Ex4_FindMissingNumbersinArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};

        System.out.println(arr.length);
        int n = arr.length+1;
        int actualsum = 0;
        int expectedsum = (n * (n + 1)) / 2;

        for (int sum : arr) {
            actualsum += sum;
        }

        System.out.println(expectedsum);
        System.out.println(actualsum);
        System.out.println(expectedsum - actualsum);

    }

}
