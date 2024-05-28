public class Main {
    public static void main(String[] args) {

        Course maths = new Course("Matematik", "MAT101", "MAT");
        Course physical = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");
        Course oralNote = new Course();

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        maths.addTeacher(t1);
        physical.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", maths, physical, chemistry,oralNote);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOralNote(90,80,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", maths, physical, chemistry,oralNote);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOralNote(50,20,10);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", maths, physical, chemistry,oralNote);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOralNote(10,10,10);
        s3.isPass();

    }
}