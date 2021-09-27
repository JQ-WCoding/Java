package chapter10.calendarAndDate;

public class CalendarEx9 {
    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("2020. 5. 25 : " + getDayOfWeek(2020, 5, 25));
        System.out.println("2021. 7. 28 : " + getDayOfWeek(2021, 7, 28));

        System.out.println("2020. 5. 25 - 2021. 7. 28 : " + dayDiff(2020,5,25,2021,7,28));
        System.out.println("2022. 6. 20 : " + convertDateToDay(2022,6,20));
        System.out.println("738327 : " + convertDayToDate(738327));
    }

    // 윤년을 찾아두기
    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    // 날짜 간격
    static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        // 첫번째 인자로 받은 값을 기준으로 후자로 받은 인자값을 뺀 간격 구하기 -> 원하면 절대값으로 표현도 괜찮을거 같다
        return Math.abs(convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2));
        // return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    // 해당 주의 날 찾기
    static int getDayOfWeek(int y, int m, int d) {
        return convertDateToDay(y, m, d) & 7 + 1;
    }

    // 날을 요일로 변경
    static String convertDayToDate(int day) {
        int year = 1;
        int month = 0;

        while (true) {
            // 윤년의 경우 366일로 1일 더 많게 설정해준다 -> 1년의 기준 단위 초기화
            int aYear = isLeapYear(year) ? 366 : 365;
            // 366일 혹은 365일보다 많은 높은 경우
            if (day > aYear) {
                day -= aYear;
                // 연도를 올려준다
                year++;
            } else {
                break;
            }
        }

        while (true) {
            // 종료날 초기화
            int endDay = endOfMonth[month]; // 해당 월의 마지막 일이 언제인지 확인하기 위함

            // 윤년이고 2월인 경우 month == 1 은 month 가 2월임을 의미한다
            if (isLeapYear(year) && month == 1) {
                // 하루 더 필요함 29일까지
                endDay++;
            }

            if (day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }
        return year + "-" + (month + 1) + "-" + day;
    }

    // 요일을 날로 변경
    static int convertDateToDay(int year, int month, int day) {
        // 윤년이 몇번 있었는지 확인하는 변수 초기화
        int numOfLeapYear = 0;

        // 윤년인 경우 윤년의 갯수 확인하는 변수 +1 증가
        for (int i = 0; i < year; i++) {
            if (isLeapYear(i)) {
                numOfLeapYear++;
            }
        }

        // 해당 연도 기준 작년의 총 일수 구하기
        int toLastYearTotalDay = (year - 1) * 365 + numOfLeapYear;

        // 올해의 총 일수
        int thisYearTotalDay = 0;

        // endOfMonth 매달의 마지막 날짜를 사용하여 일수를 추가
        for (int i = 0; i < month - 1; i++) {
            thisYearTotalDay += endOfMonth[i];
        }

        // 윤년이면서 3월이 지난 경우 +1을 해준다 왜?
        if (month > 2 && isLeapYear(year)) {
            thisYearTotalDay++;
        }

        // 총 일수 합하여 반환
        thisYearTotalDay += day;

        return toLastYearTotalDay + thisYearTotalDay;
    }
}
