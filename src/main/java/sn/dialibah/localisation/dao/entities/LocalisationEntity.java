package sn.dialibah.localisation.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Created by nureynisow on 01/05/2017.
 * for DekWay
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Localisation")
@Builder
public class LocalisationEntity {

    @Id
    private String id;

    private float latitude;

    private float longitude;

    private String label;

    private String description;

    private String postBy;

    private LocalDateTime lastModificationDate;
}
