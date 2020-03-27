package by.yakovlev;

class Main {

    public static void main(String[] args) {
        long s = 6242984467L;
        long sec;
        long m;
        long min, h;
        long hour , d ;
        long days, w;
        long week;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        days = d % 7;
        week = d / 7;



        System.out.println(week+ " недель " + days+ " дней " + hour + " часов " + min + " минут " + sec + "секунд");
    }
}
