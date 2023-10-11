public class Date {
    private int zi;
    private int luna;
    private int an;


    public static void main(String[] args) {
        Date data = new Date(16,5,2023);
        data.displayDate();
    }


    public Date(int zi, int luna, int an) {
        setZi(zi);
        setLuna(luna);
        setAn(an);
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        if (zi > 0 && zi <= 31) {
            this.zi = zi;
        } else {
            throw new IllegalArgumentException("Ziua trebuie să fie între 1 și 31.");
        }
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        if (luna > 0 && luna <= 12) {
            this.luna = luna;
        } else {
            throw new IllegalArgumentException("Luna trebuie să fie între 1 și 12.");
        }
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", zi, luna, an);
    }


}
