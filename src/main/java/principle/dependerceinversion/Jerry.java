package principle.dependerceinversion;

/**
 * @author: r.hu
 * @create: 2019-06-21 15:40
 **/

public class Jerry {

    private ICourse iCourse;

    /*public Jerry(ICourse iCourse){
        iCourse.studyCourse();
    }*/

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    void study(){
        iCourse.studyCourse();
    }

    void studyJavaCourse(){
        System.out.println("jerry study java course");
    }

    void studyPECourse(){
        System.out.println("jerry study PE course");
    }



}
