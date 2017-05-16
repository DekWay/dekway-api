package sn.dialibah.localisation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by nureynisow on 18/04/2017.
 * for DekWay
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Localisation {

    private float latitude;

    private float longitude;

    private String label;

    private String description;

    private String postBy;

    private LocalDateTime lastModificationDate;
}
