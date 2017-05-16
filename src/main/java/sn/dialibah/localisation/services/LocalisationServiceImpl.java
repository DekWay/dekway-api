package sn.dialibah.localisation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import sn.dialibah.localisation.dao.entities.LocalisationEntity;
import sn.dialibah.localisation.dao.repositories.LocalisationRepository;
import sn.dialibah.localisation.model.Localisation;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by nureynisow on 18/04/2017.
 * for DekWay
 */
@Configuration
public class LocalisationServiceImpl implements LocalisationService {

    @Autowired
    private LocalisationRepository localisationRepository;

    @Override
    public List<Localisation> getAllLocalisations() {
        return null;
    }

    @Override
    public Localisation addLocalisation(final Localisation localisation, final String username) {
        final LocalDateTime now = LocalDateTime.now();

        final LocalisationEntity localisationEntity = modelToEntity(localisation);
        localisationEntity.setPostBy(username);
        localisationEntity.setLastModificationDate(now);

        return entityToModel(localisationRepository.save(localisationEntity));
    }

    private LocalisationEntity modelToEntity(final Localisation model) {
        return LocalisationEntity.builder()
                .label(model.getLabel())
                .description(model.getDescription())
                .latitude(model.getLatitude())
                .longitude(model.getLongitude())
                .lastModificationDate(model.getLastModificationDate())
                .postBy(model.getPostBy())
                .build();
    }

    private Localisation entityToModel(final LocalisationEntity entity) {
        return Localisation.builder()
                .label(entity.getLabel())
                .description(entity.getDescription())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .lastModificationDate(entity.getLastModificationDate())
                .postBy(entity.getPostBy())
                .build();
    }
}
