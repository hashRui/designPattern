package principle.dependerceinversion;

/**
 * @author: r.hu
 * @create: 2019-06-21 15:43
 **/

public class Main {

    public static void main(String[] args) {
        // v1
        /*Jerry jerry = new Jerry();
        jerry.studyJavaCourse();
        jerry.studyPECourse();*/

        // v2
       /* Jerry jerry = new Jerry(new JavaCourse());

        Jerry jerry1 = new Jerry(new PECourse());*/

        // v3
        Jerry jerry = new Jerry();
        jerry.setiCourse(new JavaCourse());
        jerry.study();
        jerry.setiCourse(new PECourse());
        jerry.study();




    }

}
