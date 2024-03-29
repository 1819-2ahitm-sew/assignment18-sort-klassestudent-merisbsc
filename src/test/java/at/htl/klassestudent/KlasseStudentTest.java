package at.htl.klassestudent;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class KlasseStudentTest {

    @BeforeAll
    static void setup() {

    }


    @Test
    public void student_compareTwoStudents_true() {
        Student maxi = new Student("Maxi", "Müller", 1);
        Student susi = new Student("Susi", "Scholz", 2);

        int compare = maxi.compareTo(susi);

        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareEqualStudents_true() {
        Student maxi = new Student("Maxi", "Müller", 1);
        Student maxi2 = new Student("Maxi", "Müller", 1);

        int compare = maxi.compareTo(maxi2);

        assertThat(compare, CoreMatchers.is(0));
    }

    @Test
    public void student_compareTwoStudents02_true() {
        Student maxi = new Student("Maxi", "Müller", 1);
        Student susi = new Student("Susi", "Scholz", 2);

        int compare = susi.compareTo(maxi);

        assertThat(compare, greaterThan(0));
    }

    @Test
    public void klasse_insertAStudent_true() {
        Student magda = new Student("Magda", "Lena", 2);
        Klasse klasse = new Klasse("2ahitm");

        assertThat(klasse.getStudents(), hasItemInArray(magda));
    }

}