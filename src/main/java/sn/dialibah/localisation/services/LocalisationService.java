package sn.dialibah.localisation.services;

import sn.dialibah.localisation.model.Localisation;

import java.util.List;

/**
 * Created by nureynisow on 18/04/2017.
 * for DekWay
 */
public interface LocalisationService {

    /**
     * Get all adresses from database
     *
     * @return all {@link Localisation}
     */
    List<Localisation> getAllLocalisations();

    /**
     * Add localisation
     *
     * @param localisation object
     * @return saved localisation
     */
    Localisation addLocalisation(Localisation localisation, String username);
}
