package ac.ks.ks2015542042.repository;

import ac.ks.ks2015542042.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByNetwork(final String network);
    Profile findByUsername(final String username);
    Profile findByUrl(final String url);
}
