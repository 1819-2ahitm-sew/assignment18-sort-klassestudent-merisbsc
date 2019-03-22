package at.htl.klassestudent;
public class Klasse {

    private Student[] students = {new Student("Nina", "Weissengruber", 27), new Student("Magdalena", "Scholz", 20), new Student("Merin", "Besic", 1), new Student("Tobias", "Höfler", 8)};
    private String klassenbezeichnung;


    public Klasse() {
    }
    public Klasse(String klassenbezeichnung) {
        this();
        this.setKlassenbezeichnung(klassenbezeichnung);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void add(Student student) {
        if (getStudents() == null) {
            setStudents(new Student[1]);
        } else {
            Student[] help = new Student[students.length + 1];


        }
        getStudents()[getStudents().length - 1] = student;
    }

    void sortBubble() {
        boolean swapped = true;
        int j = 0;
        int tmp;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < getStudents().length - j; i++) {
                if (getStudents()[i].katNr > getStudents()[i + 1].katNr) {
                    tmp = getStudents()[i].katNr;
                    getStudents()[i] = getStudents()[i + 1];
                    getStudents()[i + 1].katNr = tmp;
                    swapped = true;
                }
            }
        }
    }

    public void sortInsert() {

    }

    public void printArr() {
        for (Student student : this.getStudents()) {
            System.out.print(student + "");
        }
    }

//    //public static void main(String[] args) {
//        this.printArr();
//    }

    public String getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(String klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }
}
