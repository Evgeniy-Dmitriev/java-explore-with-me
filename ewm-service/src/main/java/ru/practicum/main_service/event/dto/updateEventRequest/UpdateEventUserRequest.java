package ru.practicum.main_service.event.dto.updateEventRequest;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.event.enums.StateActionUser;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(builderMethodName = "userBuilder")
public class UpdateEventUserRequest extends UpdateEventRequest {
    StateActionUser stateAction;
}
