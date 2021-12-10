package one.digitalinovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;


    private String firstName;

    private String lastName;

    private String cpf;

    private String birthday;

    private List<PhoneDTO> phones;
}
