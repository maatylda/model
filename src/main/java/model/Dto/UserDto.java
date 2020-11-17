package model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String password;
}
