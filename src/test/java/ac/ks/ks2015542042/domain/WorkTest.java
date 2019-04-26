package ac.ks.ks2015542042.domain;


import ac.ks.ks2015542042.repository.WorkRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class WorkTest {
    @Autowired
    private WorkRepository workRepository;

    private Work savedWork;

    @Before
    public void init() {
        savedWork = workRepository.save(Work.builder()
                .company("(주)홍길동")
                .position("개발자")
                .website("http://www.company.domain")
                .startDate(LocalDate.of(2019,01,01))
                .endDate(LocalDate.of(2019,01,02))
                .build());
    }

    @Test
    public void testFindWork() {
        Work foundWork = workRepository.findById(savedWork.getIdx()).orElse(null);
        assertThat(foundWork.getIdx()).isEqualTo(savedWork.getIdx());
    }

    @Test
    public void testFindCompanyWork() {
        Work foundWork = workRepository.findByCompany("(주)홍길동");
        assertThat(foundWork.getCompany()).isEqualTo(savedWork.getCompany());
    }

    @Test
    public void testFindPositionWork() {
        Work foundWork = workRepository.findByPosition("개발자");
        assertThat(foundWork.getPosition()).isEqualTo(savedWork.getPosition());
    }
    @Test
    public void testFindWebsiteWork() {
        Work foundWork = workRepository.findByWebsite("http://www.company.domain");
        assertThat(foundWork.getWebsite()).isEqualTo(savedWork.getWebsite());
    }
    @Test
    public void testFindStartDateWork() {
        Work foundWork = workRepository.findByStartDate(LocalDate.of(2019,01,01));
        assertThat(foundWork.getStartDate()).isEqualTo(savedWork.getStartDate());
    }
    @Test
    public void testFindEndDateWork() {
        Work foundWork = workRepository.findByEndDate(LocalDate.of(2019,01,02));
        assertThat(foundWork.getEndDate()).isEqualTo(savedWork.getEndDate());
    }


}
