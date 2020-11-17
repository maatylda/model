package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Dto.PlaceDto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Places {

    private List<PlaceDto> places;
}
