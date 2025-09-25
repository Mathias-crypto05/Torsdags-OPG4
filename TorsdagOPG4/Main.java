//1.a
public class Main {
    public static void main(String[] args) {
Team t1 = new Team("Vogterne");

t1.setRank(1);
t1.addPlayer("Mathias");
t1.addPlayer("Jonas");
t1.addPlayer("Morten");
t1.addPlayer("Oliver");
System.out.println(t1);

Team t2 = new Team("Konger");
        t2.setRank(2);
        System.out.println(t2);

        Team t3 = new Team("Lynet");
        t3.setRank(3);
        System.out.println(t3);

        Team t4 = new Team("Falkene");
        t4.setRank(4);
        System.out.println(t4);

        Team t5 = new Team("Bølgerne");
        t5.setRank(5);
        System.out.println(t5);

        Team t6 = new Team("Nordstjernen");
        t6.setRank(6);
        System.out.println(t6);
    }
}
    

