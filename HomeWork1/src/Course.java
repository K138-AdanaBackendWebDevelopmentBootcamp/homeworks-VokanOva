    import java.util.Objects;

    public class Course {
        private String courseName;
        private String courseCode;
        private int creditScore;

        public Course(String courseName, String courseCode, int creditScore) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.creditScore = creditScore;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public int getCreditScore() {
            return creditScore;
        }

        public void setCreditScore(int creditScore) {
            this.creditScore = creditScore;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Course courses = (Course) o;
            return creditScore == courses.creditScore && Objects.equals(courseName, courses.courseName) && Objects.equals(courseCode, courses.courseCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(courseName, courseCode, creditScore);
        }

        @Override
        public String toString() {
            return "Courses{" +
                    "courseName='" + courseName + '\'' +
                    ", courseCode='" + courseCode + '\'' +
                    ", creditScore=" + creditScore +
                    '}';
        }
    }

