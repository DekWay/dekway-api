package sn.dialibah.localisation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import sn.dialibah.localisation.model.Localisation;
import sn.dialibah.localisation.services.LocalisationService;

import java.util.List;

/**
 * Created by nureynisow on 18/04/2017.
 * for DekWay
 */
@RestController
@RequestMapping("localisation")
public class LocalisationController {

    @Autowired
    private LocalisationService localisationService;

    @GetMapping()
    public ResponseEntity<List<Localisation>> getAllLocalisations() {
        final List<Localisation> localisations = null;
        this.localisationService.getAllLocalisations();
        return new ResponseEntity<>(localisations, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Localisation> addLocalisation(@RequestBody final Localisation localisation) {
        final SecurityContext securityContex = SecurityContextHolder.getContext();
        return new ResponseEntity<>(localisationService.addLocalisation(
                localisation,
                securityContex.getAuthentication().getPrincipal().toString()),
                HttpStatus.OK);
    }
}
