public class Task2 {

    // DFA that accepts strings with exactly 3 consecutive 0s followed by only 1s
    public static boolean isAccepted(String input) {

        int state = 0; // 5 states

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (state) {
                case 0:
                    if (c == '0') state = 1;
                    break;
                case 1:
                    if (c == '0') state = 2;
                    else state = 0;
                    break;
                case 2:
                    if (c == '0') state = 3;
                    else state = 0;
                    break;
                case 3:
                    if (c == '1') state = 4;
                    else state = 3;
                    break;
                case 4:
                    if (c=='1')state = 4;
                    else state = 0;
                    break;

            }
        }

        return state == 3;
    }

    public static void main(String[] args) {
        String[] inputs = {"0000", "0001", "0001111", "001", "0111", "0000", "111000"};
        System.out.println("Three 0s followed by any number of 1s");
        for (String input : inputs) {
            System.out.printf("Input: " + input + " → " + (isAccepted(input) ? " Accepted" : " Rejected")+'\n');
        }
    }
}
