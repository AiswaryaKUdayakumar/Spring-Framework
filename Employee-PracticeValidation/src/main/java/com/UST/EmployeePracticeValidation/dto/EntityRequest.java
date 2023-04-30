package com.UST.EmployeePracticeValidation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityRequest {

    @NotNull(message = "id should not be null")
    private Long id;
    @NotBlank(message = "name required")
    @NotNull
    private String name;
    @Min(24)
    @Max(42)
    private int age;
    private String designation;

}

