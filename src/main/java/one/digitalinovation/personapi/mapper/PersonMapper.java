package one.digitalinovation.personapi.mapper;

import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthday", source = "birthday", dateFormat = "dd-MM-yyyy");
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
