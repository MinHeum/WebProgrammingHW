package ac.ks.ks2015542042.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

//Lombok
@Getter
@NoArgsConstructor
//JPA
@Entity
@Table
public class Work implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String website;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private String summary;

    @Builder

    public Work(String company, String position, String website, LocalDate startDate, LocalDate endDate, String summary) {
        this.company = company;
        this.position = position;
        this.website = website;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summary = summary;
    }
}
