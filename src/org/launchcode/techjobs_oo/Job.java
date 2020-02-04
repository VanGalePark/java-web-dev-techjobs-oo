package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String jobId = "ID: " + this.id;

        String jobName;
        String jobEmployer;
        String jobLocation;
        String jobPositionType;
        String jobCoreCompetency;

        if(this.name == "") {
            jobName = "\nName: Data not available!";
        } else {
            jobName = "\nName: " + this.name;
        }

        if(this.employer.getValue() == "") {
            jobEmployer = "\nEmployer: Data not available!";
        } else {
            jobEmployer = "\nEmployer: " + this.employer;
        }

        if(this.location.getValue() == "") {
            jobLocation = "\nLocation: Data not available!";
        } else {
            jobLocation = "\nLocation: " + this.location;
        }

        if(this.positionType.getValue() == "") {
            jobPositionType = "\nPosition Type: Data not available!";
        } else {
            jobPositionType = "\nPosition Type: " + this.positionType;
        }

        if(this.coreCompetency.getValue() == "") {
            jobCoreCompetency = "\nCore Competency: Data not available!";
        } else {
            jobCoreCompetency = "\nCore Competency: " + this.coreCompetency;
        }

        String toStringResult = jobId + jobName + jobEmployer + jobLocation + jobPositionType + jobCoreCompetency;

        return toStringResult;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
