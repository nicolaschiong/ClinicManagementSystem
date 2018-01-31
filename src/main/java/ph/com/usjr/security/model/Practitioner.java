package ph.com.usjr.security.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Nick on 31/01/2018.
 */
public class Practitioner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "practioner_id")
    private Long practionerId;

    private String firstName;

    private String lastName;
}
