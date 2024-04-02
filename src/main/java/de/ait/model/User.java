package de.ait.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//Или так: @EqualsAndHashCode(exclude = {"name", "email"})

public class User {
    @EqualsAndHashCode.Include
    private Long id;
    private final String name;
    private final String email;
}