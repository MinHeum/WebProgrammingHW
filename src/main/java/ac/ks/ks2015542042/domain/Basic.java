package ac.ks.ks2015542042.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//Lombok
@Getter
@NoArgsConstructor
//JPA
@Entity
@Table
public class Basic implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private String label;

    @Column
    private String eMail;

    @Column
    private String phone;

    @Builder
    public Basic(String name, String label, String eMail, String phone) {
        this.name = name;
        this.label = label;
        this.eMail = eMail;
        this.phone = phone;
    }
}
