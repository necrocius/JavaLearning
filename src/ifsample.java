class ifsample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;
        if (x<y)
            System.out.println("x меньше y");
        x = x*2;
        if (x==y)
            System.out.println("x равно y");
        x = x*2;
        if (x>y)
            System.out.println("x больше y");
        if (x==y)
            System.out.println("Эта строка не выводится");
    }
}
