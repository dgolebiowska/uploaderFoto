package pl.dg.givepicture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppImageRepo extends JpaRepository<AppImage,Long> {
}
