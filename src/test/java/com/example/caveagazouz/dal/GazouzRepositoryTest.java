package com.example.caveagazouz.dal;

import com.example.caveagazouz.bo.Gazouz;
import com.example.caveagazouz.bo.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class GazouzRepositoryTest {

    @Autowired
    private GazouzRepository gazouzRepository;

    @Test
    @DisplayName("test d'un ajout d'un gazouz")
    public void ajoutGazouz() {
        // AAA

        //ARRANGE
        Gazouz gazouz = new Gazouz("Selecto", 2025);
        gazouz.setRegion(new Region("Hamoud"));

        //Act
        Gazouz gazouz2 = gazouzRepository.save(gazouz);

        //ASSERT


        Optional<Gazouz> optionalGazouz = gazouzRepository.findById(gazouz2.getId());
        assertTrue(optionalGazouz.isPresent());
        assertNotNull(optionalGazouz.get().getRegion());


    }

    @Test
    @DisplayName("test ajout gazouz deja existant")
    public void ajoutGazouzDejaExistant() {

        //Arrange
        Gazouz gazouz = new Gazouz("Selecto", 2025);
        Gazouz gazouz2 = new Gazouz("Selecto", 2025);

        //Act
        gazouzRepository.save(gazouz);
        gazouzRepository.save(gazouz2);

        //Assert
        assertTrue(gazouzRepository.existsById(gazouz2.getId()));

        //Act

    }


}
