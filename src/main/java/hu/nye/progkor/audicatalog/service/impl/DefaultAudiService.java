package hu.nye.progkor.audicatalog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.nye.progkor.audicatalog.data.model.Audi;
import hu.nye.progkor.audicatalog.data.repository.Repository;
import hu.nye.progkor.audicatalog.service.AudiService;


import java.util.List;
@Service
public class DefaultAudiService  implements AudiService {

    private final Repository<Audi, Long> audiRepository;
    @Autowired
    public DefaultAudiService(Repository<Audi, Long> audiRepository) {
        this.audiRepository = audiRepository;
    }


    @Override
    public Audi createAudi(Audi audi) {
        return audiRepository.save(audi);
    }

    @Override
    public Audi retvieveAudiById(Long id) {
        return audiRepository.getById(id);
    }

    @Override
    public List<Audi> retrieveAllAudi() {
        return audiRepository.getAll();
    }

    @Override
    public Audi updateAudi(Audi audi) {
        return audiRepository.update(audi);
    }

    @Override
    public void deleteAudiById(Long id) {
        audiRepository.deleteById(id);
    }
}


