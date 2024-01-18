
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

        String target = "snopaubey/U@gmall.com";
        System.out.println(searchEmail(email, target));

    }

    static int isEqual(String email, String target) {
        int result = 0;
        char[] emailArr = email.toCharArray();
        char[] targetArr = target.toCharArray();
        for (int i = 0; i < emailArr.length; i++) {
            if (emailArr[i] == targetArr[i]) {
                result = 0;
            } else if (emailArr[i] < targetArr[i]) {
                result = 1;
                return result;
            } else {
                result = -1;
                return result;
            }
        }
        return result;
    }

    static int searchEmail(String[] email, String target) {

        int start = 0;
        int end = email.length - 1;
        int mid = 0;

        while (end >= start) {
            mid = start + (end - start) / 2;
            int compare = isEqual(email[mid], target);
            if (compare == 0) {
                return mid;
            } else if (compare == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
