package model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.room.specifications.RoomStandard;
import model.room.specifications.RoomType;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {

    private Long id;

    private RoomStandard standard;

    private RoomType roomType;

    private Double price;

    private Long placeId;
}
