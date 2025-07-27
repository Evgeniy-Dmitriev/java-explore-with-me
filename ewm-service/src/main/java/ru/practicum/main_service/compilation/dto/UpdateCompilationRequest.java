package ru.practicum.main_service.compilation.dto;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.MainCommonUtils;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UpdateCompilationRequest {
    @Size(min = MainCommonUtils.MIN_LENGTH_COMPILATION_TITLE, max = MainCommonUtils.MAX_LENGTH_COMPILATION_TITLE)
    String title;

    Boolean pinned;
    List<Long> events;
}
