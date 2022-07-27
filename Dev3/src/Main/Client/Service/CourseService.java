package Main.Client.Service;

public interface CourseService <Course> extends BaseService<Course> {

    void deleteByCode(String code);

    Course updateByCode(Course course, String code);

}
