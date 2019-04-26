package ac.ks.ks2015542042.repository;

import ac.ks.ks2015542042.domain.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicRepository extends JpaRepository<Basic, Long> {
    Basic findByName(final String name);
    Basic findByLabel(final String label);
    Basic findByEMail(final String eMail);
    Basic findByPhone(final String phone);
}

