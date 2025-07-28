package ru.practicum.main_service.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.MainCommonUtils;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class NewUserRequest {

    @Email
    @NotBlank
    @Size(min = MainCommonUtils.MIN_LENGTH_USER_EMAIL, max = MainCommonUtils.MAX_LENGTH_USER_EMAIL)
    String email;

    @NotBlank
    @Size(min = MainCommonUtils.MIN_LENGTH_USER_NAME, max = MainCommonUtils.MAX_LENGTH_USER_NAME)
    String name;
}
