package ac.ks.ks2015542042.domain;


import ac.ks.ks2015542042.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileTest {
    @Autowired
    private ProfileRepository profileRepository;

    private Profile savedProfile;

    @Before
    public void init() {
        savedProfile = profileRepository.save(Profile.builder()
                    .network("Twitter")
                    .username("홍길동")
                    .url("http://www.tiwtter.com/홍길동")
                    .build());
    }

    @Test
    public void testFindProfile() {
        Profile foundProfile = profileRepository.findById(savedProfile.getIdx()).orElse(null);
        assertThat(foundProfile.getIdx()).isEqualTo(savedProfile.getIdx());
    }

    @Test
    public void testFindNetworkProfile() {
        Profile foundProfile = profileRepository.findByNetwork("Twitter");
        assertThat(foundProfile.getNetwork()).isEqualTo(savedProfile.getNetwork());
    }

    @Test
    public void testFindUsernameProfile() {
        Profile foundProfile = profileRepository.findByUsername("홍길동");
        assertThat(foundProfile.getUsername()).isEqualTo(savedProfile.getUsername());
    }

    @Test
    public void testFindUrlProfile() {
        Profile foundProfile = profileRepository.findByUrl("http://www.tiwtter.com/홍길동");
        assertThat(foundProfile.getUrl()).isEqualTo(savedProfile.getUrl());
    }

}
