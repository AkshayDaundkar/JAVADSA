package Leetcode.Easy;

public class Solution {

    public static int countStudents(int[] students, int[] sandwiches) {
        int ones = 0; //count of students who prefer type1
        int zeros = 0; //count of students who prefer type0

        for (int stud : students) {
            if (stud == 0) zeros++;
            else ones++;
        }

        // for each sandwich in sandwiches
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {  // if sandwich is of type0
                if (zeros == 0) { // if no student want a type0 sandwich
                    return ones;
                }
                zeros--;
            } else {  // if sandwich is of type1
                if (ones == 0) {  // if no student want a type1 sandwich
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int students[] = {1, 1, 1, 0, 0, 1};
        int sandwiches[] = {1, 0, 0, 0, 1, 1};
        int res = countStudents(students, sandwiches);
        System.out.println(res);
    }
}

