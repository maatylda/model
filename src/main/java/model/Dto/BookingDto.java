package model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    private Long id;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private String userEmail;

    private Long placeId;

    private Long roomId;

    private Double price;

    private boolean paid;
}
