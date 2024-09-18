import java.util.HashMap;

public class CourseService {
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();

    public CourseService() {
        students.put("120120", new Student("Santiago", "120120"));
        students.put("884545", new Student("Kate", "884545"));
        students.put("458787", new Student("Alejandra", "458787"));
        students.put("135464", new Student("Maria", "135464"));
        students.put("778979", new Student("Peter", "778979"));

        courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
        courses.put("biol_01", new Course("Biology 1", "biol_01", 8));
        courses.put("phys_01", new Course("Physics 1", "phys_01", 8));
        courses.put("art_01", new Course("Arts 1", "art_01", 8));
        courses.put("chem_01", new Course("Chemistry 1", "chem_01", 8));
        courses.put("sport_01", new Course("Sports 1", "sport_01", 8));
    }

    // Método para inscribir al estudiante en un curso
    public void enrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student != null && course != null) {
            student.enroll(course); // Añadir curso al estudiante
            System.out.println(student.getName() + " ha sido inscrito en " + course.getName());
        } else {
            System.out.println("Estudiante o curso no encontrado");
        }
    }

    // Método para desinscribir al estudiante de un curso
    public void unEnrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student != null && course != null) {
            student.unEnroll(course); // Eliminar curso del estudiante
            System.out.println(student.getName() + " ha sido desinscrito de " + course.getName());
        } else {
            System.out.println("Estudiante o curso no encontrado");
        }
    }

    // Método para mostrar información de un curso
    public void displayCourseInformation(String courseId) {
        Course course = courses.get(courseId);

        if (course != null) {
            System.out.println("Información del curso:");
            System.out.println("Nombre: " + course.getName());
            System.out.println("ID: " + course.getId());
            System.out.println("Créditos: " + course.getCredits());
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    // Método para mostrar información de un estudiante
    public void displayStudentInformation(String studentId) {
        Student student = students.get(studentId);

        if (student != null) {
            System.out.println("Información del estudiante:");
            System.out.println("Nombre: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Cursos inscritos: ");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println(course.getName() + " (" + course.getId() + ")");
            }
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }
}//class CourseService