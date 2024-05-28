public class Student {
    String name,stuNo;
    int classes;
    Course maths;
    Course physical;
    Course chemistry;
    Course mathsOralNote;
    Course physicalOralNote;
    Course chemistryOralNote;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course maths, Course physical, Course chemistry, Course oralNote) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.maths = maths;
        this.physical = physical;
        this.chemistry = chemistry;
        this.mathsOralNote = oralNote;
        this.physicalOralNote = oralNote;
        this.chemistryOralNote = oralNote;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int maths, int physical, int chemistry) {

        if (maths >= 0 && maths <= 100) {
            this.maths.note = maths;
        }

        if (physical >= 0 && physical <= 100) {
            this.physical.note = physical;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }

    public void addBulkOralNote(int mathsOralNote, int physicalOralNote, int chemistryOralNote)
    {

        if (mathsOralNote >= 0 && mathsOralNote <= 100) {
            this.mathsOralNote.mathsOralNote= mathsOralNote;
        }

        if (physicalOralNote >= 0 && physicalOralNote <= 100) {
            this.physicalOralNote.physicalOralNote = physicalOralNote;
        }

        if (chemistryOralNote >= 0 && chemistryOralNote <= 100) {
            this.chemistryOralNote.kimOralNote = chemistryOralNote;
        }
    }


    public void isPass() {
        if (this.maths.note == 0 || this.physical.note == 0 || this.chemistry.note == 0 ||
            this.mathsOralNote.mathsOralNote == 0 || this.physicalOralNote.physicalOralNote == 0 || this.chemistryOralNote.kimOralNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matResult = (this.mathsOralNote.mathsOralNote * 0.20) + (this.maths.note * 0.80);
        double fizResult = (this.physicalOralNote.physicalOralNote * 0.20) + (this.physical.note * 0.80);
        double kimResult = (this.chemistryOralNote.kimOralNote * 0.20) + (this.chemistry.note * 0.80);
        this.avarage = (fizResult + kimResult + matResult) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.maths.note);
        System.out.println("Fizik Notu : " + this.physical.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
        System.out.println("Matematik Sözlü Notu : " + this.mathsOralNote.mathsOralNote);
        System.out.println("Fizik Sözlü Notu : " + this.physicalOralNote.physicalOralNote);
        System.out.println("Kimya Sözlü Notu : " + this.chemistryOralNote.kimOralNote);

    }

}