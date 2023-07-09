package app.ServerManagement.Repository;

import app.ServerManagement.Model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository {
    Server findByIpAddress(String ip_address);

}
