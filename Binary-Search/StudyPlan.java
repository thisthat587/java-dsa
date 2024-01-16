public class StudyPlan {
    public static void main(String[] args) {
        int[] timeForChapters = { 2, 2, 3, 3, 4, 4, 1 };
        int days = 4;
        System.out.println("So, Ayush will have to study at least " + splitTime(timeForChapters, days)
                + " seconds in a day to complete all the chapters in " + days + " days");
    }

    static int splitTime(int[] arr, int days) {
        int start = 0;
        int end = 0;
        int mid = 0;
        for (int num : arr) {
            start = Math.max(start, num);
        }

        for (int num : arr) {
            end += num;
        }

        while (start < end) {
            int sumOfTime = 0;
            mid = start + (end - start) / 2;
            int count = 1;
            for (int num : arr) {
                if (sumOfTime + num > mid) {
                    count++;
                    sumOfTime = num;
                } else {
                    sumOfTime += num;
                }
            }

            if (count <= days) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
