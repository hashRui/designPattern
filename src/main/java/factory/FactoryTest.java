package factory;

/**
 * @author: r.hu
 * @create: 2019-05-06 11:00
 **/

public class FactoryTest {

    public static void main(String[] args) {
        LanguageFactory languageFactory = new JavaFactory();
        languageFactory.study();
    }

}
