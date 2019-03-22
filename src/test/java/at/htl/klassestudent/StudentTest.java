package at.htl.klassestudent;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

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

        assertThat(compare, is(0));
    }

    @Test
    public void student_compareTwoStudents02_true() {
        Student maxi = new Student("Maxi", "Müller", 1);
        Student susi = new Student("Susi", "Scholz", 2);

        int compare = susi.compareTo(maxi);

        assertThat(compare, greaterThan(0));
    }
}