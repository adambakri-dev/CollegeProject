package Project.Utils;

public class ID_Check {
    public static boolean IsValid(String id){
        if (id.length() != 9 || !id.matches("[0-9]+")) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(String.valueOf(id.charAt(i)));

            if (i % 2 == 1) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }

        return sum % 10 == 0;
    }
}
