class light {
    public static void main(String args[]) {
        int lightspeed, days;
        long sec, dist;
        lightspeed = 300000;
        days = 1000;
        sec = days * 24 * 60 * 60;
        dist = lightspeed * sec;
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около " + dist);
        System.out.println(" километров");
    }
}
