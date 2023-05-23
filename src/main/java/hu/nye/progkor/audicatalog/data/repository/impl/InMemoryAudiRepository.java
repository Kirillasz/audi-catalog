package hu.nye.progkor.audicatalog.data.repository.impl;

import hu.nye.progkor.audicatalog.data.repository.Repository;
import hu.nye.progkor.audicatalog.data.model.Audi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryAudiRepository implements Repository<Audi, Long> {
    private static final Map<Long, Audi> STORAGE = new HashMap<>();

    @Override
    public Audi save(Audi item) {
        Long id = STORAGE.size() + 1L;
        item.setId(id);
        STORAGE.put(id, item);
        return STORAGE.get(id);
    }

    @Override
    public Audi getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Audi> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Audi update(Audi audi) {
        Long id = audi.getId();
        STORAGE.put(id,audi);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);

    }
}
