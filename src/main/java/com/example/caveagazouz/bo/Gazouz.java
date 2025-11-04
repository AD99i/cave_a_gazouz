package com.example.caveagazouz.bo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.lang.annotation.Inherited;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "GAZOUZS")
public class Gazouz {
    @Id
    private String id;

    @NonNull
    @Field
    @Indexed(unique = true)
    private String nom;

    @NonNull
    @Field
    private Integer millesime;

    private Region region;

    private Couleur couleur;
}
