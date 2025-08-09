public class Task1 {

    public static boolean isAccepted(String input) {

        int state = 0; // 4 states from 0->3

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (state) {
                case 0:
                    state = (c == '0') ? 1 : 2;
                    break;
                case 1:
                    state = (c == '0') ? 0 : 3;
                    break;
                case 2:
                    state = (c == '0') ? 3 : 0;
                    break;
                case 3:
                    state = (c == '0') ? 2 : 1;
                    break;
            }
        }

        return state == 0;
    }

    public static void main(String[] args) {
        String[] inputs = {"", "01", "0011", "1100", "0000", "0101", "00011"};
        System.out.println("Even number of 0s and 1s");
        for (String input : inputs) {
            System.out.printf("Input: " + input + " → " + (isAccepted(input)? "Accepted" : "Rejected")+'\n');
        }
    }
}
