package proxy.jdkproxy;

import proxy.Person;

/**
 * Created by 胡锐 on 2019/5/12.
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        MatchMaker matchMaker = new MatchMaker();
        try {
            Person p = (Person) matchMaker.getInstance(new Girl());
            p.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
