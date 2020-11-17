package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Dto.TownDto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Towns {

    private List<TownDto> towns;
}
