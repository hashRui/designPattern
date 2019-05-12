package proxy.jdkproxy.hrproxy;

import proxy.Person;
import proxy.jdkproxy.Girl;
import proxy.jdkproxy.MatchMaker;

/**
 * Created by 胡锐 on 2019/5/12.
 */
public class HRJDKProxyTest {

    public static void main(String[] args) {

        HRMatchMaker matchMaker = new HRMatchMaker();
        try {
            Person p = (Person) matchMaker.getInstance(new Girl());
            p.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
