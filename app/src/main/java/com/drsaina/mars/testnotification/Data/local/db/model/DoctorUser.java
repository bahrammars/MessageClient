package com.drsaina.mars.testnotification.Data.local.db.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "DOCTOR_USER".
 */
public class DoctorUser {

    private Long id;
    /** Not-null value. */
    private String doctorUserGuid;
    /** Not-null value. */
    private String doctorGuid;
    /** Not-null value. */
    private String doctorMobile;
    /** Not-null value. */
    private String doctorFullName;
    private String doctorSpetial;
    private String doctorSummary;
    /** Not-null value. */
    private String doctorImageAddress;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public DoctorUser() {
    }

    public DoctorUser(Long id) {
        this.id = id;
    }

    public DoctorUser(Long id, String doctorUserGuid, String doctorGuid, String doctorMobile, String doctorFullName, String doctorSpetial, String doctorSummary, String doctorImageAddress) {
        this.id = id;
        this.doctorUserGuid = doctorUserGuid;
        this.doctorGuid = doctorGuid;
        this.doctorMobile = doctorMobile;
        this.doctorFullName = doctorFullName;
        this.doctorSpetial = doctorSpetial;
        this.doctorSummary = doctorSummary;
        this.doctorImageAddress = doctorImageAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getDoctorUserGuid() {
        return doctorUserGuid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDoctorUserGuid(String doctorUserGuid) {
        this.doctorUserGuid = doctorUserGuid;
    }

    /** Not-null value. */
    public String getDoctorGuid() {
        return doctorGuid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDoctorGuid(String doctorGuid) {
        this.doctorGuid = doctorGuid;
    }

    /** Not-null value. */
    public String getDoctorMobile() {
        return doctorMobile;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDoctorMobile(String doctorMobile) {
        this.doctorMobile = doctorMobile;
    }

    /** Not-null value. */
    public String getDoctorFullName() {
        return doctorFullName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public String getDoctorSpetial() {
        return doctorSpetial;
    }

    public void setDoctorSpetial(String doctorSpetial) {
        this.doctorSpetial = doctorSpetial;
    }

    public String getDoctorSummary() {
        return doctorSummary;
    }

    public void setDoctorSummary(String doctorSummary) {
        this.doctorSummary = doctorSummary;
    }

    /** Not-null value. */
    public String getDoctorImageAddress() {
        return doctorImageAddress;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDoctorImageAddress(String doctorImageAddress) {
        this.doctorImageAddress = doctorImageAddress;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
