package com.example.caveagazouz.bo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


@RequiredArgsConstructor
@NoArgsConstructor
@Document
public class Avis {

    @Id
    private String id;

    @NonNull
    @Field
    private String auteur;

    @NonNull
    @Field
    private Date date;

    @NonNull
    @Field
    private String commentaire;

}
