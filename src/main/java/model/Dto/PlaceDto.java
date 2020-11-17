package model.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDto {

    private Long id;

    private String name;

    private String description;

    private String phoneNumber;

    private String street;

    private String streetNumber;

    private String zipCode;

    private String townName;
}
