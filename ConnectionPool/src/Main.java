public class Main {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool(3);

        Connection c1 = pool.acquire();
        Connection c2 = pool.acquire();

        c1.execute();
        c2.execute();

        pool.release(c1);

        Connection c3 = pool.acquire();
        c3.execute();

        pool.release(c2);
        pool.release(c3);
    }
}