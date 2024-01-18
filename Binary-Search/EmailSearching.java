
public class EmailSearching {
    public static void main(String[] args) {
        String[] email = {
                "dubevakaza@amail.com", "dubeyaizen@amail.com", "dubeyakaza@gmail.com",
                "dubeyggl@gmail.com", "dubeynitro@gmail.com", "dubeyrooms107@gmail.com",
                "dubeyrooms108@gmail.com", "dubeyshop264@gmail.com", "dubeyshop41@gmail.com",
                "dubeytake@gmail.com", "dubeywtf@gmail.com", "jalajishsisviwishdvbx@gmail.com",
                "prodarshit0@gmail.com", "prorusherdarshit@gmail.com", "ritik1212mbIffff@gmail.com",
                "ritik1212mblk@amail.com", "ritik1212mblkk@gmail.com", "ritik1212mbllk@gmail.com",
                "rusherdarshit@gmail.com", "shopdubey31@gmail.com", "shopdubey70@gmail.com",
                "shopdubey76@gmail.com", "snopaubey/U@gmall.com"
        };

        String target = "dubeyrooms108@gmail.com";
        System.out.println(searchEmail(email, target));
    }

    static boolean isEqual(String email, String target) {
        char[] emailArr = email.toCharArray();
        char[] targetArr = target.toCharArray();
        for (int i = 0; i < emailArr.length; i++) {
            if (emailArr[i] != targetArr[i]) {
                return false;
            }
        }
        return true;
    }

    static int searchEmail(String[] email, String target) {

        int start = 0;
        int end = email.length - 1;
        int mid = 0;

        while (end >= start) {
            
            mid = start + (end - start) / 2;

            if (target.compareTo(email[mid]) == 0) {
                if (isEqual(email[mid], target)) {
                    return mid;
                }
            } else if (target.compareTo(email[mid]) > 0) {
                start = mid + 1;
            } else if (target.compareTo(email[mid]) < 0) {
                end = mid - 1;
            }
        }
        return -1;
    }

}
