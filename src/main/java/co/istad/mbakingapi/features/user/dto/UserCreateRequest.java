package co.istad.mbakingapi.features.user.dto;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public record UserCreateRequest(
        @NotNull
        @Max(9999)
        @Positive
        Integer pin,

        @NotBlank
        @Size(max = 20)
        String phoneNumber,

        @NotBlank
        String password,

        @NotBlank
        String confirmedPassword,

        @NotBlank
        @Size(max = 40)
        String name,

        @NotBlank
        @Size(max = 6)
        String gender,

        @NotNull
        LocalDate dob,

        @NotBlank
        @Size(max = 20)
        String nationalCardId,

        @Size(max = 20)
        String studentIdCard,

        //list objects

        @NotEmpty
        List<RoleRequest> roles



//        @NotNull
//        @Max(9999)
//        Integer pin,
//        @NotBlank
//                @Size(max = 20)
//        String phoneNumber,
//        @NotBlank
//
//        String password,
//        @NotBlank
//        String confirmPassword,
//
//        @NotBlank
//        @Size(max = 40)
//        String name,
//
//        String gender,
//            LocalDate dob,
//        @NotNull
//        @Size(max = 20)
//        String nationalCardId,
//        @Size(max = 20)
//        String studentIdCard

) {
}