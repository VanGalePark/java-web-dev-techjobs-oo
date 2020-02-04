package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job_one;
    Job test_job_two;
    Job test_job_two_copy;

    @Before
    public void testJobObjects() {
        test_job_one = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_two = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        test_job_two_copy = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

    }

    @Test
    public void testSettingJobId() {
        int jobOneId = test_job_one.getId();
        int jobTwoId = test_job_two.getId();

        assertEquals(jobTwoId-1, jobOneId);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job_one.getEmployer() instanceof Employer);
        assertTrue(test_job_one.getLocation() instanceof Location);
        assertTrue(test_job_one.getPositionType() instanceof PositionType);
        assertTrue(test_job_one.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(test_job_one.getName() != "");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job_two.equals(test_job_two_copy));
    }

    @Test
    public void testJobsToString() {
        assertEquals("ID: " + test_job_two.getId() +
                "\nName: " + test_job_two.getName() +
                "\nEmployer: Data not available!" +
                "\nLocation: " + test_job_two.getLocation() +
                "\nPosition Type: " + test_job_two.getPositionType() +
                "\nCore Competency: " + test_job_two.getCoreCompetency()
                , test_job_two.toString());

    }
}
