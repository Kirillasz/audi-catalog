package hu.nye.progkor.audicatalog.web;

import hu.nye.progkor.audicatalog.data.model.Audi;
import hu.nye.progkor.audicatalog.service.AudiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/audis")
public class AudiCatalogRestController {
    private final AudiService audiService;

    @Autowired
    public AudiCatalogRestController(AudiService audiService) {
        this.audiService = audiService;
    }

    //CRUD
    @GetMapping("/{id}")
    public Audi getAudiById(@PathVariable Long id) {
        return audiService.retvieveAudiById(id);
    }

    @GetMapping
    public List<Audi> getAllAudi() {
        return audiService.retrieveAllAudi();
    }

    @PostMapping
    public Audi createAudi(@RequestBody Audi audi) {
        return audiService.createAudi(audi);
    }

    @PutMapping
    public Audi updateAudi(@RequestBody Audi audi) {
        return audiService.updateAudi(audi);
    }

    @DeleteMapping("/{id}")
    public void deleteAudiByID(@PathVariable Long id) {
        audiService.deleteAudiById(id);
    }
}
