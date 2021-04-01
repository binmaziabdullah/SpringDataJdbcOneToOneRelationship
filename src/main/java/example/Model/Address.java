package example.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("address")
@Data
public class Address {

    @Id
    private Long addId;
    private String Landmark;
    private String city;
    private String state;
    private String country;

}
