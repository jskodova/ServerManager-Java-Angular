package app.ServerManagement.Model;

import app.ServerManagement.Enumeration.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id @GeneratedValue
    private int server_id;
    @Column(unique = true)
    @NotEmpty(message = "IP address cannot be empty")
    private String ip_address;
    private String server_name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;

}
