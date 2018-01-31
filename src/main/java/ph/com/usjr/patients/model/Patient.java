package ph.com.usjr.patients.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Nick on 31/01/2018.
 */
public class Patient {

    //PERSONAL INFORMATION

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "patient_id")
    private Long patientId;

    private Long patientStudentNo;

    private String patientFirstName;

    private String patientSurnameName;

    private char patientMiddleInitial;

    private int patientAge;

    private String patientSex;

    private String patientStatus;

    private String patientCourseAndYear;

    private char patientBloodType;

    private String patientPermanentAddress;

    private String patientPresentAddress;

    private String patientFamilyPhysician;

    private String patientPastDisease;

    private String patientFamilyHistory;

    private String patientAllergy;

    private String patientPersonToBeNotified;

    private String patientPersonToBeNotifiedAddress;

    private String patientPersonToBeNotifiedContact;


}
