package ac.ks.ks2015542042.repository;

import ac.ks.ks2015542042.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface WorkRepository extends JpaRepository<Work, Long> {
    Work findByCompany(final String work);
    Work findByPosition(final String position);
    Work findByWebsite(final String website);
    Work findByStartDate(final LocalDate startDate);
    Work findByEndDate(final LocalDate endDate);
}
