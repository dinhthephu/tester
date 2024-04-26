import java.lang.IllegalArgumentException;

public class NextDate {
    public static boolean isLeapYear(int year) {
        /*
         * Kiểm tra xem một năm có phải là năm nhuận hay không.
         */
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static int[] nextDate(int day, int month, int year) {
        /*
         * Tính toán ngày kế tiếp dựa trên ngày, tháng và năm đầu vào.
         */
        // Xác định số ngày trong mỗi tháng
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        // Kiểm tra ngày và tháng hợp lệ
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month]) {
            throw new IllegalArgumentException("Ngày hoặc tháng không hợp lệ");
        }

        // Tăng ngày lên 1 đơn vị
        day += 1;

        // Kiểm tra xem ngày có vượt quá số ngày trong tháng không
        if (day > daysInMonth[month]) {
            day = 1;
            month += 1;

            // Kiểm tra xem tháng có vượt quá 12 không
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }

        return new int[]{day, month, year};
    }
}
