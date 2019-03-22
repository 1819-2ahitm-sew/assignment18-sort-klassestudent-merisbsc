package at.htl.klassestudent;

public class Student extends Klasse implements Comparable<Student> {

    private String vorname;
    private String nachname;
    int katNr;

    public Student() {
    }

    public Student(String vorname, String nachname, int katNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.katNr = katNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", nachname, vorname);
    }

    public int compareTo(Student o) {
        if (this.nachname.equals(o.getNachname())) {
            return this.vorname.compareTo(o.getVorname());
        }
        return this.nachname.compareTo(o.getNachname());
    }
}
