package entities.dto;

import entities.HotelClientContract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class ContractsDTO {
    private List<HotelClientContract> contracts;
}
