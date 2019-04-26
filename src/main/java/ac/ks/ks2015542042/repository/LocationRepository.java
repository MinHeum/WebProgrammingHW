package ac.ks.ks2015542042.repository;

import ac.ks.ks2015542042.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findByAddress(final String address);
    Location findByPostcode(final String postcode);
}
