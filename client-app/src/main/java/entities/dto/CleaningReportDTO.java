package entities.dto;

import entities.CleaningReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public final class CleaningReportDTO {
    private List<CleaningReport> reports;
}
