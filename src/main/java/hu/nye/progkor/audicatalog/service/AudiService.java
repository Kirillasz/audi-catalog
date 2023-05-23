package hu.nye.progkor.audicatalog.service;

import hu.nye.progkor.audicatalog.data.model.Audi;

import java.util.List;

public interface AudiService {
    Audi createAudi(Audi audi);
    Audi retvieveAudiById(Long id);
    List<Audi> retrieveAllAudi();
    Audi updateAudi(Audi audi);
    void deleteAudiById(Long id);
}
