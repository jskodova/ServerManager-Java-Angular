package app.ServerManagement.Service.Implementation;
import app.ServerManagement.Model.Server;
import app.ServerManagement.Repository.ServerRepository;
import app.ServerManagement.Service.ServerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;

import static app.ServerManagement.Enumeration.Status.SERVER_DOWN;
import static app.ServerManagement.Enumeration.Status.SERVER_UP;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImplementation implements ServerService {

    private final ServerRepository server_repository;
    @Override
    public Server create(Server server) {
        log.info("Creating server: {}", server.getServer_name());
        server.setImageUrl(setServerImageUrl());
        server_repository.save(server);
        return server;
    }

    @Override
    public Server ping(String ip_address) throws IOException {
        log.info("Pinging server: {}", ip_address);
        Server server = server_repository.findByIpAddress(ip_address);
        InetAddress address = InetAddress.getByName(ip_address);
        server.setStatus(address.isReachable(10000) ? SERVER_UP : SERVER_DOWN);
        server_repository.save(server);
        return server;
    }

    @Override
    public Collection<Server> list(int Limit) {
        return null;
    }

    @Override
    public Server get(Long server_id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long server_id) {
        return null;
    }

    private String setServerImageUrl() {
        return null;
    };
}
