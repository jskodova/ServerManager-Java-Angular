package app.ServerManagement.Service;

import app.ServerManagement.Model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {

    Object create(Server server);
    Server ping(String ip_address) throws IOException;
    Collection<Server> list(int Limit);
    Server get(Long server_id);
    Server update(Server server);
    Boolean delete(Long server_id);

}
