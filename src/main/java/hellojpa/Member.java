package hellojpa;



import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;
    @Column(nullable = false) //nullable => not null
    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING) //String이 필수
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public Member() {
    }
}
