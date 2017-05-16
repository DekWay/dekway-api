package sn.dialibah.localisation.dao.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import sn.dialibah.localisation.dao.entities.LocalisationEntity;

/**
 * Created by nureynisow on 08/05/2017.
 * for DekWay
 */
public interface LocalisationRepository extends PagingAndSortingRepository<LocalisationEntity, String> {

}
