package example.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("student")
@Data
public class Student {

    @Id
    private Long id;
    private String name;
    private String password;
;
    @MappedCollection(idColumn = "add_id")
    private Address address;


}
