package pranay.springframework.sfgpetclinicstart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
